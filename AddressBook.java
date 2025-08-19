package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	private ArrayList<ContactPerson> contacts;
	
	public AddressBook()
	{
		contacts = new ArrayList<ContactPerson>();
	}
	
	public void addContact(ContactPerson contact)
	{
		contacts.add(contact);
		System.out.println("Contact Added Successfully");
	}
	
	public void editContact(String name,Scanner sc)
	{
		for(ContactPerson contact :contacts)
		{
			if(contact.getFirstName().equalsIgnoreCase(name))
			{
				System.out.println("Contact Found.Enter new details");
				System.out.println("Enter Address:");
				contact.setAddress(sc.nextLine());
				System.out.println("Enter City:");
				contact.setCity(sc.nextLine());
				System.out.println("Enter State:");
				contact.setState(sc.nextLine());
				System.out.println("Enter Zip Code:");
				contact.setZip(sc.nextLine());
				System.out.println("Enter Phone Number:");
				contact.setPhoneNumber(sc.nextLine());
				System.out.println("Enter Email:");
				contact.setEmail(sc.nextLine());
			}else {
				System.out.println("Contact Not Found..");
			}
		}
	}
	
	public void displayContacts()
	{
		for(ContactPerson contact : contacts)
		{
			if(contact==null) {
				System.out.println("No Contact Found");
			}
			else {
				System.out.println(contact);
			}
		}
	}
	
	public void deleteContact(String name)
	{
		for(ContactPerson contact : contacts)
		{
			if(contact.getFirstName().equalsIgnoreCase(name)) {
				contacts.remove(contact);
				System.out.println("Contact Deleted Successfully");
				return;
			}
			else {
				System.out.println("Contact Not Found");
			}
		}
	}
}
