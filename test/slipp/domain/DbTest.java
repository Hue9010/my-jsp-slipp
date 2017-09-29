package slipp.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class DbTest {

	@Test
	public void addAndFind() {
		User user = new User("id1", "ps1", "name1", "name1@email.com");
		Db.addUser(user);
		
		User dbUser = Db.findByUserId(user.getUserId());
		assertEquals(user, dbUser);
	}
	
	public void addAndFindWhenNotExisted() {
		User dbUser = Db.findByUserId("userId2");
		assertNull(dbUser);
	}
}
