package slipp.domain;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import slipp.support.JdbcTemplate;
import slipp.support.PreparedStatementSetter;
import slipp.support.RowMapper;

public class UserDAO {

	public void addUser(User user) throws SQLException {
		PreparedStatementSetter pss = new PreparedStatementSetter() {
			@Override
			public void setParameters(PreparedStatement pstmt) throws SQLException {
				pstmt.setString(1, user.getUserId());
				pstmt.setString(2, user.getPassword());
				pstmt.setString(3, user.getName());
				pstmt.setString(4, user.getEmail());
			}
		};

		JdbcTemplate template = new JdbcTemplate();
		String sql = "insert into USERS values(?,?,?,?)";
		template.executeUpdate(sql, pss);
	}

	public User findByUserId(String userId) throws SQLException {
		PreparedStatementSetter pss = new PreparedStatementSetter() {

			@Override
			public void setParameters(PreparedStatement pstmt) throws SQLException {
				pstmt.setString(1, userId);
			}
		};
		RowMapper rm = new RowMapper() {
			@Override
			public Object mapRow(ResultSet rs) throws SQLException {
				return new User(rs.getString("userId"), rs.getString("password"), rs.getString("name"),
						rs.getString("email"));
			}
		};

		JdbcTemplate template = new JdbcTemplate();
		String sql = createQuery();
		return (User) template.executeQuery(sql, pss, rm);
	}

	private String createQuery() {
		return "SELECT * FROM USERS where userId = ?";
	}

	public void removeUser(String userId) throws SQLException {
		PreparedStatementSetter pss = new PreparedStatementSetter() {
			@Override
			public void setParameters(PreparedStatement pstmt) throws SQLException {
				pstmt.setString(1, userId);
			}
		};

		String sql = "delete from USERS where userId = ?";
		JdbcTemplate template = new JdbcTemplate();
		template.executeUpdate(sql, pss);
	}

	public void userUpdateUser(User user) throws SQLException {
		PreparedStatementSetter pss = new PreparedStatementSetter() {
			@Override
			public void setParameters(PreparedStatement pstmt) throws SQLException {
				pstmt.setString(1, user.getPassword());
				pstmt.setString(2, user.getName());
				pstmt.setString(3, user.getEmail());
				pstmt.setString(4, user.getUserId());
			}
		};
		String sql = "update USERS set password = ?, name = ?, email = ? where userId = ?";
		JdbcTemplate template = new JdbcTemplate();
		template.executeUpdate(sql, pss);
	}
}
