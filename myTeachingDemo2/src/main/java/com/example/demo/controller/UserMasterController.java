package com.example.demo.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.dao.UserMasterDao;
import com.example.demo.dao.UserMasterDaoExtention;
import com.example.demo.vo.UserMasterVo;

@RestController
public class UserMasterController {
	
	
   @Autowired
   UserMasterDaoExtention  userMasterDaoExtention;
   
   @Autowired
   UserMasterDao  userMasterDemoDao;
   
   
  
   @GetMapping("/restful/Allusers")
	public List<UserMasterVo> getAllUsers(){
		
		return userMasterDemoDao.findAll() ;
	}
   
  
   
   @PostMapping("/restful/createUser")
	public ResponseEntity<Object> createUser(@Validated @RequestBody UserMasterVo user){
		
		boolean savedUser= userMasterDaoExtention.save(user) ;
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(savedUser).toUri();
				
		return ResponseEntity.created(location).build();
	}
   
  
	

}
