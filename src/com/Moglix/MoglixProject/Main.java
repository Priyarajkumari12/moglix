package com.Moglix.MoglixProject;
import com.Moglix.MoglixProject.dto.Role;
import com.Moglix.MoglixProject.dto.User;
import com.Moglix.MoglixProject.service.RoleService;
import com.Moglix.MoglixProject.service.UserService;
import com.Moglix.MoglixProject.service.UserServiceImpl;
public class Main {

	public static void main(String[] args) {
		UserService userService=UserServiceImpl.getInstance();
		
		User user=new User();
		user.setUserId("U001");
		user.setUserName("Valkayrie");
		user.setUserPassword("X8fd555@");
		user.setEmail("valkayrie@gmail.com");
		user.setRoleId("R001");
		
		//adding new user
		System.out.println(userService.addUser(user));
		
		//get user by userId  U001
		System.out.println(userService.getUserById("U001"));
		
		//update existing user by user id U001
		User user1=new User();
		user1.setUserId("U002");
		user1.setUserName("ValkayrieDemo");
		user1.setUserPassword("X8fd534@");
		user1.setEmail("valkayriedemo@gmail.com");
		user1.setRoleId("R002");
		
		System.out.println(userService.updateUserById("U001", user1));
		
		//getuser by userid U002
		//System.out.println(userService.getUserById("U002"));
		
		//users list
		for(User u :userService.getUsers()) {
			if(u!=null) {
				System.out.println(u);

			}
		}
		
		//delete user by userId U002
		System.out.println(userService.deleteUserByUserId("U002"));
		
//		Role role = new Role();
//		RoleService roleService = new RoleService();
//		role.setRoleID("RL001");
//		role.setRoleName("Engineer");
//		
////		System.out.println(role1.getRoleID());
////		System.out.println(role1.getRoleID());
//
//
//       Role role2 = new Role();
//       role2.setRoleID("RL002");
//       role2.setRoleName("john");
//		
//       Role role3 = new Role();
//       role3.setRoleID("RL003");
//       role3.setRoleName("Priya");
//		
//
//		roleService.AddRole(role2);
//
//
//		String updateRole= roleService.updateRoleByID(role3,"RL002");
//		System.out.println(updateRole);
//
//
//		Role role5 = roleService.getRoleByID("RL003");
//		System.out.println(role5);
//		//System.out.println(roleService.getRoleByID("RL001"));
//
//		Role[] roleList = roleService.getRole();
//		for(Role role1 : roleList) {
//		if(role1!=null) {
//			  System.out.println("role ");}
//		}
//			String deleteEntity = roleService.deleteRoleByID("RL001");
//			System.out.println(deleteEntity);
//			Role[] roleList1 = roleService.getRole();
//			Object roles1;
//			for(Role r : roleList1) {
//				if(r!=null) {
//					System.out.println("role");}
//			}
	}
	}
