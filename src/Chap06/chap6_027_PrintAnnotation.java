package Chap06;					// 어노테이션 정의		// p.274 재확인

//@Target({ElementType.METHOD})
//@Retention(RetentionPolicy.RUNTIME)
public @interface chap6_027_PrintAnnotation {
	String value() default "-";
	int number() default 15;

}
