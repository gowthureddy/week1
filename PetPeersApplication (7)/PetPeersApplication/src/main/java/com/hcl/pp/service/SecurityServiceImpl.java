package com.hcl.pp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.pp.dao.UserDao;
import com.hcl.pp.model.User;

@Service
public class SecurityServiceImpl implements SecurityService{

	@Autowired
	private UserDao userDao;
	@Transactional
	@Override
	public int authenticateUser(String userName,String userPassword) {
		return userDao.authenticateUser(userName,userPassword);
		
	}

}
