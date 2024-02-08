package WhatsappProject;

import java.util.ArrayList;
import java.util.List;

public class User {

//Variables
	private long phoneNumber;
	private String name;
	private String password;
	private List<Contact> list;

//Default Constructor
	public User() {
	}

//Constructor
	User(long phoneNumber, String name, String password) {
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.password = password;
		this.list = new ArrayList<Contact>();
	}

// Get Contact List
	public List<Contact> getContactList() {
		return list;
	}

// Set Name
	public void setName(String name) {
		this.name = name;
	}

// Get Name
	public String getName() {
		return name;
	}

// Set Phone Number
	public void SetPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

// Get Phone Number
	public long getPhoneNumber() {
		return phoneNumber;
	}

// Set Password
	public void setPassword(String password) {
		this.password = password;
	}

//Get Password
	public String getPassword() {
		return password;
	}

}
