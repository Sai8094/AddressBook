package com.addressbook;

import java.util.HashMap;
import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Management");
		Scanner scanner = new Scanner(System.in);
		HashMap<String, AddressBook> addressBook = new HashMap<>();
		AddressBook currentBook = null;
		while (true) {
			System.out.println("Main Menu");
			System.out.println("1.Create new Address Book");
			System.out.println("2.Switch to an Address Book");
			System.out.println("3.Manage Current Address Book");
			System.out.println("4.Exit");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter unique name for Address Book");
				String bookName = scanner.nextLine();
				if (addressBook.containsKey(bookName)) {
					System.out.println("Name Already Exists");
				} else {
					AddressBook newBook = new AddressBook();
					addressBook.put(bookName, newBook);
					currentBook = newBook;
					System.out.println("New Book Created");
				}
				break;
			case 2:
				if (addressBook.isEmpty()) {
					System.out.println("No AddressBook Available");
					break;
				}
				System.out.println("Available Book: " + addressBook.keySet());
				System.out.println("Enter book name to switch");
				String switchBook = scanner.nextLine();
				if (addressBook.containsKey(switchBook)) {
					currentBook = addressBook.get(switchBook);
					System.out.println("Switched Successfully");
				} else {
					System.out.println("No Address Book Found");

				}
				break;
			case 3:
				if (currentBook == null) {
					System.out.println("No AddressBook Selected");
					break;
				}
				manageAddressBook(currentBook, scanner);
				break;

			case 4:
				System.out.println("Thank You");
				break;

			default:
				System.out.println("Invalid Option");
				break;

			}
		}
	}

	private static void manageAddressBook(AddressBook addressBook, Scanner scanner) {
		while (true) {
			System.out.println("1.Add Contact");
			System.out.println("2.Edit Contact");
			System.out.println("3.Delete Contact");
			System.out.println("4.Display");
			System.out.println("5.Exit");
			System.out.println("Enter a choice");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1:
				boolean addMore = true;
				while (addMore) {
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
					ContactPerson contactPerson = new ContactPerson(firstName, lastName, address, city, state, zipCode,
							phoneNumber, email);
					addressBook.addContact(contactPerson);
					System.out.println("Contact Created Successfully");
					System.out.println("Do you want to add another contact(yes/no)");
					String option = scanner.nextLine();
					if (!option.equalsIgnoreCase("yes")) {
						addMore = false;
					}
				}
				break;

			case 2:
				System.out.println("Enter First Name to edit");
				String name = scanner.nextLine();
				addressBook.editContact(name, scanner);
				break;

			case 3:
				System.out.println("Enter First Name to edit");
				String deleteName = scanner.nextLine();
				addressBook.deleteContact(deleteName);
				break;
			case 4:
				addressBook.displayContacts();
				break;
			case 5:
				System.out.println("Thank You");
				break;

			}

		}

	}

}
