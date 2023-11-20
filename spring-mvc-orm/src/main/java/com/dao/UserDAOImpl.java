package com.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.model.User;

@Service
public class UserDAOImpl implements UserDAO {

	@Autowired
	private AppDAO dao;

	List<User> userList = new ArrayList<>();

	@Override
	public boolean loginValidated(User user) {
		boolean check = userList.stream().anyMatch(
				x -> x.getUsername().equals(user.getUsername()) && x.getPassword().equals(user.getPassword()));
		if (check)
			return true;
		return false;
	}

	@Override
	public void addUser(User user) {
		dao.save(user);
	}

	@Override
	public List<User> loadAll() {
		return (List<User>) dao.findAll();
	}

	@Override
	public boolean searchUser(int uid) {
		return dao.findById(uid).isPresent();
	}

	@Override
	public String deleteUser(int uid) {
		List<User> list = (List<User>) dao.findAll();

		String sql = "delete from user where username=?";
		for (int i = 0; i < list.size(); i++)
			if (userList.get(i).getUid() == uid) {
				dao.deleteById(uid);
				return "User deleted";
			}
		return "User not found";
	}

	@Override
	public String updateUser(int uid, User user) {
		for (int i = 0; i < userList.size(); i++)
			if (userList.get(i).getUid()==uid) {
				userList.set(i, user);
				return "User updated";
			}
		return "User not found";
	}
}
