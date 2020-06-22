/*
Project: CarDealership Project
Course: IST 242
Author: Joe Oakes
Date Developed: 6/21/2020
Revision: 1
*/
package edu.psu.abington.jzl6344.ist242;

import java.util.ArrayList;

    public class Dealership {
        private String name;
        private String address;

        public Dealership() {
            this.address = "";
            this.name = "";
        }

        public Dealership(String name, String address) {
            this.address = address;
            this.name = name;
        }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public String getAddress() { return address; }
        public void setAddress(String address) { this.address = address; }

        public static void listDealerships(ArrayList<Dealership> dealerList) {
            for (Dealership dealer : dealerList) {
                System.out.println("Dealer Name: " + dealer.getName());
                System.out.println("Dealer address: " + dealer.getAddress());
            }
        }
    }
