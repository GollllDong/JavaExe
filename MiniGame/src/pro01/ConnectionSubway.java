package pro01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConnectionSubway {
	// MySQL 데이터베이스 연결 정보
	String url = "jdbc:mysql://192.168.0.28:3306/SubwayInformation";
	String username = "root";
	String password = "12345678";
	static Connection conn = null;
	private static int line_number;

	public static void main(String[] args) {
		initConnection();
		getConnection();
//        		selectList2();
//        		selectList3();
//        		selectList4();
		selectList(line_number);
	}

	public static void initConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("class.forName() 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("DB Driver 미설치 및 클래스 이름 오류");
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		try {
			conn = DriverManager.getConnection("jdbc:mysql://192.168.0.28:3306/SubwayInformation", "root", "12345678");
			System.out.println("MySQL 데이터베이스에 성공적으로 연결되었습니다.");
		} catch (SQLException e) {
			System.out.println("DB 연결 오류");
			e.printStackTrace();
		}
		return conn;
	}

	public static ArrayList<String> selectList(int line_number) {

		Scanner sc = new Scanner(System.in);
		System.out.println("호선을 선택하시면 그에 맞는 호선 데이터가 출력됩니다 >> ");
		line_number = sc.nextInt();
		try {
			List<String> selectList = new ArrayList<>();
			String sql = "SELECT station_name FROM station_info WHERE line_number=? ";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, line_number);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) { // db안의 데이터를 전체 가져옴
				StationList station = new StationList();
				station.setStation_name(rs.getString("station_name"));

				selectList.add(rs.getString("station_name"));

			}
			System.out.println(selectList);
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
