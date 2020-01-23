package com.spring.dao;

import com.spring.service.Login;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;



@Repository
public class LoginDAO {

	@Autowired
	SessionFactory mySessionFactory;
	

	@Bean(name="transactionManager")
	public Login getUserDetails(String userName) {
		Login login = null;
		try {

			Session currentSession = mySessionFactory.openSession();
			Query query = currentSession.createQuery("from Login where userName=’" + userName + "’");
			List list = query.list();
			System.out.println("list : " + list);
			if (list != null) {
				login = (Login) list.get(0);
			}
			return login;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
