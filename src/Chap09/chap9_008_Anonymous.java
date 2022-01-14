package Chap09;					// 익명객체	// 익명 자식 객체 생성

public class chap9_008_Anonymous {
	//필드 초기값으로 대입
	chap9_008_Person field = new chap9_008_Person()	{						// 필드 선언과 초기값 대입
		void work()	{
			System.out.println("씻고 출근합니다.");
		}
		@Override
		void wake()	{
			System.out.println("7시에 일어납니다.");
			work();
		}
	};
	
	void method1()	{
		//로컬 변수값으로 대입
		chap9_008_Person localVar = new chap9_008_Person()	{				// 로컬 변수 선언과 초기값 대입
			void walk()	{
				System.out.println("퇴근합니다.");
			}
		@Override
		void wake()	{
			System.out.println("17시에 마쳤습니다.");
			walk();
		}
		};
		//로컬 변수 사용
		localVar.wake();
	}
	
	void method2(chap9_008_Person person) {
		person.wake();
	}
}
