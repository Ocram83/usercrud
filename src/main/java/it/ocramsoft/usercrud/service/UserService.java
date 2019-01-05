package it.ocramsoft.usercrud.service;

import java.util.List;

import it.ocramsoft.usercrud.exception.UserNotFoundException;
import it.ocramsoft.usercrud.model.User;

public interface UserService {

	public void saveUser(User user);

	public void updateUser(User user)throws UserNotFoundException;

	public List<User> retrieveUserList();

	public User getUser(Long userId) throws UserNotFoundException;

	public void deleteUser(Long userId) throws UserNotFoundException;

}
