package com.dao;

import java.util.List;

import com.model.User;

public interface UserDAO {

	boolean loginValidated(User user);

	void addUser(User user);

	List<User> loadAll();

	boolean searchUser(int uid);

	String deleteUser(int uid);

	String updateUser(int uid, User user);
}
