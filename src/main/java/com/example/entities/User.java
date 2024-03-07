package com.example.entities;

import java.util.ArrayList;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import antlr.collections.List;

public class User {

	private int userid;
	private String name;
	private int mobileNo;
	private String Place;

	@ManyToOne
	User user;

	@ManyToOne
	Issue issue;

	public User() {
	}

	public User(int userid, String name, int mobileNo, String place) {
		super();
		this.userid = userid;
		this.name = name;
		this.mobileNo = mobileNo;
		Place = place;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPlace() {
		return Place;
	}

	public void setPlace(String place) {
		Place = place;
	}

}
