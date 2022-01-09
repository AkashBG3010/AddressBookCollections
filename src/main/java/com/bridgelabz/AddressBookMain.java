package com.bridgelabz;

public class AddressBookMain {
	
	public static void main(String[] args) {

		AddressBook person1 = new Person();
		person1.createContact();
		person1.addContact();
		person1.display();
	}
}