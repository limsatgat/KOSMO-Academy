package Chap06;					// 어노테이션 적용

import java.lang.reflect.Method;

public class chap6_027_PrintAnnotationExample {

	public static void main(String[] args) {
		//Service 클래스로부터 메소드 정보를 얻음
		Method[] declaredMethods = chap6_027_Service.class.getDeclaredMethods();
		//Method 객체를 하나씩 처리
		for(Method method : declaredMethods) {
			//PrintAnnotation이 적용되었는지 확인
			if(method.isAnnotationPresent(chap6_027_PrintAnnotation.class)) {
				//PrintAnnotation 객체 얻기
				chap6_027_PrintAnnotation printAnnotation = method.getAnnotation(chap6_027_PrintAnnotation.class);
				
				//메소드 이름 출력
				System.out.println("[" + method.getName() + "] ");
				//구분석 출력
				for(int i=0; i<printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}
				System.out.println();
				
				try {
					//메소드 호출
					method.invoke(new chap6_027_Service());
				} catch (Exception e) {}
				System.out.println();
			}
		}
	}

}
