package com.interns.pakshay.addressbook.assist;

import java.util.List;
import java.util.Optional;

import com.interns.pakshay.addressbook.dao.*;
import com.interns.pakshay.addressbook.main.*;


public class ContactServiceImpl implements ContactService {
	private ContactDao contactDao;
	
	public ContactServiceImpl() {
		this.contactDao = new ContactDaoImpl();
	}
	
	@Override
	public List<Contact> findAll() {
		return contactDao.findAll();
	}

	@Override
	public Optional<Contact> findById(long id) {
		return contactDao.findById(id);
	}

	@Override
	public void save(Contact contact) {
		contactDao.save(contact);
	}

	@Override
	public void update(Contact contact) {
		contactDao.update(contact);
	}

	@Override
	public void delete(long id) {
		contactDao.delete(id);
	}

}
