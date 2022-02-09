package z_info;

import java.sql.*;

public class Database {

	String driver = "oracle.jdbc.driver.OracleDriver";		// oracle6 파일의 경로
	String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";		// IP 및 로컬호스트
	String user = "scott";		//오라클 계정
	String pass = "tiger";		//계정 비밀번호
	private Object ts;
	
	public Database () throws ClassNotFoundException {
		// 1. 드라이버 로딩
		Class.forName(driver);
	}
	
	public infoVO searchByTel(String tel) throws Exception {		// 예외가 던져진 상황, catch가 없어도 try, finally 가능
		// void -> 리턴을 위해 infoVO 로 변경 , 
		infoVO vo1 = new infoVO();
		Connection conn = null;			//연결 객체
		PreparedStatement ps = null;	
		
		// 2. 연결객체 얻어오기
		conn = DriverManager.getConnection(url,user,pass);
		System.out.println("DB 연결 성공");
		
		// 3. SQL 문장
		String sql = "Select * from info_test WHERE tel=?";
		
		// 4. 전송객체 얻오기 - PreparedStatemnet
		ps = conn.prepareStatement(sql);
		ps.setString(1, tel);
		
		// 5. 전송 - executeQuery()
		ResultSet rs = ps.executeQuery();
		
		// 6. 결과처리
		if(rs.next()) {
			String name = rs.getString("name");
			String ID = rs.getString("ID");
			String SEX = rs.getString("sex");
			int age = rs.getInt("age");
			String home = rs.getString("home");
			System.out.println(name + "/" + ID + "/" + SEX + "/" + age);
			
			vo1.setAge(age);
			vo1.setHome(home);
			vo1.setId(ID);
			vo1.setName(name);
			vo1.setSex(SEX);
			}
		// 7. 닫기 
			rs.close();
			ps.close();
			conn.close();
			
	
		return vo1;
	}
}
				
  		/*
		Connection conn = null;			//연결 객체
		PreparedStatement ps = null;	
		
		try {
			
		// 2. 연결객체 얻어오기
		conn = DriverManager.getConnection(url,user,pass);
		System.out.println("DB 연결 성공");
		
		// 3. sql 문장 만들기 (인자의 값을 ? 로 설정)
		String sql = "INSERT INTO info_test(name, id, tel, sex, age, home) "  
				+ " VALUES (? , ? , ? , ? , ? , ?)";
		
		// 4. 전송객체 얻어오기
		ps = conn.prepareStatement(sql);
		ps.setString(1, vo1.getName());		// 저장타입 (순서, get호출 객체)
		ps.setString(2, vo1.getId());
		ps.setString(3, vo1.getTel());
		ps.setString(4, vo1.getSex());
		ps.setInt(5, vo1.getAge());
		ps.setString(6, vo1.getHome());
			
		// 5. 전송
		int result = ps.executeUpdate();
		System.out.println(result + "행 수행");
		
		} finally {
		
		// 6. 닫기
		 ps.close();
		 conn.close();
		
	}
}
}
*/