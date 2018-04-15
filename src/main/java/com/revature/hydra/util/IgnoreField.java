package com.revature.hydra.util;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Used to specify fields which should be ignored.
 * 
 * @author Ricky Baker (1802-Matt)
 * @see ReflectionUtils
 */
@Documented
@Retention(RUNTIME)
@Target(FIELD)
public @interface IgnoreField {
}
