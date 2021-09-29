package com.Moglix.MoglixProject.repository;

import com.Moglix.MoglixProject.dto.Role;

public class RoleDAO {

	static int counter = 0;

	Role roles[] = new Role[10];

	public String addRole(Role role) {

		if (counter < roles.length) {
			roles[counter++] = role;
			return "success";
		} else {
			return ("array is full");
		}

	}

	public Role getRoleByID(String id) {
		  for(Role role : roles) {
			  
			  if(role!=null && id.equals(role.getRoleID())) {
			  return role;
			  }
			
		  }
		  return null;
	  }

	public Role[] getRole() {
		return roles;
	}

	private int getIndex(String id) {
		for (int i = 0; i < roles.length; i++) {
			if (roles[i] != null && roles[i].getRoleID().equals(id)) {
				return i;
			}
		}
		return -1;
	}

	public String deleteRoleByID(String id) {
		int index = this.getIndex(id);
		if (index != -1) {
			roles[index] = null;
			return "success";
		} else
			return "not found";
	}

	public String updateRoleByID(Role role, String roleID) {
		if (this.getIndex(roleID) != -1) {
			roles[this.getIndex(roleID)] = role;
			return "updated successfully";
		}
		return "Not updated";
	}

	public Role[] getRoles() {
		// TODO Auto-generated method stub
		return null;
	}

}


