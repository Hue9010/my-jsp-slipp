package slipp.domain;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

public class UserDAOTest {
	private UserDAO userDao;
	
	@Before
	public void setup() {
		userDao = new UserDAO();
	}
	
	@Test
	public void test() {
		Connection con = userDao.getConnection();
		assertNotNull(con);
	}
	
	@Test
	public void insert() throws SQLException {
//		userDao.addUser(UserTest.user);
	}
	
	@Test
	public void findByUser() throws Exception{
		User user = userDao.findByUserId("testID2");
		assertEquals(UserTest.user,user);
	}
}
