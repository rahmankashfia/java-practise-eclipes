package com.apex.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import com.apex.entity.Contact;

@Repository
public class ContactDAOImpl implements ContactDAO {
	@Autowired
    private SessionFactory sessionFactory;
	@Bean
    public void addContact(Contact contact) {
        sessionFactory.getCurrentSession().save(contact);
    }

    public List<Contact> listContact() {

        return sessionFactory.getCurrentSession().createQuery("from Contact").list();
    }       

    public void removeContact(Integer id) {
        Contact contact = (Contact) sessionFactory.getCurrentSession().load(
                Contact.class, id);
        if (null != contact) {
            sessionFactory.getCurrentSession().delete(contact);
        }

    }
}


