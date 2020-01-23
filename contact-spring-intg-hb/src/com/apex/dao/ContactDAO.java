package com.apex.dao;

import java.util.List;
import com.apex.entity.Contact;

public interface ContactDAO {
    
    public void addContact(Contact contact);
    public List<Contact> listContact();
    public void removeContact(Integer id);
}