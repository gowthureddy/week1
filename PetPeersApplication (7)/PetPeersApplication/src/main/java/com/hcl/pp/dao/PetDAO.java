package com.hcl.pp.dao;

import java.util.List;

import com.hcl.pp.model.Pet;
import com.hcl.pp.model.User;

public interface PetDAO {
	abstract Pet getPetById(long pet_id);
	abstract void savePet(Pet pet);
	abstract List<Pet> fetchAll(User user);

}
