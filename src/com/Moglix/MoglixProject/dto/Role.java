package com.Moglix.MoglixProject.dto;

public class Role {
	private String RoleID;
	private String RoleName;

	public Role() {
	}

	public String getRoleID() {
		return RoleID;
	}

	public void setRoleID(String roleID) {
		RoleID = roleID;
	}

	public String getRoleName() {
		return RoleName;
	}

	public void setRoleName(String roleName) {
		RoleName = roleName;
	}

	@Override
	public String toString() {
		return "Role [RoleID=" + RoleID + ", RoleName=" + RoleName + "]";
	}

}
