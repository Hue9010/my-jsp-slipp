package slipp.domain;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;

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
	public void test() {
		Connection con = userDao.getConnection();
		assertNotNull(con);
	}
	
	@Test
	public void crud() throws SQLException {
		User user = UserTest.user;
		userDao.addUser(UserTest.user);
		
		User dbUser = userDao.findByUserId(user.getUserId());
		assertEquals(UserTest.user,dbUser);
		
		User updateUser = new User(user.getUserId(), "uPassword", "update_name", "update_email");
		userDao.userUpdateUser(updateUser);
		dbUser = userDao.findByUserId(user.getUserId());
		assertEquals(dbUser,updateUser);
	}
	
	@Test
	public void 존재하지_않는_사용자_조회() throws Exception{
		User user = UserTest.user;
		userDao.removeUser(user.getUserId());
		
		User dbUser = userDao.findByUserId(user.getUserId());
		assertNull(dbUser);
	}
}
