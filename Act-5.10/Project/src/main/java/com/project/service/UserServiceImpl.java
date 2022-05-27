package com.project.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.domain.Role;
import com.project.domain.Users;
import com.project.repo.RoleRepo;
import com.project.repo.UserRepo;

import lombok.extern.slf4j.Slf4j;


@Service @Transactional @Slf4j
public class UserServiceImpl implements UserService {
	private final UserRepo userRepo;
	private final RoleRepo roleRepo;
	UserServiceImpl(UserRepo userRepo,RoleRepo roleRepo){
		this.roleRepo=roleRepo;
		this.userRepo=userRepo;
	}
	@Override
	public Users saveUser(Users user) {
		
		return userRepo.save(user);
	}
	@Override
	public Role saveRole(Role role) {
		
		return roleRepo.save(role);
	}
	@Override
	public void addRoleToUser(String username, String roleName) {
		Users user = userRepo.findByUsername(username);
		Role role = roleRepo.findByName(roleName);
		user.getRoles().add(role);
		
		
	}
	@Override
	public Users getUser(String username) {
		
		return userRepo.findByUsername(username);
	}
	@Override
	public List<Users> getUsers() {
		
		return userRepo.findAll();
	}
	
	

	
}
