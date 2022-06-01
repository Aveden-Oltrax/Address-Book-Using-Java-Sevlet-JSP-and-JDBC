package com.interns.pakshay.addressbook.assist;

import java.util.List;
import java.util.Optional;

import com.interns.pakshay.addressbook.main.*;

public interface ContactService {

    List<Contact> findAll();

    Optional<Contact> findById(long id);

    void save(Contact contact);

    void update(Contact contact);

    void delete(long id);

}
