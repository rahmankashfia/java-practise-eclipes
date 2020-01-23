package com.apex.service;

import java.util.List;

import com.apex.entity.Contact;

public interface ContactService {
	public void addContact(Contact contact);
    public List<Contact> listContact();
    public void removeContact(Integer id);

}
