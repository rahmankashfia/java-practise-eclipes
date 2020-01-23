package com.apex.user.dao;

import com.apex.user.entity.User;
import com.apex.user.util.HibernateUtil;


import org.hibernate.Session;
import org.hibernate.Transaction;


public class UserDao {
	public User getUser(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		User user = (User) session.load(User.class, new Integer(id));
		return user;
		
	}
	
	public void addUser(User user) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.save(user);
		tx.commit();
		return;
	}
	
	public void updateUser(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		User user = (User) session.load(User.class, new Integer(id));
		Transaction tx = session.beginTransaction();
		session.update(user);
		tx.commit();
		return;
		
	}
	
	public void deleteUser(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		User user = session.load(User.class, new Integer(id));
		Transaction tx = session.beginTransaction();
		session.delete(user);
		tx.commit();
		return;
		
	}
}
