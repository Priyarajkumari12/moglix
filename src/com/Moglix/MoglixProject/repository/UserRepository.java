package com.Moglix.MoglixProject.repository;

import com.Moglix.MoglixProject.dto.User;

public interface UserRepository {
	public String addUser(User user);

	public String updateUserById(String userId, User user);

	public User getUserById(String userId);

	public User[] getUsers();

	public String deleteUserByUserId(String userId);

	public String deleteAllUser();
}
