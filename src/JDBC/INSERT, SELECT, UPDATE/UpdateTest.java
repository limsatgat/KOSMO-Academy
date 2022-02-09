package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateTest {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String pass = "tiger";

		try {
		// 1. 드라이버 메모리에 로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		// 2. 연결 객체 얻어오기
		Connection con = DriverManager.getConnection(url,user, pass);
		System.out.println("DB 연결 성공");
		
		int empno = 7788;
		String job = "개발";
		int sal = 8000;
		
		String sql = "UPDATE emp set job=?, sal = ? WHERE empno = ?";
		System.out.println(sql);
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, job);
		ps.setInt(2, sal);
		ps.setInt(3, empno);
		ps.executeUpdate();
		
		// 6. 닫기
		ps.close();
		con.close();
		} catch(Exception ex) {
			System.out.println("예외:" + ex.getMessage());
		}
	}
}
