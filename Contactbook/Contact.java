package org.first.week1.day6contactsproject;

public class Contact {
    private String name;
    private String phoneNum;
    private String email;

    Contact(){};
    Contact(String name, String phoneNum, String email){
        this.name=name;
        this.phoneNum=phoneNum;
        this.email=email;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){this.name=name;}
    public String getPhoneNum() {
        return phoneNum;
    }
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String toString(){
        return "Name: "+getName()+"\nPhone Number: "+getPhoneNum()+"\nEmail: "+getEmail();
    }

}
