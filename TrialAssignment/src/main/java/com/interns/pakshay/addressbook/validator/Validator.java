package com.interns.pakshay.addressbook.validator;

public interface Validator<T> {

	Validation validate(T t);
	
}
