package Chap10;					// 예외처리	//자동 리소스 닫기

public class chap10_010_FileInputStream implements AutoCloseable {
	private String file;
	
	public chap10_010_FileInputStream(String file) {
		this.file = file;
	}
	
	public void read() {
		System.out.println(file + "을 읽습니다.");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println(file + "을 닫습니다.");
	}

}
