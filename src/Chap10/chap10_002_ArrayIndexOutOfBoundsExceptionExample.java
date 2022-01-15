package Chap10;					// 예외처리		// 인덱스 범위 초과 에러

public class chap10_002_ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {
		/*
		String data1 = args[0];
		String data2 = args[1];
		
		System.out.println("args[0]: " + data1);
		System.out.println("args[1]: " + data2);
		
	}
}		*/

		if(args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];
			System.out.println("args[0]: " + data1);
			System.out.println("args[1]: " + data2);
		} else {
			System.out.println("[실행 방법]");
			System.out.print("java ArrayIndexOutOfBoundsExceptionExample  ");
			System.out.print("값1  값2");
		}
	}
}


// Run as → Run Configurations → Arguments 값 부여