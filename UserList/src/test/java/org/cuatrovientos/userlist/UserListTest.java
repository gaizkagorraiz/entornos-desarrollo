package org.cuatrovientos.userlist;

import junit.framework.TestCase;

public class UserListTest extends TestCase {

	public void setUp() throws Exception {
		super.setUp();
	}

	public void tearDown() throws Exception {
		super.tearDown();
	}

	public void testUserList() {
		UserList target = new UserList();
		assertNotNull("Check list null",target.getList());
	}

	
	public void testUserAt() {
		UserList list = new UserList();
		User user1 = new User("Gaizka","Gorraiz");
		list.addUser(user1);
		
		int target = list.userAt(user1);
		int excepted = 0;
		
		assertEquals("User at", target, excepted);
	}

	public void testDeleteUser() {
		UserList list = new UserList();
		User user1 = new User("Gaizka","Gorraiz");
		list.addUser(user1);
		
		list.deleteUser(user1);
		int target = list.userAt(user1);
		int excepted = -1;
		assertEquals("User delete user", target, excepted);

	}

}
