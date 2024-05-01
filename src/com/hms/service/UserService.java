package com.hms.service;

import java.util.LinkedList;
import java.util.Scanner;

import com.hms.entity.User;

public class UserService {

	static Scanner sc=new Scanner(System.in);
	static LinkedList<User> usr=new LinkedList();
	
	public static void addUser(User u) {
		usr.add(u);
	}
	
	public static void displayUser() {
		System.out.println(usr);
	}
	
	public static void deleteUser(int uid) {
		for(int i=0; i<usr.size();i++) {
			if(usr.get(i).getUid()==uid) {
				usr.remove();
			}
		}
	}
	
	public static void updateUser(int id, String phn) {
		for (User u : usr) {
			 if(u.getUid()==id) {
				 u.setPhone(phn);
			 }
		}
	}
}
