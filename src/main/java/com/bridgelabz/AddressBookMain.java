package com.bridgelabz;

public class AddressBookMain {
	
	public static void main(String[] args) {

		AddressBook person1 = new Person();
		person1.createContact();
		person1.addContact();
		person1.editContact();
		person1.deleteContact();
		person1.operation();
		person1.displayBook();
		person1.display();
	}
}