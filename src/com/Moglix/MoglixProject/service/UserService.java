package com.Moglix.MoglixProject.service;

import com.Moglix.MoglixProject.dto.User;

public interface UserService {
   public String addUser(User user);
	public String updateUserById(String userId, User user);

	public User getUserById(String userId);

	public User[] getUsers();

	public String deleteUserByUserId(String userId);

	public String deleteAllUser();
}
