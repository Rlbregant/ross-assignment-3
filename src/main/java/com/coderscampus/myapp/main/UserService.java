package com.coderscampus.myapp.main;

public class UserService {

	public User createUser(String username, String password, String name) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setName(name);
		return user;
	}
	String input1 = "exampleUsername,examplePassword,exampleName";
	public String[] parseText(String input) {
		
		String[] userInfo = input.split(",");
	
		System.out.println(userInfo[0]);
		System.out.println(userInfo[1]);
		System.out.println(userInfo[2]);
		return userInfo;

	}
}