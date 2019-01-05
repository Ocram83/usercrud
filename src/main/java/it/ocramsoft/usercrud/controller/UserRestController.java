package it.ocramsoft.usercrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import it.ocramsoft.usercrud.exception.UserNotFoundException;
import it.ocramsoft.usercrud.model.User;
import it.ocramsoft.usercrud.service.UserService;

@Api(value = "/")
@RestController
@RequestMapping(value = "/api")
public class UserRestController {

	@Autowired
	private UserService userService;

	@PostMapping("/user")
	public void saveUser(User user) {
		userService.saveUser(user);
	}

	@ApiOperation(value = "Finds all users on db", notes = "No pagination implemented", response = User.class, responseContainer = "List")
	@GetMapping("/user")
	public List<User> getUsers() {
		List<User> users = userService.retrieveUserList();
		return users;
	}

	@ApiOperation(value = "Finds user by id", response = User.class)
	@ApiResponses(value = { @ApiResponse(code = 404, message = "User not found")})
	@GetMapping("/user/{userId}")
	public User getUser(@PathVariable(name = "userId") Long userId) throws UserNotFoundException {
		return userService.getUser(userId);
	}

	@ApiOperation(value = "Delete user by id", response = User.class)
	@ApiResponses(value = { @ApiResponse(code = 404, message = "User not found")})
	@DeleteMapping("/user/{userId}")
	public void deleteUser(@PathVariable(name = "userId") Long userId) throws UserNotFoundException {
		userService.getUser(userId);
		//Exceptin would be throwed if no user is found
		userService.deleteUser(userId);
	}

	@ApiOperation(value = "Update user with id", response = User.class)
	@ApiResponses(value = { @ApiResponse(code = 404, message = "User not found")})
	@PutMapping("/user/{userId}")
	public void updateUser(@RequestBody User user, @PathVariable(name = "userId") Long userId)
			throws UserNotFoundException {
		userService.getUser(userId);
		//Exceptin would be throwed if no user is found
		userService.updateUser(user);

	}

}
