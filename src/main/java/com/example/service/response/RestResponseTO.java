package com.example.service.response;

import java.util.ArrayList;
import java.util.List;

import com.example.model.core.to.TypeObject;


public class RestResponseTO implements TypeObject {

	private static final long serialVersionUID = 6857749668182548292L;

	private ArrayList<String> errorCodes;
	private Object output;

	public RestResponseTO(ArrayList<String> errorCodes,Object output) {
		super();
		this.errorCodes = errorCodes;
		this.output = output;
	}

	public RestResponseTO() {
		super();
		this.errorCodes = new ArrayList<String>();
	}

	public List<String> getErrorCodes() {
		return errorCodes;
	}

	public void setErrorCodes(ArrayList<String> errorCodes) {
		this.errorCodes = errorCodes;
	}

	public Object getOutput() {
		return output;
	}

	public void setOutput(Object output) {
		this.output = output;
	}

}
