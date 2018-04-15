package com.revature.hydra.util;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.List;

/**
 * A utility class possessing methods for performing actions using reflection.
 * 
 * @author Ricky Baker (1802-Matt)
 * @version 2.0
 */
public final class ReflectionUtils {
	
	/**
	 * Performs an overall equality test by testing each field of {@code a} to the respective field of {@code b}.
	 * 
	 * @param <T> The type of {@code a} and {@code b}.
	 * @param a The object to compare to {@code b}.
	 * @param b The object to compare to {@code a}.
	 * @return {@literal true} if all fields of {@code a} and {@code b} are equal. Otherwise, {@literal false}.
	 * @since 2.0
	 * 
	 * @author Ricky Baker (1802-Matt)
	 */
	public static <T> boolean testEquality(final T a, final T b) {
        boolean isEqual;
        
        if(a == b) { // Both null or refer to the same item.
            isEqual = true;
        } else if(a == null || b == null) { // Either are null (cannot be both).
            isEqual = false;
        } else if(!a.getClass().equals(b.getClass())) { // Not of the same lowest-level class.
            isEqual = false;
        } else { // Test each field for equality via the field's equals() method.
            List<Field> fieldList = Arrays.asList(a.getClass().getFields());
            
            isEqual = fieldList.stream().allMatch(field -> {
                boolean fieldIsEqual = false;
                
                try { // attempt direct access.
                    field.setAccessible(true);
                    
                    Object aField = field.get(a);
                    Object bField = field.get(b);
                    
                    if(aField == null) {
                        fieldIsEqual = (bField == null);
                    } else if(bField == null) { // a non-null, b null
                        fieldIsEqual = false;
                    } else { // Test equality with  aField's custom equals().
                        fieldIsEqual = aField.equals(bField);
                    }
                } catch (IllegalArgumentException | IllegalAccessException ex) {
                	// Attempt getter access.
                }
                
                return fieldIsEqual;
            });
        }
        
        return isEqual;
    }
	
	
	/**
	 * Performs a direct copy of any non-null fields in {@code from} to {@code to}.
	 * This copy is shallow and only copies fields of the most specific class.
	 * 
	 * @param to The destination to copy the fields from {@code to} to.
	 * @param from	The source object to copy fields from.
	 * @return {@code to}
	 * @throws IllegalArgumentException Thrown when {@code to} and {@code from} are not the same class.
	 */
	public static <T> T shallowCopyNonNullFieldsDirect(final T to, final T from) throws IllegalArgumentException {
		if(!to.getClass().equals(from.getClass())) {
			MessageFormat fmt = new MessageFormat("{0} ({1}) and {2} ({3}) must be the same class.");
			throw new IllegalArgumentException(fmt.format(new String[] {
				"to", to.getClass().getName(),
				"from", from.getClass().getName()
			}));
		}
		
		List<Field> fields = Arrays.asList(to.getClass().getDeclaredFields());
		
		fields.forEach(field -> {
			if(Modifier.isFinal(field.getModifiers()))
				return; // Ignore final fields.
			
			field.setAccessible(true);
			
			try {
				Object fromField = field.get(from);
				
				if(fromField != null) {
					field.set(to, fromField);
				}
			} catch (IllegalArgumentException | IllegalAccessException e) {}
		});
		
		return to;
	}
}
