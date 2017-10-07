package slipp.domain;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import slipp.support.jdbc.JdbcTemplate;
import slipp.support.jdbc.PreparedStatementSetter;
import slipp.support.jdbc.RowMapper;

public class UserDAO {

	public void addUser(User user) {

		JdbcTemplate template = new JdbcTemplate();
		String sql = "insert into USERS values(?,?,?,?)";
		template.executeUpdate(sql, user.getUserId(), user.getPassword(), user.getName(), user.getEmail());
	}

	public User findByUserId(String userId) {
		RowMapper<User> rm = new RowMapper<User>() {
			@Override
			public User mapRow(ResultSet rs) throws SQLException {
				return new User(rs.getString("userId"), rs.getString("password"), rs.getString("name"),
						rs.getString("email"));
			}
		};

		JdbcTemplate template = new JdbcTemplate();
		String sql = createQuery();
		return template.executeQuery(sql, rm, userId);
	}

	private String createQuery() {
		return "SELECT * FROM USERS where userId = ?";
	}

	public void removeUser(String userId) {
		String sql = "delete from USERS where userId = ?";
		JdbcTemplate template = new JdbcTemplate();
		template.executeUpdate(sql, userId);
	}

	public void userUpdateUser(User user) {
		String sql = "update USERS set password = ?, name = ?, email = ? where userId = ?";
		JdbcTemplate template = new JdbcTemplate();
		template.executeUpdate(sql, user.getPassword(), user.getName(), user.getEmail(), user.getUserId());
	}

	public List<User> findUsers() {
		RowMapper<User> rm = new RowMapper<User>() {
			@Override
			public User mapRow(ResultSet rs) throws SQLException {
				return new User(rs.getString("userId"), rs.getString("password"), rs.getString("name"),
						rs.getString("email"));
			}
		};

		JdbcTemplate template = new JdbcTemplate();
		String sql = "SELECT * FROM USERS";
		return template.list(sql, rm);
	}
}
