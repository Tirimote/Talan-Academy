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
public class AnnoucementController {
	@Autowired
	  private  AdsRepository adsRepository;
	
	//create user
		@PostMapping("ads")
		public AnnouncementImpl addAd (@RequestBody AnnouncementImpl user){
			return adsRepository.save(user);
			
		}
		//show user by id
		
		@GetMapping("ads/{id}")

		public ResponseEntity<AnnouncementImpl>  showUser (@PathVariable(value="id") long userId) throws ResourceNotFoundException {
			AnnouncementImpl user = adsRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + userId));;
			
			
				return ResponseEntity.ok().body(user);
		}
		//show users
		 @GetMapping("ads")
		    public List<AnnouncementImpl> showUsers () {
		        return adsRepository.findAll();
		    }
		//update user
		 @PutMapping("ads/{id}")
		    public ResponseEntity<AnnouncementImpl> updateUser(@PathVariable(value = "id") Long userId,
		         @Validated @RequestBody AnnouncementImpl userDetails) throws ResourceNotFoundException {
			 AnnouncementImpl user = adsRepository.findById(userId)
		        .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + userId));

		        user.setDescription(userDetails.getDescription());
		        final AnnouncementImpl updatedUser = adsRepository.save(user);
		        return ResponseEntity.ok(updatedUser);
		    }
		//delete user
		 @DeleteMapping("ads/{id}")
		    public Map<String, Boolean> deleteAd(@PathVariable(value = "id") Long userId)
		         throws ResourceNotFoundException {
			 AnnouncementImpl user = adsRepository.findById(userId)
		       .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + userId));

		        adsRepository.delete(user);
		        Map<String, Boolean> response = new HashMap<>();
		        response.put("deleted", Boolean.TRUE);
		        return response;
		 }



}
