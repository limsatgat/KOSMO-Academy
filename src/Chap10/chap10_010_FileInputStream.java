package Chap10;					// ����ó��	//�ڵ� ���ҽ� �ݱ�

public class chap10_010_FileInputStream implements AutoCloseable {
	private String file;
	
	public chap10_010_FileInputStream(String file) {
		this.file = file;
	}
	
	public void read() {
		System.out.println(file + "�� �н��ϴ�.");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println(file + "�� �ݽ��ϴ�.");
	}

}
