package com.DAL;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.DTO.User;

public class UserRepository {

	public static ArrayList<User> GetAllUsers(){
		
	ArrayList<User> users = new ArrayList<User>();
		
		FileInputStream fin = null;
		ObjectInputStream ois = null;
		try {
			 fin = new FileInputStream("WebContent/data/users.txt");
			 ois = new ObjectInputStream(fin);
			 users = (ArrayList<User>) ois.readObject();
		} catch (Exception e) {
			// TODO: handle exception
		} finally{
		    if(ois  != null){
		        try {
		        	ois.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    } 
		}
		return users;
	}
	
	public static String AddUser(User user){
				
		ObjectOutputStream oos = null;
		FileOutputStream fout = null;
		ArrayList<User> users = new ArrayList<User>();
		users = UserRepository.GetAllUsers();
		users.add(user);
		try 
		{
		    fout = new FileOutputStream("WebContent/data/users.txt");
		    oos = new ObjectOutputStream(fout);
			oos.writeObject(users);
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
		    if(oos  != null){
		        try {
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    } 
		}
		return user.getSurName();
	}
		
	public static User GetUserById(String id){
		
		ArrayList<User> users = UserRepository.GetAllUsers();
		
		 for (int i = 0; i < users.size(); i++) {
			 System.out.println(users.get(i).getUserName());
			if (users.get(i).getUserName().equals(id)) {
				return users.get(i);
			}
		 }
        	return null;
	}
	
	public static void UpdateUserById(String id){
		
	}
	public static void DeleteUserById(String id){
		
	}
	
}
