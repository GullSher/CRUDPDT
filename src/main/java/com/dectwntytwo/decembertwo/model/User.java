package com.dectwntytwo.decembertwo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;

/* Created By Gull Shair Dec 2022 */
@Entity
public class User {
	@Id
	@GeneratedValue
//@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String username;
	private String name;
	private String Email;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

}
