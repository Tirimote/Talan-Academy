package com.project.api;

import java.util.List;

import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.domain.Role;
import com.project.domain.Users;
import com.project.service.UserService;
@RestController 
@RequestMapping("/api")
public class UserRessource {
	private final UserService userService;
	UserRessource(UserService userService){
		this.userService=userService;
	}
	
	@GetMapping("/users")
	public ResponseEntity<List<Users>> getUsers(){
		return ResponseEntity.ok().body(userService.getUsers());
		
	}
	@PostMapping("/users")
	public ResponseEntity<Users> addUser(@RequestBody Users user) {
		return ResponseEntity.ok().body(userService.saveUser(user));
		
	}
	@PostMapping("/users/roles")
	public ResponseEntity<Role> addRole(@RequestBody Role role) {
		return ResponseEntity.ok().body(userService.saveRole(role));
		
	}
	

}
