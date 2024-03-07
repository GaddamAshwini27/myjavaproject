package com.example.entities;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import antlr.collections.List;

@Entity
public class Author {
	int aut_id;
	String aut_name;
	String aut_subject;
	String aut_qualification;
	
	@ManyToOne
	Author author;
	
	@ManyToOne
	WrittenBy writtenBy;
	
	public Author() {}

	public Author(int aut_id, String aut_name, String aut_subject, String aut_qualification, Author author,
			WrittenBy writtenBy) {
		super();
		this.aut_id = aut_id;
		this.aut_name = aut_name;
		this.aut_subject = aut_subject;
		this.aut_qualification = aut_qualification;
		this.author = author;
		this.writtenBy = writtenBy;
	}

	public int getAut_id() {
		return aut_id;
	}

	public void setAut_id(int aut_id) {
		this.aut_id = aut_id;
	}

	public String getAut_name() {
		return aut_name;
	}

	public void setAut_name(String aut_name) {
		this.aut_name = aut_name;
	}

	public String getAut_subject() {
		return aut_subject;
	}

	public void setAut_subject(String aut_subject) {
		this.aut_subject = aut_subject;
	}

	public String getAut_qualification() {
		return aut_qualification;
	}

	public void setAut_qualification(String aut_qualification) {
		this.aut_qualification = aut_qualification;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public WrittenBy getWrittenBy() {
		return writtenBy;
	}

	public void setWrittenBy(WrittenBy writtenBy) {
		this.writtenBy = writtenBy;
	}
	
	
}