/*
Project: CarDealership Project
Course: IST 242
Author: Team 6
Date Developed: 6/21/2020
Revision: 1
*/
package edu.psu.abington.jzl6344.ist242;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {
    private ArrayList<Vehicle> vehicleList;
    private ArrayList<Part> partList;

    public Inventory() {
        vehicleList = new ArrayList<Vehicle>();
        partList = new ArrayList<Part>();

        Vehicle v1 = new Vehicle("Toyota", 200000.00, 2020, "12335", 1,
                "CHR", "White");
        Vehicle v2 = new Vehicle("Toyota", 200000.00, 2020, "21345", 2,
                "RAV4", "Black");
        Vehicle v3 = new Vehicle("Toyota", 200000.00, 2020, "31245", 3,
                "Yaris", "Gray");
        vehicleList.add(v1);
        vehicleList.add(v2);
        vehicleList.add(v3);

        Part p1 = new Part(1, "Tire" , "Supplies");
        Part p2 = new Part(2, "Tire Pump" , "Supplies");
        Part p3 = new Part(3, "Flares" , "Supplies");
        partList.add(p1);
        partList.add(p2);
        partList.add(p3);

    }

    public void addVehicle() {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter Vehicle ID: ");
        int Id = scnr.nextInt();
        System.out.println("Enter Vehicle Make: ");
        String make = scnr.nextLine();
        System.out.println("Enter Vehicle Name: ");
        String name = scnr.nextLine();
        System.out.println("Enter Vehicle Year: ");
        int year = scnr.nextInt();
        System.out.println("Enter Vehicle color: ");
        String color = scnr.nextLine();
        System.out.println("Enter Vehicle VinNumber: ");
        String vinN = scnr.nextLine();
        System.out.println("Enter Vehicle Price: ");
        double price = scnr.nextDouble();
        Vehicle vih = new Vehicle(make, price, year, vinN,Id,name,color);
        vehicleList.add(vih);
    }

    public Vehicle searchVehicle(String name) {
        for(int i = 0; i < vehicleList.size(); i++) {
            if(vehicleList.get(i).getVehicleName().equals(name)) {
                return vehicleList.get(i);
            }
        }
        return null;
    }

    public void deleteVehicle(String name) {
        for(int i = 0; i < vehicleList.size(); i++) {
            if(vehicleList.get(i).getVehicleName().equals(name)) {
                vehicleList.remove(i);
                break;
            }
        }
    }

    public void updateVehicle(int vId) {
        for(int i = 0; i < vehicleList.size(); i++) {
            if((""+vehicleList.get(i).getVehicleId()).equals(""+vId)) {
                Scanner scnr = new Scanner(System.in);
                System.out.println("Enter Vehicle ID: ");
                int Id = scnr.nextInt();
                System.out.println("Enter Vehicle Make: ");
                String make = scnr.nextLine();
                System.out.println("Enter Vehicle Name: ");
                String name = scnr.nextLine();
                System.out.println("Enter Vehicle Year: ");
                int year = scnr.nextInt();
                System.out.println("Enter Vehicle color: ");
                String color = scnr.nextLine();
                System.out.println("Enter Vehicle VinNumber: ");
                String vinN = scnr.nextLine();
                System.out.println("Enter Vehicle Price: ");
                double price = scnr.nextDouble();
                Vehicle vih = new Vehicle(make, price, year, vinN,Id,name,color);
                vehicleList.set(i, vih);
            }
        }
    }

    public void addPart() {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter Part Id: ");
        int Id = scnr.nextInt();
        System.out.println("Enter Part Name: ");
        String name = scnr.nextLine();
        System.out.println("Enter Part type: ");
        String type = scnr.nextLine();
        Part part = new Part(Id,name,type);
        partList.add(part);
    }

    public Part searchPart(String name) {
        for(int i = 0; i < partList.size(); i++) {
            if(partList.get(i).getPartName().equals(name)) {
                return partList.get(i);
            }
        }
        return null;
    }

    public void deletePart(String name) {
        for(int i = 0; i < partList.size(); i++) {
            if(partList.get(i).getPartName().equals(name)) {
                partList.remove(i);
                break;
            }
        }
    }

    public void updatePart(int pId) {
        for(int i = 0; i < partList.size(); i++) {
            if((""+partList.get(i).getPartID()).equals(""+pId)) {
                Scanner scnr = new Scanner(System.in);
                System.out.println("Enter Part Id: ");
                int Id = scnr.nextInt();
                System.out.println("Enter Part Name: ");
                String name = scnr.nextLine();
                System.out.println("Enter Part type: ");
                String type = scnr.nextLine();
                Part part = new Part(Id,name,type);
                partList.set(i, part);
            }
        }
    }
}


