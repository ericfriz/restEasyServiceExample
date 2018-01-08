package com.example.dataaccess.po;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.persistence.core.model.po.PersistentObject;

@Entity
@Table(name = "USER")
public class User implements PersistentObject {

	private static final long serialVersionUID = 3898748126983835095L;

	@Id
	@Column(name = "id")
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "surname")
	private String surname;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "age")
	private int age;
	
	public User (String name, String surname, String address, int age){
		this.name = name;
		this.surname = surname;
		this.address = address;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
		
}
