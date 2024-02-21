package pro01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConnectTest {
    public static void main(String[] args) {
        // JDBC 연결 정보
        String url = "jdbc:mysql://localhost:3306/SubwayInformation"; // 데이터베이스 URL
        String username = "root"; // MySQL 사용자명
        String password = "12345678"; // MySQL 비밀번호

        // JDBC 연결
        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            if (conn != null) {
                System.out.println("MySQL 데이터베이스에 성공적으로 연결되었습니다.");
                // 여기서부터 원하는 작업을 수행합니다.
            } else {
                System.out.println("MySQL 데이터베이스 연결에 실패했습니다.");
            }
        } catch (SQLException e) {
            System.err.println("MySQL 데이터베이스 연결 중 오류가 발생했습니다.");
            e.printStackTrace();
        }
    }
}
