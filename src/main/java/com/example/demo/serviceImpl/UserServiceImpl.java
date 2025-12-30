package com.example.demo.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entiry.UserInfo;
import com.example.demo.Repo.userRepo;

import Service.UserService;

@Service
public class UserServiceImpl  implements UserService

{
	@Autowired
	private userRepo repo;
	
	

	@Override
	public String saveUser(UserInfo info)
	{
		
		UserInfo save = repo.save(info);
		if(save !=null)
		{
			return "user save.....";
		}
		else
		{
			return "user not save";
		}
		
	}

	@Override
	public String updateById(int id, UserInfo info)
	{
		
		Optional<UserInfo> byId = repo.findById(id);
		 UserInfo userInfo = byId.get();
		if(byId.isPresent())
		{
			 if (info.getName() != null)
			 {
				 userInfo.setName(info.getName());
		        }
			 if(info.getDepName() !=null)
			 {
				 
			 }userInfo.setDepName(info.getDepName());
			 
			 repo.save(userInfo);
			 return "savedddddddddddd";
		}
		else
		{
			return "Given id not found...."+id;
		}
		
	}

	@Override
	public String deleteById(int id) {
		
		// TODO Auto-generated method stub
	     
		Optional<UserInfo> byId = repo.findById(id);
		
		if(byId.isPresent())
		{
			repo.deleteById(id);
			
			return "Given user deleteddd ";
		}
		else
		{
			return id+"Given id not foundd...";
		}
		
		
	}

	@Override
	public UserInfo getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	

}
