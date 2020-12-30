package com.hcl.pp.service;

import java.util.List;
import java.util.Set;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.pp.dao.PetDAO;
import com.hcl.pp.dao.PetDAOImpl;
import com.hcl.pp.model.Pet;
import com.hcl.pp.model.User;

@Service
public class PetServiceImpl implements PetService {
	@Autowired
	private PetDAO petDao;

	@Transactional
	@Override
	public void savePet(Pet pet) {
		petDao.savePet(pet);
	}
	
    @Transactional
	@Override
	public List<Pet> getAllPets(User user) {
		List<Pet> pets=petDao.fetchAll(user);
		return pets;
	}
	

}
