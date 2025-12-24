package Service;

import com.example.demo.Entiry.UserInfo;

public interface UserService {
	
	public String saveUser(UserInfo info);
	
	public String updateById(int id,UserInfo info);
	
	public String deleteById(int id);
	
	public UserInfo getById(int id);
	
	
	

}
