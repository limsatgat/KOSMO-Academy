package Chap06;					// ������̼� ����		// p.274 ��Ȯ��

//@Target({ElementType.METHOD})
//@Retention(RetentionPolicy.RUNTIME)
public @interface chap6_027_PrintAnnotation {
	String value() default "-";
	int number() default 15;

}
