package com.example.dataaccess.dao.exception;

public class DaoException  extends RuntimeException {

	private static final long serialVersionUID = 8786490199447702970L;

	public DaoException(String message) {
		super(message);
	}

	public DaoException(String message, Exception ex) {
		super(message, ex);
	}
}
