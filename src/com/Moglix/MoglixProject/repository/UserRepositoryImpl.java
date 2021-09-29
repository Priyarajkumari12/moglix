package com.Moglix.MoglixProject.repository;

import com.Moglix.MoglixProject.dto.User;

public class UserRepositoryImpl implements UserRepository {
	private static UserRepository userRepository;

	private UserRepositoryImpl() {
	}

	public static UserRepository getInstance() {
		if (userRepository == null) {
			userRepository = new UserRepositoryImpl();
			return userRepository;
		} else {
			return userRepository;
		}
	}

	private static int counter = 0;
	private User users[] = new User[10];

	private int getIndex(String userId) {
		for (int i = 0; i < users.length; i++) {
			if (users[i] != null && users[i].getUserId().equalsIgnoreCase(userId)) {
				return i;
			}
		}
		return -1;

	}

	@Override
	public String addUser(User user) {
		if (counter < users.length) {
			users[counter] = user;
			counter++;
			return "User perssisted successfully";
		} else {
			return "Array is full";
		}
	}

	@Override
	public String updateUserById(String userId, User user) {
		int index = this.getIndex(userId);
		if (index != -1) {
			users[index] = user;
			return "updated Successfully ";
		}
		return "not updated";
	}

	@Override
	public User getUserById(String userId) {
		int index = this.getIndex(userId);
		if (index != -1) {
			return users[index];
		}
		return null;
	}

	@Override
	public User[] getUsers() {
		return users;
	}

	@Override
	public String deleteUserByUserId(String userId) {
		int index = this.getIndex(userId);
		if (index != -1) {
			users[index] = null;
			return "Deleted Successfully";
		}
		return "Not Deleted";
	}

	@Override
	public String deleteAllUser() {
		users = null;
		return "Deleted successfully";
	}

}
