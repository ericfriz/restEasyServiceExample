package com.example.service.response;

import java.util.List;

import com.example.model.core.to.TypeObject;
import com.example.service.request.UserRequestTO;

public class UserResponseTO implements TypeObject {

	private static final long serialVersionUID = -3597954691712390691L;

	private List<UserRequestTO> users;

	public UserResponseTO() {
		super();
	}

	public List<UserRequestTO> getUsers() {
		return users;
	}

	public void setUsers(List<UserRequestTO> users) {
		this.users = users;
	}

}
