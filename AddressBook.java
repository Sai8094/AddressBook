package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	private ArrayList<ContactPerson> contacts;
	
	public AddressBook()
	{
		contacts = new ArrayList<ContactPerson>();
	}
	
	public void addContact()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Name:");
		String firstName = scanner.nextLine();
		System.out.println("Enter Last Name:");
		String lastName = scanner.nextLine();
		System.out.println("Enter Address:");
		String address = scanner.nextLine();
		System.out.println("Enter City:");
		String city = scanner.nextLine();
		System.out.println("Enter State:");
		String state = scanner.nextLine();
		System.out.println("Enter Zip Code:");
		String zipCode = scanner.nextLine();
		System.out.println("Enter Phone Number:");
		String phoneNumber = scanner.nextLine();
		System.out.println("Enter Email:");
		String email = scanner.nextLine();
		contacts.add(new ContactPerson(firstName, lastName, address, city, state, zipCode,
				phoneNumber, email));
		System.out.println("Contact Created Successfully");

	}
	
}
