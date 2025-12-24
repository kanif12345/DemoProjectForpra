package com.example.demo.Entiry;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class UserInfo {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	    int id;
	    private String name;
	    private String depName;
	    private String address;
	    private int pinCode;

}
