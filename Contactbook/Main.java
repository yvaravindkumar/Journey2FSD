package org.first.week1.day6contactsproject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ContactBook cb1 = new ContactBook();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("\n Contact Book. Select any option below");
            System.out.println("1 -> List all Contacts");
            System.out.println("2 -> Add a contact");
            System.out.println("3 -> Update a contact");
            System.out.println("4 -> Delete a contact");
            System.out.println("5 -> Get a contact");
            System.out.println("0 -> Exit book\n");

            try {
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice)
                {
                    case 1:{
                        System.out.println("All contacts in phone book: \n");
                        cb1.getAllContacts();
                        break;
                    }
                    case 2:{
                        System.out.println("You are adding a contact");
                        System.out.println("Enter name: ");
                        String name = sc.nextLine();
                        System.out.println("Enter phone number: ");
                        String phoneNum = sc.nextLine();
                        System.out.println("Enter email: ");
                        String email = sc.nextLine();

                        cb1.addContact(new Contact(name,phoneNum,email));
                        break;
                    }
                    case 3:{
                        System.out.println("You are updating a contact");
                        System.out.println("Enter name of contact to be updated: ");
                        String nameToBeUpdated = sc.nextLine();
                        System.out.println("What you want to update:\n");
                        System.out.println("5 -> phone number alone");
                        System.out.println("6 -> email alone");
                        System.out.println("7 -> Both Phone number and Email\n");
                        int option = Integer.parseInt(sc.nextLine());

                        switch (option){
                            case 5:{
                                System.out.println("Enter Phone number: \n");
                                String phoneNumToBeUpdated = sc.nextLine();
                                cb1.updateContactPhoneNum(nameToBeUpdated,phoneNumToBeUpdated);
                                break;
                            }
                            case 6:{
                                System.out.println("Enter Email: \n");
                                String emailToBeUpdated = sc.nextLine();
                                cb1.updateContactEmail(nameToBeUpdated,emailToBeUpdated);
                                break;
                            }
                            case 7:{
                                System.out.println("Enter Phone number: \n");
                                String phoneNumToBeUpdated = sc.nextLine();
                                System.out.println("Enter Email: \n");
                                String emailToBeUpdated = sc.nextLine();
                                cb1.updateContact(nameToBeUpdated,phoneNumToBeUpdated,emailToBeUpdated);
                                break;
                            }
                            default :{
                                System.out.println("incorrect Choice!!");
                            }
                        }
                        break;
                    }
                    case 4:{
                        System.out.println("You are deleting a contact: \n");
                        System.out.println("Enter name of contact to be deleted: ");
                        String nameToBeDeleted = sc.nextLine();
                        cb1.deleteContact(nameToBeDeleted);
                        break;
                    }
                    case 5:{
                        System.out.println("You are getting a specific contact");
                        System.out.println("Enter name of contact to get: ");
                        String nameToFetch = sc.nextLine();
                        cb1.getContact(nameToFetch);
                        break;
                    }
                    case 0:{
                        System.out.println("Exiting contact book!!!");
                        return;
                    }
                    default:{
                        System.out.println("Choose a number from options");
                    }
                }
            }
            catch(NumberFormatException e){
                throw new NumberFormatException("Enter correct number format");
            }
//            finally{
//                System.out.println("You have successfully initiated and exited phonebook");
//            }
        }

    }
}
