package com.Moglix.MoglixProject.service;
import com.Moglix.MoglixProject.dto.Role;
import com.Moglix.MoglixProject.repository.RoleDAO;

public class RoleService {
	RoleDAO roleDAO = new RoleDAO();
		
	

	public String AddRole(Role role) {
		return this.roleDAO.addRole(role);
	}
		public Role getRoleByID(String RoleID) {
			return this.roleDAO.getRoleByID(RoleID);}
		
		public String updateRoleByID (Role role,String RoleID) {
			return this.roleDAO.updateRoleByID(role, RoleID);
		}
		

		public Role[] getRole() {
			return this.roleDAO.getRoles();
			
		}
		public String deleteRoleByID(String RoleID) {
			return RoleID;
			//return this.roleDAO.deleteRolesByID(RoleID);
		}
		




	}



