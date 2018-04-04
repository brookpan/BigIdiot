package com.brpan.dao;

import java.util.List;

import com.brpan.bean.User;


public interface UserDao {
	
	public boolean FoundUser(String user_name);
	
	public List<User> ListAllUsers();

}