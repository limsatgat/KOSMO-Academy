package Chap06;					// ������̼� ����

import java.lang.reflect.Method;

public class chap6_026_PrintAnnotationExample {

	public static void main(String[] args) {
		//Service Ŭ�����κ��� �޼ҵ� ������ ����
		Method[] declaredMethods = chap6_026_Service.class.getDeclaredMethods();
		//Method ��ü�� �ϳ��� ó��
		for(Method method : declaredMethods) {
			//PrintAnnotation�� ����Ǿ����� Ȯ��
			if(method.isAnnotationPresent(chap6_026_PrintAnnotation.class)) {
				//PrintAnnotation ��ü ���
				chap6_026_PrintAnnotation printAnnotation = method.getAnnotation(chap6_026_PrintAnnotation.class);
				
				//�޼ҵ� �̸� ���
				System.out.println("[" + method.getName() + "] ");
				//���м� ���
				for(int i=0; i<printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}
				System.out.println();
				
				try {
					//�޼ҵ� ȣ��
					method.invoke(new chap6_026_Service());
				} catch (Exception e) {}
				System.out.println();
			}
		}
	}

}
