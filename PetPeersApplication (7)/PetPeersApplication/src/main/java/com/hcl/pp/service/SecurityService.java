package com.hcl.pp.service;

import com.hcl.pp.model.User;

public interface SecurityService {
	int authenticateUser(String userName,String userPassword);


}
