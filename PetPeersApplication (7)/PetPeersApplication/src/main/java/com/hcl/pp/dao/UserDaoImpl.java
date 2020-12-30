package com.hcl.pp.dao;

import java.util.List;

import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcl.pp.model.Pet;
import com.hcl.pp.model.User;
@Repository
public class UserDaoImpl implements UserDao{
	private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);
@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public void addUser(User user) {
		Session session = sessionFactory.getCurrentSession();
		session.persist(user);
		
		logger.info("User data saved successfully, User Details="+user);
		
	}

	@Override
	public void updateUser(User user) {
		Session session = sessionFactory.getCurrentSession();
		session.update(user);
		logger.info("User details updated successfully, User Details="+user);		
	}

	@Override
	public List<User> listUsers() {
		Session session = this.sessionFactory.getCurrentSession();
		List<User> userList = session.createQuery("from User").list();
		for(User user : userList){
			logger.info("User List::"+user);
		}
		return userList;
	}

	@Override
	public User getUserById(long id) {
		Session session = this.sessionFactory.getCurrentSession();		
		User user = (User) session.load(User.class, new Long(id));
		logger.info("User loaded successfully, User details="+user);
	
		return user;
	}

	@Override
	public User findByUserName(String userName) {
		Session session = this.sessionFactory.getCurrentSession();		
		User user = (User) session.load(User.class, new String(userName));
		logger.info("User loaded successfully, User details="+user);
		
		return user;
	}

	@Override
	public void removeUser(long id) {
		Session session = this.sessionFactory.getCurrentSession();
		User user = (User) session.load(User.class, new Long(id));
		if(null != user){
			session.delete(user);
		}
		logger.info("User deleted successfully, User details="+user);
	}
		

	@Override
	public int authenticateUser(String username, String userPassword) {
		int status=0;
		Session session = this.sessionFactory.getCurrentSession();
		String hql="from User as u where u.username=:n and u.userPassword=:p";
		Query query=session.createQuery(hql);
		query.setParameter("n", username);
		query.setParameter("p",userPassword);
		List list=((org.hibernate.query.Query) query).list();
		if((list!=null)&&(list.size()>0))
		{
			status=1;
		}
		return status;
		
	}

	@Override
	public void buyPet(Pet pet) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(pet);		
	}

	@Override
	public List<Pet> getMyPet(User user) {
		Session session = this.sessionFactory.getCurrentSession();
		List<Pet> petList = session.createQuery("from Pet").list();
		if(petList.isEmpty())
		{
			logger.info("No pets are owned by "+user.getUsername());
		}
		else
		{
		for(Pet pet  : petList){
			logger.info("pet List::"+pet.getName());
		}
		}
		return petList;
	}

	
}
