package com.brpan.dao;

import java.util.ArrayList;

import com.brpan.bean.*;

public interface UserDao {
	
	public boolean FoundUser(String user_name);
	
	public ArrayList<User> ListAllUsers();

}