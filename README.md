# 📒 Address Book System (Java Project)

This project is a **Java-based Address Book System** that demonstrates step-by-step feature development using **Object-Oriented Programming (OOP)** concepts and **Git branching strategy**.  
Each **Use Case (UC)** is implemented in a **separate branch** and then merged into the `main` branch.

---

## 🚀 Project Overview
- Manage contacts with details such as:  
  `First Name, Last Name, Address, City, State, ZIP, Phone Number, Email`  
- Support for creating, editing, deleting, and managing multiple contacts.  
- Extended functionality to handle **multiple address books** within the system.  
- Implemented via **console input/output**.  

---

## 📂 Use Case Implementation

### 🏁 START (Base Program)
- **Class:** `AddressBookMain`
- Displays:  
- Serves as the entry point of the project.

---

### ✅ UC 1 – Create Contact in Address Book
- Ability to create a **contact** with fields:  
`firstName, lastName, address, city, state, zip, phoneNumber, email`
- Implemented using **Java classes** and OOP.

---

### ✅ UC 2 – Add New Contact
- Add a **new contact** to the address book.  
- Contact details are **entered via console** (`Scanner` class).  
- Uses **OOP concepts** for `AddressBook` ↔ `Contact` relationship.  

---

### ✅ UC 3 – Edit Existing Contact
- Search a contact by **first name or last name**.  
- Edit the contact details via console input.  
- Updates reflect immediately in the address book.

---

### ✅ UC 4 – Delete Contact
- Delete a contact using the **person's name**.  
- Uses console input for searching and confirming deletion.

---

### ✅ UC 5 – Add Multiple Contacts
- Ability to **add multiple contacts** one by one using console input.  
- Uses **Collections (`ArrayList`)** to maintain multiple contact persons in the Address Book.

---

### ✅ UC 6 – Multiple Address Books
- Add support for multiple address books in the system.  
- Each Address Book has a **unique name**.  
- Uses **HashMap / Dictionary** to map `AddressBookName → AddressBook`.  

---

## 🛠️ Technology & Tools
- **Language:** Java  
- **IDE:** IntelliJ IDEA (recommended)  
- **Version Control:** Git & GitHub  
- **Concepts:** OOP, Collections, Encapsulation  

---

## 🔀 Git Workflow
- Each **Use Case (UC)** is developed in a **separate branch**.  
- After completion, the branch is merged into the `main` branch.  
- **Commit messages** describe changes clearly (e.g., `Added UC2 - Add new contact`).  

---

## 📖 How to Run
1. Clone the repository:
 ```bash
 git clone https://github.com/your-username/AddressBookSystem.git
 cd AddressBookSystem
