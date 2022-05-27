package com.project.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.project.domain.Users;

public interface UserRepo extends JpaRepository<Users, Long>{
	Users findByUsername(String username);

}