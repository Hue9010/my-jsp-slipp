package slipp.domain;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class UserDAOTest {
	private UserDAO userDao;

	@Before
	public void setup() throws SQLException {
		userDao = new UserDAO();
		userDao.removeUser(UserTest.user.getUserId());
	}

	@Test
	public void crud() throws SQLException {
		User user = UserTest.user;
		userDao.addUser(UserTest.user);

		User dbUser = userDao.findByUserId(user.getUserId());
		assertEquals(UserTest.user, dbUser);

		User updateUser = new User(user.getUserId(), "uPassword", "update_name", "update_email");
		userDao.userUpdateUser(updateUser);
		dbUser = userDao.findByUserId(user.getUserId());
		assertEquals(dbUser, updateUser);
	}

	@Test
	public void 존재하지_않는_사용자_조회() throws Exception {
		User user = UserTest.user;
		userDao.removeUser(user.getUserId());

		User dbUser = userDao.findByUserId(user.getUserId());
		assertNull(dbUser);
	}

	@Test
	public void findUsers() throws Exception {
		List<User> users = userDao.findUsers();
		assertTrue(users.size() > 0);
		System.out.println("Users : " + users);
	}
}
