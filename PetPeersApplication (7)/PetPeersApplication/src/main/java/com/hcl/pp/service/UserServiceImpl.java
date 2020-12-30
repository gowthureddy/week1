package com.hcl.pp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.pp.dao.UserDao;
import com.hcl.pp.model.Pet;
import com.hcl.pp.model.User;

@Service("UserService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Transactional
	@Override
	public void addUser(User user) {
		userDao.addUser(user);
	}

	@Transactional
	@Override
	public void updateUser(User user) {
		userDao.updateUser(user);

	}

	@Transactional
	@Override
	public List<User> listUsers() {
		return userDao.listUsers();

	}

	@Transactional
	@Override
	public User getUserById(long id) {
		return userDao.getUserById(id);
	}

	@Transactional
	@Override
	public User findByUserName(String userName) {
		return userDao.findByUserName(userName);
	}

	@Transactional
	@Override
	public void removeUser(long id) {
		userDao.removeUser(id);
	}

	@Transactional
	@Override
	public void buyPet(Pet pet) {
		userDao.buyPet(pet);
	}

	@Transactional
	@Override
	public List<Pet> getMyPet(User user) {
		return userDao.getMyPet(user);
	}

}
