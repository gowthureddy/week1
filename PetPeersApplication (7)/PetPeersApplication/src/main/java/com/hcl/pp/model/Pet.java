package com.hcl.pp.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "PETTABLE")
public class Pet {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;
	@Column(name = "pet_Name")
	private String name;
	@Column(name = "pet_Age")
	private int age ;
	@Column(name="pet_place")
	private String place;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "PET_OWNERID",nullable=true)
	private User user;


	public Pet() {
		super();
	}

	public Pet(String name, int age, String place) {
		super();
		this.name = name;
		this.age = age;
		this.place = place;
	}

	public Pet(long id, String name, int age, String place, User user) {
		super();
		Id = id;
		this.name = name;
		this.age = age;
		this.place = place;
		this.user = user;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public User getUser() {
		return user;
	}

	public Pet(User user) {
		super();
		this.user = user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
