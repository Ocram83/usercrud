package it.ocramsoft.usercrud.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public UserNotFoundException()
	{
		super();
	}
	
	public UserNotFoundException(String message)
	{
		super(message);
	}
	
	public UserNotFoundException(Throwable cause)
	{
		super(cause);
	}
	
	public UserNotFoundException(String message,Throwable cause)
	{
		super(message, cause);
	}

}
