/**
 * 
 */
package org.cuatrovientos.userlist;

import java.util.Vector;

/**
 * @author PC
 *
 */
public class UserList {

	private Vector<User> list;

	/**
	 * iniciar el vector
	 */
	public UserList() {
		list = new Vector<User>();
	}
	
	
	/**
	 * @return the list
	 */
	public Vector<User> getList() {
		return list;
	}


	/**
	 * @param list the list to set
	 */
	public void setList(Vector<User> list) {
		this.list = list;
	}


	public void addUser (User user)  {
		list.add(user);
	}
	
	public int userAt (User user) {
		for (int i = 0; i < list.size();i++) {
			if (list.elementAt(i).getName().equals(user.getName())) {
				return i;
			}
		}
		return -1;
	}
	
	public void deleteUser(User user) {
		for (int i = 0; i < list.size();i++) {
			if (list.elementAt(i).getName().equals(user.getName())) {
			list.removeElementAt(i);
			return;
	}
}
}
}