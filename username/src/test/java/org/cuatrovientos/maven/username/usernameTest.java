package org.cuatrovientos.maven.username;

import junit.framework.TestCase;

public class usernameTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testUserNameStringString() {
		fail("Not yet implemented");
	}

	public void testUserName() {
		UserName target = new UserName();
		String exceptedName = "";
		String actualName = target.getName();
		
		assertEquals("Testing default cons.", exceptedName, actualName);
	}

}
