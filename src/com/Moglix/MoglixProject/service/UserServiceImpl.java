package com.Moglix.MoglixProject.service;

import com.Moglix.MoglixProject.dto.User;
import com.Moglix.MoglixProject.repository.UserRepository;
import com.Moglix.MoglixProject.repository.UserRepositoryImpl;

public class UserServiceImpl implements UserService {
	UserRepository userRepository = UserRepositoryImpl.getInstance();
	private static UserService userService;

	private UserServiceImpl() {
	}

	public static UserService getInstance() {
		if (userService == null) {
			userService = new UserServiceImpl();
			return userService;
		} else
			return userService;
	}

	@Override
	public String updateUserById(String userId, User user) {
		return userRepository.updateUserById(userId, user);
	}

	@Override
	public User getUserById(String userId) {
		return userRepository.getUserById(userId);
	}

	@Override
	public User[] getUsers() {
		return userRepository.getUsers();
	}

	@Override
	public String deleteUserByUserId(String userId) {
		return userRepository.deleteUserByUserId(userId);
	}

	@Override
	public String deleteAllUser() {
		return userRepository.deleteAllUser();
	}

	@Override
	public String addUser(User user) {
		return userRepository.addUser(user);
	}

}
