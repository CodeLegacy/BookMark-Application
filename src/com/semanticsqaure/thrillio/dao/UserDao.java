package com.semanticsqaure.thrillio.dao;

import com.semanticsquare.thrillio.DataStore;
import com.semanticsquare.thrillio.entities.User;

public class UserDao {

	public User[] getUsers() {
		return DataStore.getUsers();
	}
}
