package com.example.service.request;

import com.example.model.core.to.TypeObject;

public class UserRequestTO implements TypeObject {

	private static final long serialVersionUID = 2899941128525018617L;

	private String name;
    private String surname;
    
    
	public UserRequestTO() {
		super();
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
	
	
}
