package com.hcl.pp.service;

import java.util.List;

import com.hcl.pp.model.Pet;
import com.hcl.pp.model.User;

public interface UserService {
	public abstract void addUser(User user);
	public abstract void updateUser(User user);
	public List<User> listUsers();
	public abstract User getUserById(long id);
	public abstract User findByUserName(String userName);
	public abstract void removeUser(long id);
	public abstract void buyPet(Pet pet);
	public abstract List<Pet> getMyPet(User user);
}
