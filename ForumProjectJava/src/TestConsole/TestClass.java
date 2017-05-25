package TestConsole;

import java.util.ArrayList;
import java.util.Date;

import com.DAL.UserRepository;
import com.DTO.User;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<User> users =  new ArrayList<User>();
		
		User user = new User("UserName1","Nesto","Nesto","Nesto","Nesto","Nesto","Nesto",new Date());
		UserRepository.AddUser(user);
		
		User user1 = new User("UserName2","Nesto","Nesto","Nesto","Nesto","Nesto","Nesto",new Date());
		UserRepository.AddUser(user1);
		
		User user2 = new User("UserName3","Nesto","Nesto","Nesto","Nesto","Nesto","Nesto",new Date());
		UserRepository.AddUser(user2);
		
		User user3 = new User("UserName4","Nesto","Nesto","Nesto","Nesto","Nesto","Nesto",new Date());
		UserRepository.AddUser(user3);
		
		users =  UserRepository.GetAllUsers();
		
		
		User u = new User();
		u =	UserRepository.GetUserById("UserName1");
		
		System.out.println("Jes");
		
	}

}
