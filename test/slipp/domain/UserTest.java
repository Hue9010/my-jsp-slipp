package slipp.domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import slipp.exception.UserNotFoundException;
import slipp.exception.passwordMissMatchException;

public class UserTest {

	public static User user = new User("testID2", "ps", "TEST2", "TEST2@email.com");
	
	@Test
	public void matchPassword() {
		assertTrue(user.matchPassword("ps1"));
	}
	
	@Test
	public void notMatchPassword() {
		assertFalse(user.matchPassword("ps2"));
	}
	
//	@Test
//	public void login() throws Exception{
//		Db.addUser(user);
//		User.login(user.getUserId(), user.getPassword());
//	}
//	
//	@Test(expected=UserNotFoundException.class)
//	public void loginWhenNotExistedUser() throws Exception{
//		Db.addUser(user);
//		User.login("id2", user.getPassword());
//	}
//	
//	@Test(expected=passwordMissMatchException.class)
//	public void paswordMissMatch() throws Exception{
//		Db.addUser(user);
//		User.login(user.getUserId(), "ps233");
//	}

}
