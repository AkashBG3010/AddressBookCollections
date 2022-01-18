package com.bridgelabz;

import com.opencsv.bean.CsvBindByName;

public class Contact {

		@CsvBindByName(column = "First Name") String firstName;

		@CsvBindByName(column = "Last Name")
		private String lastName;

		@CsvBindByName(column = "Email")
		private String email;

		@CsvBindByName(column = "Phone Number")
		private long phoneNumber;

		@CsvBindByName(column = "City")
		private String city;

		@CsvBindByName(column = "State")
		private String state;

		@CsvBindByName(column = "Zip Code")
		private int zip;
		
		Contact(String firstName,String lastName,String city,String state,int zip,long phoneNumber,String email){
			this.firstName=firstName;
			this.lastName=lastName;
			this.city=city;
			this.state=state;
			this.zip=zip;
			this.phoneNumber=phoneNumber;
			this.email=email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", state="
				+ state + ", email=" + email + ", city=" + city + ", zip=" + zip + ", phoneNumber=" + phoneNumber
				+ "]";
	}
}