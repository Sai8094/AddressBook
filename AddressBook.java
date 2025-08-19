package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	private ArrayList<ContactPerson> contacts = new ArrayList<>();

	public void addContact(ContactPerson contact) {
		contacts.add(contact);
	}

	public void editContact(String firstName, Scanner sc) {
		for (ContactPerson contact : contacts) {
			if (contact.toString().contains(firstName)) {
				System.out.println("Contact found. Enter new details:");
				System.out.print("Enter Address: ");
				contact.setAddress(sc.nextLine());
				System.out.print("Enter City: ");
				contact.setCity(sc.nextLine());
				System.out.print("Enter State: ");
				contact.setState(sc.nextLine());
				System.out.print("Enter Zip: ");
				contact.setZip(sc.nextLine());
				System.out.print("Enter Phone Number: ");
				contact.setPhoneNumber(sc.nextLine());
				System.out.print("Enter Email: ");
				contact.setEmail(sc.nextLine());
				System.out.println("Contact updated successfully!");
				return;
			}
		}
		System.out.println("Contact not found.");
	}
	public void deleteContact(String firstName) {
	    for(ContactPerson contact : contacts)
	    {
	    	if(contact.getFirstName().equalsIgnoreCase(firstName)) {
	    		contacts.remove(contact);
	    	}else {
	    		System.out.println("Contact Not Found");
	    	}
	    }
	}
}
