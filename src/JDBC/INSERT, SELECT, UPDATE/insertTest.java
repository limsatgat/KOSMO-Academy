package basic;

import java.sql.*;

public class insertTest {

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
			//String sql = "INSERT INTO emp(empno, ename, job)  "
			//		+ "VALUES(9911, '둘리', '개발')";
			// "9911 사원의 월급 9000, 부서번호는 30으로 입력하기";
			//  String sql = "UPDATE emp SET sal=9000, deptno=30 WHERE empno =9911";
					   
			// 이름이 둘리인 사원을 삭제
			String sql = "DELETE FROM emp WHERE ename= '둘리'";
			  
					  
			// 4. SQL 전송객체 얻어괴
			// Statement : 완벽한 쿼리
			// PreparedStatment (*) : 주로 사용
			// CallableStatement : pl-sql의 함수를 호출
			PreparedStatement ps = con.prepareStatement(sql);
			
			// 5. 전송 ( 3번에서 만들기할 때 )
			//		- int executeUpadate() : INSERT, UPDATE, DELETE 인 경우에 사용
			//		- ResultSet executeQuery() : SELECT 인 경우에 사용
			int result = ps.executeUpdate();
			System.out.println(result + "행을 실행");
			
			// 6. 닫기
			ps.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 못 찾음 : " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("DB관련 에러 : " + e.getMessage());
		}

	}
	

}
