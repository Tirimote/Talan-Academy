package com.project.service;

import java.util.List;



import com.project.domain.Role;
import com.project.domain.Users;

public interface UserService {
	Users saveUser (Users user);
	Role saveRole (Role role);
	void addRoleToUser(String username,String roleName);
	Users getUser(String username);
	List<Users> getUsers();
	

}
