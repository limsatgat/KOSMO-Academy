package z_info;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.text.AbstractDocument.AbstractElement;;

public class Database {

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	String user = "scott";
	String pass = "tiger";

	public Database() throws ClassNotFoundException {
		// 1. 드라이버 로딩
		Class.forName(driver);
	}

	public void insert(InfoVO vo) throws Exception{
		Connection con = null;
		PreparedStatement ps = null;

		try {

			// 2. 연결객체 얻어오기
			con = DriverManager.getConnection(url,user,pass);
			System.out.println("DB 연결 성공");

			// 3. sql 문장 만들기
			String sql = "INSERT INTO info_test(name, id, tel, sex, age, home) " 
					+ " VALUES(?, ?, ?, ?, ?, ?)";

			// 4. 전송객체 얻어오기
			ps = con.prepareStatement(sql);
			ps.setString(1, vo.getName());
			ps.setString(2, vo.getId());
			ps.setString(3, vo.getTel());
			ps.setString(4, vo.getSex());
			ps.setInt(5, vo.getAge());
			ps.setString(6, vo.getHome());

			// 5. 전송
			int result = ps.executeUpdate();
			System.out.println(result +"행 수행");


		} finally {

			// 6. 닫기
			ps.close();
			con.close();	
		}

	}


	public void modify(InfoVO vo) throws Exception{
		Connection con = null;
		PreparedStatement ps = null;

		try {

			// 2. 연결객체 얻어오기
			con = DriverManager.getConnection(url,user,pass);

			// 3. sql 문장 만들기 <-------
			String sql = "UPDATE info_test SET name=?, id=?, sex=?, age=?, home=?   "
					+ "  WHERE tel=?";

			// 4. 전송객체 얻어오기 <------- ?에 값 지정하는 부분
			ps = con.prepareStatement(sql);
			ps.setString(1, vo.getName());
			ps.setString(2, vo.getId());
			ps.setString(3, vo.getId());
			ps.setInt(4, vo.getAge());
			ps.setString(5, vo.getId());
			ps.setString(6, vo.getId());

			// 5. 전송
			int result = ps.executeUpdate();
			System.out.println(result +"행 수행");


		} finally {

			// 6. 닫기
			ps.close();
			con.close();	
		}

	}
	
	public InfoVO searchByTel(String tel) throws Exception{
		InfoVO vo = new InfoVO();
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {


			//2. 연결객체 얻어오기
			con = DriverManager.getConnection(url, user, pass);
			System.out.println("DB연결성공");

			//3. sql 문장
			String sql = "SELECT * FROM info_test WHERE tel=?";		//tel=? tel 컬럼에 있는 내용으로 검색해서! 내용들을 가져오겠다!
			//4. 전송객체 얻어오기 - PreparedStatement
			ps = con.prepareStatement(sql);
			ps.setString(1, tel);
			System.out.println("전화번호:" + tel + "/");
			
			//5. 전송 - executeQuery();
			rs = ps.executeQuery();
			//6. 결과처리

			if(rs.next()) {				// if 가지고있는 값이 있니 없니
				vo.setName( rs.getString("NAME"));
				vo.setId( rs.getString("ID"));
				vo.setTel( rs.getString("Tel"));
				vo.setSex( rs.getString("SEX"));
				vo.setAge( rs.getInt("AGE"));
				vo.setHome( rs.getString("HOME"));
				System.out.println("결과:" + rs.getString("NAME"));
			}
		}finally {
			//7. 닫기 - finally 구문으로 빼기
			rs.close();
			ps.close();
			con.close();
		}
		return vo;

	}
	
	public InfoVO searchById(String id) throws Exception{
		InfoVO vo = new InfoVO();
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			System.out.println("넘겨받은 전화번호:" + id);

			//2. 연결객체 얻어오기
			con = DriverManager.getConnection(url, user, pass);
			System.out.println("DB연결성공");

			//3. sql 문장
			String sql = "SELECT * FROM info_test WHERE trim(id)=?";		//tel=? tel 컬럼에 있는 내용으로 검색해서! 내용들을 가져오겠다!
			//4. 전송객체 얻어오기 - PreparedStatement
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			
			//5. 전송 - executeQuery();
			rs = ps.executeQuery();
			//6. 결과처리

			if(rs.next()) {				// if 가지고있는 값이 있니 없니
				vo.setName( rs.getString("NAME"));
				vo.setId( rs.getString("ID"));
				vo.setTel( rs.getString("Tel"));
				vo.setSex( rs.getString("SEX"));
				vo.setAge( rs.getInt("AGE"));
				vo.setHome( rs.getString("HOME"));
				System.out.println("결과:" + rs.getString("NAME"));
			}
		}finally {
			//7. 닫기 - finally 구문으로 빼기
			rs.close();
			ps.close();
			con.close();
		}
		return vo;

	}

	public int delete(String tel) throws Exception{
		int result = 0;
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
		//2.연결객체 얻어오기
		con = DriverManager.getConnection(url, user, pass);
		
		//3. sql 문장 만들기
		String sql = "DELETE FROM info WHERE tel=?";
		
		//4. 전송객체 얻어오기
		ps = con.prepareStatement(sql);
		ps.setString(1, tel);
		
		//5. 전송
		result = ps.executeUpdate();
		
		}finally {			
			//6.닫기
			ps.close(); 
			con.close();
		}
	
		return result;
	}
	
	
		
		public ArrayList<InfoVO> selectAll() throws Exception{
		
			ArrayList<InfoVO> list = new ArrayList<InfoVO>();
			Connection con = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
		
			try {
			con = DriverManager.getConnection(url,user,pass);
		
			//3
			String sql = "SELECT * FROM INFO_TEST";
			
			//4
			ps = con.prepareStatement(sql);
			
			//5
			rs = ps.executeQuery();
			
			while(rs.next()) {
				InfoVO vo = new InfoVO();
				vo.setName(rs.getString("NAME"));
				vo.setId(rs.getString("ID"));
				vo.setTel(rs.getString("TEL"));
				vo.setSex(rs.getString("SEX"));
				vo.setAge(rs.getInt("AGE"));
				vo.setHome(rs.getString("HOME"));
				list.add(vo);
			}
			
		} finally {
			rs.close();
			ps.close();
			con.close();
		}
		return list;
	}
}
