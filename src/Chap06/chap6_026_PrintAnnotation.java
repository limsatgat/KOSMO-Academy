package Chap06;

import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface chap6_026_PrintAnnotation {
	String value() default "-";
	int number() default 15;

	
}
