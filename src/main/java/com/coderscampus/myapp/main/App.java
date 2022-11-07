package com.coderscampus.myapp.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		new App().execute();

	}

	private void execute() {

		BufferedReader fileReader = null;
		try {
			fileReader = new BufferedReader(new FileReader("Data.txt"));
			try {

				String line = "";
				while ((line = fileReader.readLine()) != null) {
					line = fileReader.readLine();
					System.out.println(line);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			System.out.println("There was an issue here");
			e.printStackTrace();
		} finally {
			try {
				fileReader.close();
			} catch (IOException e) {
				System.out.println("Huston, we have a problem");
				e.printStackTrace();
			}
		}

	}

//		User u1 = new User("Alpha", "Beta", "Charlie");
//
//		u1.msg();
//		String input1 = "exampleUsername,examplePassword,exampleName";
//
//		UserService userService = new UserService();
//		userService.parseText(input1);
//		User rossUser = userService.createUser("ross@User.com", "TacoTrucks123@", "RBregant");
//		System.out.println(userService);
//			
//
//		User[] users = new User[13];
//
//		for (int i = 0; i < 13; i++) {
//			users[i] = userService.createUser("user" + (i + 1), "password" + (i + 1), "name" + (i + 1));
//		}
//
//		users[2] = userService.createUser(null, null, null);
//
//		System.out.println(rossUser);
//		System.out.println(users);
//		System.out.println(userService);
//		User newUser = new User();
//		newUser.setName("Jerry BoB");
//		newUser.setUsername("JBoB55");
//		newUser.setPassword("Java1337!");
//
//		System.out.println("Name: " + newUser.getName());
//		System.out.println("Username: " + newUser.getUsername());
//		System.out.println("Password: " + newUser.getPassword());
//		
//		
//	}
}
