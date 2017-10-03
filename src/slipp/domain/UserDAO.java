package slipp.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
	public Connection getConnection() {
		String url = "jdbc:mysql://localhost:3306/slipp";
		String id = "slippUser";
		String pw = "pass";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(url, id, pw);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	public void addUser(User user) throws SQLException {
		String sql = "insert into USERS values(?,?,?,?)";
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getUserId());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getName());
			pstmt.setString(4, user.getEmail());

			pstmt.executeUpdate();
		} catch (SQLException e) {
		} finally {
			if (pstmt != null) {
				pstmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
	}

	public User findByUserId(String userId) throws SQLException {

		String sql = "SELECT * FROM USERS where userId = ?";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);

			rs = pstmt.executeQuery();

			if (!rs.next()) {
				return null;
			}
			return new User(rs.getString("userId"), rs.getString("password"), rs.getString("name"),
					rs.getString("email"));
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
	}

	public void removeUser(String userId) throws SQLException {
		String sql = "delete from USERS where userId = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);

			pstmt.executeUpdate();
		} catch (SQLException e) {
		} finally {
			if (pstmt != null) {
				pstmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
	}

	public void userUpdateUser(User user) throws SQLException {
		String sql = "update USERS set password = ?, name = ?, email = ? where userId = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getPassword());
			pstmt.setString(2, user.getName());
			pstmt.setString(3, user.getEmail());
			pstmt.setString(4, user.getUserId());

			pstmt.executeUpdate();
		} catch (SQLException e) {
		} finally {
			if (pstmt != null) {
				pstmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
	}
}
