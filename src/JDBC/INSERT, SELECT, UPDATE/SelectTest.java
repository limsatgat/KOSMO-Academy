package basic;

import java.sql.*;

public class SelectTest {
	String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	String user = "scott";
	String pass = "tiger";
	
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String pass = "tiger";
		
		
		try {
			// 1. 드라이버 메모리에 로딩
						Class.forName("oracle.jdbc.driver.OracleDriver");
						
			// 2. 연결 객체 얻어오기
			Connection con = DriverManager.getConnection(url,user,pass);
			System.out.println("DB 연결 성공");
				
			// 3. SQL 만들기
			String sql = "SELECT ename, sal+nvl(comm,0) total_sal, job FROM emp";
						
			// 4. SQL 전송객체 얻어괴
			// Statement : 완벽한 쿼리
			// PreparedStatment (*) : 주로 사용
			// CallableStatement : pl-sql의 함수를 호출
			PreparedStatement ps = con.prepareStatement(sql);
						
			// 5. 전송하기
			ResultSet rs = ps.executeQuery();
						
			// 6. 결과처리
			while(rs.next()) {
				String ename = rs.getString("ENAME");
				int tot = rs.getInt("TOTAL_SAL");
				String job = rs.getString("JOB");
				System.out.println( ename + "/" + tot + "/" + job);
			}
						
			// 7. 닫기
			rs.close();
			ps.close();
			con.close();
								
		}catch(Exception ex){
			System.out.println("실패 :" + ex.getMessage());
		}
	}

}
