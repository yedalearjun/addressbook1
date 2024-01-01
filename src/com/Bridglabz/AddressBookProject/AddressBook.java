package com.Bridglabz.AddressBookProject;

import java.util.HashSet;
import java.util.Scanner;
/*
@Desc: AddressBook class is a class which contains Contact info and add contact method.class

@Param:Its a taking a object from the user as parameter.

 */

public class AddressBook {
    HashSet<Contacts> set = new HashSet<>();
    Scanner sc = new Scanner(System.in);

    public void addContact() {
        System.out.println("Add details: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name:");
        String firstName = sc.nextLine();
        System.out.println("Enter last name:");
        String lastName = sc.nextLine();
        System.out.println("Enter the address : ");
        String address = sc.nextLine();
        System.out.println("Enter the city: ");
        String city = sc.nextLine();
        System.out.println("Enter the state: ");
        String state = sc.nextLine();
        System.out.println("Enter the zip Code: ");
        int zip = sc.nextInt();
        System.out.println("Enter the phone number: ");
        long phone = sc.nextLong();
        System.out.println("Enter the email: ");
        String email = sc.nextLine();
        Contacts contacts = new Contacts(firstName, lastName, address, city, state, zip, phone, email);
        set.add(contacts);
        System.out.println("Contact details added successfully...." + set);
    }


    // Update Contact details method.....
    public void updateContacts() {
        boolean found = false;
        System.out.println("Enter your first name: ");
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        for (Contacts contacts11 : set) {
            if (contacts11.getFirstName().equals(contacts11.firstName)) {
                System.out.println("Enter the first name: ");
                String firstName1 = sc.nextLine();
                System.out.println("Enter the last name: ");
                String lastName = sc.nextLine();
                System.out.println("Enter the address: ");
                String address = sc.nextLine();
                System.out.println("Enter the city: ");
                String city = sc.nextLine();
                System.out.println("Enter the state: ");
                String state = sc.nextLine();
                System.out.println("Enter the zip code: ");
                int zip = sc.nextInt();
                System.out.println("Enter the Phone number: ");
                long phone1 = sc.nextLong();
                System.out.println("Enter the email: ");
                String email = sc.nextLine();
                contacts11.setFirstName(firstName1);
                contacts11.setLastName(lastName);
                contacts11.setAddress(address);
                contacts11.setCity(city);
                contacts11.setState(state);
                contacts11.setZip(zip);
                contacts11.setPhone(phone1);
                contacts11.setEmail(email);
                System.out.println(contacts11);
                System.out.println("Contact details updated.");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Contact first name  is not present....");
        } else {
            System.out.println("Contact details updated successfully....");
        }
    }

    static boolean ordering = true;

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Scanner sc = new Scanner(System.in);
        // Do while loop....
        do {
            System.out.println("Welcome to AddressBook Project"
                    + "\n1. Add Contact Details"
                    + "\n2. View Contact details"
                    + "\n3.Update Contact details"
                    + "\n4. Delete Contact details"
                    + "\n5. View All Contact details"
                    + "\n6. Exit ");
            System.out.println("Enter the choice! :");
            int choice = sc.nextInt();

            // Switch Cases..........
            switch (choice) {
                //Add contacts...
                case 1:
                    System.out.println("Add Contacts: ");
                    addressBook.addContact();
                    break;
                // View Contact details....
                case 2:
                    System.out.println("View Contact details....");
                    break;
                // Update Contacts.....
                case 3:
                    System.out.println("Update Contacts: ");
                    addressBook.updateContacts();
                    break;
                // Delete Contacts....
                case 4:
                    System.out.println("Delete Contacts: ");

                    break;
                // Exit from program
                case 5:
                    System.out.println("Ability to add multiple AddressBook..");

                    break;
                case 6:
                default:
                    System.out.println("Please enter valid choice: ");
                    break;

            }
        } while (ordering);
    }
}