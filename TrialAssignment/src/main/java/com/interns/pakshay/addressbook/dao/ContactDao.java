package com.interns.pakshay.addressbook.dao;

import java.util.List;
import java.util.Optional;

import com.interns.pakshay.addressbook.main.*;

public interface ContactDao {
	
    List<Contact> findAll();

    Optional<Contact> findById(long id);

    void save(Contact contact);

    void update(Contact contact);

    void delete(long id);
    
}
