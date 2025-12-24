package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entiry.UserInfo;
import com.example.demo.serviceImpl.UserServiceImpl;

@RestController
public class Controler {
	
	 @Autowired
	    private UserServiceImpl userService;

	    @PostMapping("/save")
	    public ResponseEntity<String> saveUser(@RequestBody UserInfo info) {

	        userService.saveUser(info);
	        return ResponseEntity.ok("User saved successfully");
	    }

}
