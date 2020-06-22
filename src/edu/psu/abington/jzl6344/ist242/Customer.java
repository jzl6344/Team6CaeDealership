/*
Project: CarDealership Project
Course: IST 242
Author: Joe Oakes
Date Developed: 6/21/2020
Revision: 1
*/
package edu.psu.abington.jzl6344.ist242;

import java.util.ArrayList;

public class Customer extends User implements UserInterface<Customer>{
    private String email;

    public Customer() {
        this.email = "";
    }

    public Customer(int id, String name, String address, String phone, String email) {
        super(id, name, address, phone);
        this.email = email;
    }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String toString() {
        String s = "";
        s = s+"\nCustomer ID: " + this.getId();
        s = s+"\nName: " + this.getName();
        s = s+"\naddress: " +this.getAddress();
        s = s+"\nPhone Number: " + this.getPhoneNumber();
        s = s+"\nEmail: " + this.getEmail();

        return s;
    }
    public Customer search(int id, ArrayList<Customer> custList) {
        for(int i = 0; i < custList.size(); i++) {
            if((""+custList.get(i).getId()).equals(""+id)) {
                return custList.get(i);
            }
        }
        return null;
    }
}
