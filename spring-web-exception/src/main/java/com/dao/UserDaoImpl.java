package com.dao;

import org.springframework.stereotype.Service;

import com.model.User;
import com.model.Users;

@Service
public class UserDaoImpl implements UserDao {

	private static Users list = new Users();

	static {
		list.getUsers().add(new User(1, "SOM", "Som@mail.com", "Delhi"));
		list.getUsers().add(new User(2, "ANA", "Ana@mail.com", "LA"));
		list.getUsers().add(new User(3, "Paul", "Paul@mail.com", "NY"));
	}

	@Override
	public Users getAllUsers() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public void addUser(User user) {
		list.getUsers().add(user);
	}
}
