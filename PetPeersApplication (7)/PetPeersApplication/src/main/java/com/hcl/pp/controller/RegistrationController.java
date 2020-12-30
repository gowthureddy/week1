package com.hcl.pp.controller;

import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.pp.dao.UserDao;
import com.hcl.pp.model.Pet;
import com.hcl.pp.model.User;
import com.hcl.pp.service.PetService;
import com.hcl.pp.service.SecurityService;
import com.hcl.pp.service.UserService;
import com.hcl.pp.service.UserServiceImpl;

@Controller
public class RegistrationController {

	@Autowired
	private UserService userService;
	@Autowired
	private PetService petService;
	@Autowired
	private SecurityService securityService;

	@RequestMapping(value = "/")
	public ModelAndView main(@ModelAttribute User user) {
		return new ModelAndView("registration");
	}

	/*@RequestMapping(value = "/pet/add")
	public String addpet(@ModelAttribute Pet pet, @RequestParam("name") String name, @RequestParam("age") int age,
		@RequestParam("place") String place) {
		petService.savePet(pet);
		return "success";
	}
*/
	@RequestMapping(value = "/user/logout")
	public ModelAndView logout(@ModelAttribute User user) {
		return new ModelAndView("login");
	}

	@RequestMapping(value = "/add")
	public ModelAndView addingpet(@ModelAttribute User user) {
		return new ModelAndView("pet_form");
	}

	@RequestMapping(value = "/user/login")
	public ModelAndView login(@ModelAttribute User user) {
		return new ModelAndView("login");
	}

	@RequestMapping(value = "/user/registration")
	public String registration(@ModelAttribute User user) {
		return "registration";
	}

	@RequestMapping(value = "/user/add")
	public String addUser(@ModelAttribute User user) {
		try {
			userService.addUser(user);
			return "login";
		} catch (Exception e) {
			return "Failure";
		}
	}

	@RequestMapping(value = "/user/authenticate")
	public ModelAndView authenticateUser(@RequestParam("username") String name,
			@RequestParam("userPassword") String password) {
		int status = securityService.authenticateUser(name, password);
		if (status == 1)
			return new ModelAndView("pet_home");
		else
			return new ModelAndView("login");
	}

	@RequestMapping(value = "/pets")
	public ModelAndView petHome(@ModelAttribute User user,@ModelAttribute Pet pet, Model model) {
		List<Pet> petObj = petService.getAllPets(user);
		model.addAttribute("key", petObj);
		for (Pet pet2 : petObj) {
			System.out.println(pet2.getPlace());
		}
		return new ModelAndView("my_pets");

	}
	@RequestMapping(value="pet/add")
	public ModelAndView myPets(@ModelAttribute Pet pet) {
		System.out.println(pet.getName());
		System.out.println(pet.getPlace());
		System.out.println(pet.getAge());
        petService.savePet(pet);
        return new ModelAndView("my_pets");
          
    }
	

	
}
