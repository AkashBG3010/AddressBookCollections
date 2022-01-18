package com.bridgelabz;

public class Book extends Contact {
	String addressBook;
	Book(String firstName, String lastName, String address, String city, String state, int zip, long phoneNumber,
			String email,String addressBook) {
		super(firstName, lastName, city, state, zip, phoneNumber, email);
		this.addressBook=addressBook;
	}
	@Override
	public String toString() {
		return "Book [addressBook=" + addressBook + "firstName"+ getFirstName()+ " lastName "+getLastName()+"city"+getCity()+"state"+getState()+"zip"+getZip()+"phoneNumber"+getPhoneNumber()+"]";
	}
}