package Chap02;					// byte Ÿ�� ����2

public class chap2_004_GarbageValueExample {

	public static void main(String[] args) {
		byte var1 = 125;
		int var2 = 125;
		for(int i=0; i<5; i++)	{														// for �ݺ���
			var1++;
			var2++;
			System.out.println("var1: " + var1 + "\t" + "var2: " + var2);				// \t�� tab��ŭ ĭ ����ִ� ����
		}

	}

}
