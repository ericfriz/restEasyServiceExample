package com.example.service.request;

import com.example.model.core.to.TypeObject;

@SuppressWarnings("serial")
public class RestRequestTO<T> implements TypeObject {

	private T input;

	public RestRequestTO() {
		super();
	}

	public T getInput() {
		return input;
	}

	public void setInput(T input) {
		this.input = input;
	}

}
