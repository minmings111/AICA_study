package app.labs.ex05.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionEx {

	public static void main(String[] args) {
		// 1. database 종류
		// 2. database 위치
		// 3. 계정
		// 4. 사용할 database 객체

		String jdbc = "oracle.jdbc.driver.OracleDriver"; // 정해진거라 맘대로 바꾸는 것이 아님.
		String url = "jdbc:oracle:thin:@localhost:1521/xepdb1"; // 서버가 외부에 있으면 localhost 대신 ip 주소 쓰기
		String uid = "SCOTT";
		String pwd = "TIGER";
		
		// 5. connection with database
		try {
			Class.forName(jdbc);
			
			Connection conn = DriverManager.getConnection(url, uid, pwd);
			
			// 6. SQL 전송
			Statement stmt = conn.createStatement();
			
			// 7. SQL문 생성
			String sql = "select * from dept";
			
			// 8. SQL 실행 -> 결과를 메모리로 가져오기
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				
				System.out.println(deptno + ", "+ dname + ", " + loc);
			}
			
			rs.close();
			stmt.close();
			conn.close(); // 열었던 역순으로. 닫는 순서 중요함.
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
