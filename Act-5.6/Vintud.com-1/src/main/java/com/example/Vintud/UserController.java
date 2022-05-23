package com.example.Vintud;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class UserController {
	@Autowired
	  private  UserRepository userRepository;
	
	//create user
		@PostMapping("users")
		public UserImpl addUser (@RequestBody UserImpl user){
			return userRepository.save(user);
			
		}
		//show user by id
		
		@GetMapping("users/{id}")

		public ResponseEntity<UserImpl>  showUser (@PathVariable(value="id") long userId) throws ResourceNotFoundException {
				UserImpl user = userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + userId));;
			
			System.out.println(user);
				return ResponseEntity.ok().body(user);
		}
		//show users
		 @GetMapping("users")
		    public List<UserImpl> showUsers () {
		        return userRepository.findAll();
		    }
		//update user
		 @PutMapping("users/{id}")
		    public ResponseEntity<UserImpl> updateUser(@PathVariable(value = "id") Long userId,
		         @Validated @RequestBody UserImpl userDetails) throws ResourceNotFoundException {
		        UserImpl user = userRepository.findById(userId)
		        .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + userId));

		        user.setAddress(userDetails.getAddress());
		        final UserImpl updatedUser = userRepository.save(user);
		        return ResponseEntity.ok(updatedUser);
		    }
		//delete user
		 @DeleteMapping("users/{id}")
		    public Map<String, Boolean> deleteUser(@PathVariable(value = "id") Long userId)
		         throws ResourceNotFoundException {
		        UserImpl user = userRepository.findById(userId)
		       .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + userId));

		        userRepository.delete(user);
		        Map<String, Boolean> response = new HashMap<>();
		        response.put("deleted", Boolean.TRUE);
		        return response;
		 }

}
