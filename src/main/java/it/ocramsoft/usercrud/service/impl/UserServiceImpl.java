package it.ocramsoft.usercrud.service.impl;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.ocramsoft.usercrud.exception.UserNotFoundException;
import it.ocramsoft.usercrud.model.User;
import it.ocramsoft.usercrud.repository.UserRepository;
import it.ocramsoft.usercrud.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void saveUser(User user) {
		userRepository.save(user);
	}

	@Override
	public void updateUser(User user) {
		userRepository.save(user);		
	}

	@Override
	public List<User> retrieveUserList() {
		return userRepository.findAll();
	}

	@Override
	public User getUser(Long userId) throws UserNotFoundException {
		Optional<User> optionalUser = userRepository.findById(userId);
		try {
			return optionalUser.get();
		} catch (NoSuchElementException e) {
			throw new UserNotFoundException("No user found with id "+userId);
		}
	}

	@Override
	public void deleteUser(Long userId) throws UserNotFoundException  {
		userRepository.deleteById(userId);		
	}

}
