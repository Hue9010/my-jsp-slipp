package slipp.domain;

import java.util.HashMap;
import java.util.Map;

public class Db {
	private static Map<String, User> users = new HashMap<>();
	
	public static void addUser(User user) {
		users.put(user.getUserId(), user);
	}

	public static User findByUserId(String userId) {
		return users.get(userId);
	}
}
