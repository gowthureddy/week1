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
public class PetDAOImpl implements PetDAO {
	private static final Logger logger =LoggerFactory.getLogger(PetDAOImpl.class);
    @Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	@Override
	public Pet getPetById(long pet_id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Pet pet = (Pet) session.load(Pet.class, new Long(pet_id));
		logger.info("Pet details are fetched successfully, Pet details="+pet);
		return pet;
	}

	@Override
	public void savePet(Pet pet) {
		Session session = this.sessionFactory.getCurrentSession();
		/*pet.setOwnerid(user.getUserId());*/
		session.save(pet);
		session.persist(pet);
	}

	@Override
	public List<Pet> fetchAll(User user) 
	{
		Session session = this.sessionFactory.getCurrentSession();
		List<Pet> petList = session.createQuery("from Pet").list();
		return petList;
	}
}
