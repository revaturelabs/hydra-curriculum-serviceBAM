package com.revature.hydra.util;

import java.lang.reflect.Field;
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
	 * @param <T> The lowest common class of 
	 * @param a The object to compare to {@code b}.
	 * @param b The object to compare to {@code a}.
	 * @return {@literal true} if all fields of {@code a} and {@code b} are equal. Otherwise, {@literal false}.
	 * @since 2.0
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
                
                try {
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
                } catch (IllegalArgumentException | IllegalAccessException ex) {}
                
                return fieldIsEqual;
            });
        }
        
        return isEqual;
    }
}
