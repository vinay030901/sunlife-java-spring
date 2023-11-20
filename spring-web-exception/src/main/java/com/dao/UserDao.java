package com.dao;

import com.model.User;
import com.model.Users;

public interface UserDao {

	Users getAllUsers();

	void addUser(User user);
}
