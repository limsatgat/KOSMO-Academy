package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectTest2 {

	
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String pass = "tiger";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			// 1. 드라이버 메모리에 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. 연결 객체 얻어오기
			con = DriverManager.getConnection(url,user, pass);
			System.out.println("DB 연결 성공");
			
			// 3. SQL 만들기
			String sql = "SELECT * FROM emp WHERE empno=7788";
			
			// 4. SQL 전송객체 얻어오기
			//		Statement 	: 완벽한 쿼리
			//		PreparedStatement (*) : 주로 사용
			//		CallableStatement  :  pl-sql의 함수를 호출할 때
			ps = con.prepareStatement(sql);

			// 5. 전송하기
			rs = ps.executeQuery();
			
			// 6. 결과처리
			if(rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				// 나머지 컬럼도 얻어서 출력 가능
				System.out.println(empno + "/" + ename);
			}			
			
			System.out.println("프로그램 종료");
		}catch(Exception ex) {
			System.out.println("실패 :" + ex.getMessage());
		}finally {
			try {
				rs.close();
				ps.close();
				con.close();
			}catch(Exception ex) { }
		}

	}

}
