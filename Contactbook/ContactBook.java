package org.first.week1.day6contactsproject;

import java.util.ArrayList;

public class ContactBook {

    ArrayList<Contact> phoneBook = new ArrayList<>();

    void getAllContacts(){
        if(phoneBook.isEmpty()){
            System.out.println("No contacts saved!!!");
        }
        else{
            for(Contact c:phoneBook){
                System.out.println(c);
            }
        }
    }

    void addContact(Contact c){
        phoneBook.add(c);
        System.out.println("Contact added successfully");
    }

    void deleteContact(String name){
        phoneBook.removeIf(c->c.getName().equals(name));
        System.out.println("Contact deleted successfully");
    }

    void updateContact(String name,String phoneNum,String email){
        for(Contact c:phoneBook){
            if(c.getName().equalsIgnoreCase(name)){
                c.setEmail(email);
                c.setPhoneNum(phoneNum);
                System.out.println("Contact updated successfully!!!✅");
                return;
            }
        }
        System.out.println("No contact found with name "+name+" to update");
    }
    void updateContactPhoneNum(String name,String phoneNum){
        for(Contact c:phoneBook){
            if(c.getName().equalsIgnoreCase(name)){
                c.setPhoneNum(phoneNum);
                System.out.println("Contact updated successfully!!!✅");
                return;
            }
        }
        System.out.println("No contact found with name "+name+" to update");
    }
    void updateContactEmail(String name,String email){
        for(Contact c:phoneBook){
            if(c.getName().equalsIgnoreCase(name)){
                c.setPhoneNum(email);
                System.out.println("Contact updated successfully!!!✅");
                return;
            }
        }
        System.out.println("No contact found with name "+name+" to update");
    }

    void getContact(String name){
        for(Contact c:phoneBook){
            if(c.getName().equalsIgnoreCase(name)) {
                System.out.println(c.toString());
                return;
            }
        }
        System.out.println("No contact found");
    }
}
