package com.brpan.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.brpan.bean.User;
import com.brpan.bigidiot.App;
import com.brpan.dao.*;
import com.brpan.util.HibernateUtil;

public class UserDaoImpl implements UserDao {
	
	private static Log logger = LogFactory.getLog(App.class);
	private Session session;
	
	public UserDaoImpl() {
		this.session = HibernateUtil.getSession();
	}

	@Override
	public boolean FoundUser(String user_name) {
		// TODO Auto-generated method stub
		
		
		return false;
	}

	@Override
	public ArrayList<User> ListAllUsers() {
		// TODO Auto-generated method stub
		
		ArrayList<User> rtusers = new ArrayList<User>();
		
	      Transaction tx = null;
	      try{
	         tx = session.beginTransaction();
	         List users = session.createQuery("FROM User").list(); 
	         for (Iterator iterator = 
	        		 users.iterator(); iterator.hasNext();){
	            User user = (User) iterator.next();
	            
	            rtusers.add(user);
	            
	            logger.error("User ID: " + user.getUser_id());
	            logger.error("  User Name: " + user.getUser_name()); 
	            
	            System.out.println("User ID: " + user.getUser_id());
	         }
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }	
		
		return rtusers;
	}
	
	public static void main(String[] args) {
		UserDaoImpl ud = new UserDaoImpl();
		ArrayList<User> user_list = ud.ListAllUsers();
		System.out.print(user_list.size());
	}

}