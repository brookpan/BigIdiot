package com.brpan.dao.impl;

import java.util.ArrayList;
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
	public List<User> ListAllUsers() {
		// TODO Auto-generated method stub
		
		List<User> rtusers = new ArrayList<User>();
		
	      Transaction tx = null;
	      try{
	         tx = session.beginTransaction();
	         rtusers =session.createQuery("FROM User").list();
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
		List<User> userlist = ud.ListAllUsers();
		
		for(User user:userlist){
			
			System.out.println("User ID: "+user.getUser_id());
			System.out.println("User Name: "+user.getUser_name());
		}
		
	}

}