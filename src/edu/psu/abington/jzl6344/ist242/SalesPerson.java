/*
Project: CarDealership Project
Course: IST 242
Author: Team 6
Date Developed: 6/21/2020
Revision: 1
*/
package edu.psu.abington.jzl6344.ist242;

import java.util.ArrayList;

public class SalesPerson extends User implements UserInterface<SalesPerson>{

    public SalesPerson() {
        super();
    }

    public SalesPerson(int id, String name, String addr,String phone) {
        super(id, name, addr, phone);
    }

    public String toString() {
        String s = "";
        s = s+"\nSalesPerson Id: " + this.getId();
        s = s+"\nName: " + this.getName();
        s = s+"\nAddress: " + this.getAddress();
        s = s+"\nPhone: " + this.getPhoneNumber();

        return s;
    }
    public SalesPerson search(int id, ArrayList<SalesPerson> saleList) {
        for(int i = 0; i < saleList.size(); i++) {
            if((""+saleList.get(i).getId()).equals(""+id)) {
                return saleList.get(i);
            }
        }
        return null;
    }


}
