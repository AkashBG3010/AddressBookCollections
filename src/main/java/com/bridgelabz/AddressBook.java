package com.bridgelabz;

import java.util.List;

public interface AddressBook {

	void createContact();
	void addContact();
	void editContact();
	void deleteContact();
	void displayBook();
	void addToBook();
	void operation();
	void display();
	void searchPerson();
	void addContactByCity();
	void viewByCity();
	void addContactByState();
	void viewByState();
	void sortAddressBook();
	void sortByCity();
	void sortByState();
	void writeToAddressBookFile();
	public List<String> readDataFromFile();
}