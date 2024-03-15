package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnDefault;

@Entity
public class User {
	@Id
	private int userid;
	private String name;
	private String mobileNo;
	private String place;

	@ColumnDefault("'A'")
	private char record_status = 'A';

	public User() {

	}

	public User(int userid, String name, String mobileNo, String place, char record_status) {
		super();
		this.userid = userid;
		this.name = name;
		this.mobileNo = mobileNo;
		this.place = place;
		this.record_status = record_status;
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

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public char getRecord_status() {
		return record_status;
	}

	public void setRecord_status(char record_status) {
		this.record_status = record_status;
	}

}
