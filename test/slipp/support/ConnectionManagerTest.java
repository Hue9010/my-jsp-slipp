package slipp.support;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Test;

import slipp.support.jdbc.ConnectionManager;

public class ConnectionManagerTest {

	@Test
	public void test() {
		Connection con = ConnectionManager.getConnection();
		assertNotNull(con);
	}
}
