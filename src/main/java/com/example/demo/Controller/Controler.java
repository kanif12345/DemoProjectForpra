package com.example.demo.Controller;

import java.net.http.HttpResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entiry.UserInfo;
import com.example.demo.Repo.userRepo;
import com.example.demo.serviceImpl.UserServiceImpl;

@RestController
@RequestMapping("/demo")
public class Controler {

  
	
	 @Autowired
	    private UserServiceImpl userService;

	    @PostMapping("/save")
	    public ResponseEntity<String> saveUser(@RequestBody UserInfo info) {

	        userService.saveUser(info);
	        return ResponseEntity.ok("User saved successfully");
	    }
	    
	    @DeleteMapping("/deletedById/{id}")
	    public ResponseEntity<?> deletedById(@PathVariable int id)
	    {
	    	 String deleteById = userService.deleteById(id);
	    	 
	    	 return new ResponseEntity<>(deleteById,HttpStatus.OK);
	    	 
	    }
	    
}
