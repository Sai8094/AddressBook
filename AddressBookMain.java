package com.addressbook;

import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Management");
		Scanner sc = new Scanner(System.in);
		AddressBook book = new AddressBook();

		System.out.println("1. Add Contact");
		System.out.println("2. Edit Contact");
		System.out.println("3. Delete Contact");
		int choice = sc.nextInt();
		sc.nextLine();

		if (choice == 1) {
			ContactPerson c = readContact(sc);
			book.addContact(c);
			System.out.println("Added:\n" + c);
		} else if (choice == 2) {
			System.out.print("Enter First Name to Edit: ");
			book.editContact(sc.nextLine(), sc);
		} else if (choice == 3) {
		    System.out.print("Enter First Name to Delete: ");
		    book.deleteContact(sc.nextLine());
		}

		sc.close();
	}

	private static ContactPerson readContact(Scanner sc) {
		System.out.print("Enter First Name: ");
		String firstName = sc.nextLine();
		System.out.print("Enter Last Name: ");
		String lastName = sc.nextLine();
		System.out.print("Enter Address: ");
		String address = sc.nextLine();
		System.out.print("Enter City: ");
		String city = sc.nextLine();
		System.out.print("Enter State: ");
		String state = sc.nextLine();
		System.out.print("Enter Zip: ");
		String zip = sc.nextLine();
		System.out.print("Enter Phone Number: ");
		String phoneNumber = sc.nextLine();
		System.out.print("Enter Email: ");
		String email = sc.nextLine();
		return new ContactPerson(firstName, lastName, address, city, state, zip, phoneNumber, email);
	}

}
