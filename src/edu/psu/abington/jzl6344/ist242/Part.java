/*
Project: CarDealership Project
Course: IST 242
Author: Joe Oakes
Date Developed: 6/21/2020
Revision: 1
*/
package edu.psu.abington.jzl6344.ist242;

import java.util.ArrayList;

public class Part {
    private int partID;
    private String partName;
    private String partType;

    public Part () {
        this.partID= -1;
        this.partName = "";
        this.partType = "";
    }

    public Part (int ID, String name, String type) {
        this.partID= ID;
        this.partName = name;
        this.partType = type;
    }

    public int getPartID() { return partID; }
    public void setPartID(int partID) { this.partID = partID; }

    public String getPartName() { return partName; }
    public void setPartName(String partName) { this.partName = partName; }

    public String getPartType() { return partType; }
    public void setPartType(String partType) { this.partType = partType; }

    public static void listPart(ArrayList<Part> partList) {
        for (Part part : partList) {
            System.out.println("Part ID: " + part.getPartID());
            System.out.println("Part Name: " + part.getPartName());
            System.out.println("Part Type: " + part.getPartType());
        }
    }
    public String toString() {
        String s="";

        s=s+"\nPart ID: " + this.getPartID();
        s=s+"\nPart Name: " + this.getPartName();
        s=s+"\nPart Type: " + this.getPartType();

        return s;
    }
}
