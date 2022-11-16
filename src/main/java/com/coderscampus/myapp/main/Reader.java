package com.coderscampus.myapp.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

	public User[] fileReader() {
		User users = new User[];
	BufferedReader fileReader = null;
	try {
		fileReader = new BufferedReader(new FileReader("Data.txt"));
		try {

			String line = "";
			while ((line = fileReader.readLine()) != null) {
				System.out.println(line);
				//i/o videos
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
	return users;
  }
}