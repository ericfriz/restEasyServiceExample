package com.example.service;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.example.dataaccess.dao.UserDAOJPA;
import com.example.dataaccess.dao.exception.DaoException;
import com.example.dataaccess.po.User;
import com.example.service.exception.RestServiceException;
import com.example.service.request.RestRequestTO;
import com.example.service.request.UserRequestTO;
import com.example.service.response.RestResponseTO;

@RequestScoped
@Path("/user")
public class UserServiceJPA {

	@Inject
	private UserDAOJPA userDAO;

	@POST
	@Path("/all")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	// public RestResponseTO getUsers(@Context HttpServletRequest request,
	// RestRequestTO<UserRequestTO> requestTO)
	public RestResponseTO getUsers(RestRequestTO<UserRequestTO> requestTO) throws RestServiceException {

		RestResponseTO result = new RestResponseTO();

		// List<SecApplicationBO> rtn = new ArrayList<SecApplicationBO>();
		List<User> rtn = new ArrayList<User>();

		try {

			// logger.info("REST: " + className + methodName);

			rtn = userDAO.findAll();
			result.setOutput(rtn);

		} catch (DaoException e) {
			result.getErrorCodes().add(e.getMessage());
		} catch (Exception e1) {
			// this.logger.info("Error in " + methodName + " - " +
			// getClassName());
			// this.logger.error("", e1);
			result.getErrorCodes().add("ERR000");
		}

		return result;
	}

	@POST
	@Path("/search")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public RestResponseTO getUser(RestRequestTO<UserRequestTO> requestTO) throws RestServiceException {
		RestResponseTO result = new RestResponseTO();
		UserRequestTO req = requestTO.getInput();

		List<User> rtn = null;

		try {

			// logger.info("REST: " + className + methodName);

			rtn = userDAO.findUserByName(req.getName());
			result.setOutput(rtn);

		} catch (DaoException e) {
			result.getErrorCodes().add(e.getMessage());
		} catch (Exception e1) {
			// this.logger.info("Error in " + methodName + " - " +
			// getClassName());
			// this.logger.error("", e1);
			result.getErrorCodes().add("ERR000");
		}

		return result;
	}

}