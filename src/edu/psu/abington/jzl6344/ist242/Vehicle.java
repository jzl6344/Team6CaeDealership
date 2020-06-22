package edu.psu.abington.jzl6344.ist242;

import java.util.ArrayList;

public class Vehicle {
    private int vehicleId;
    private String vehicleMake;
    private String vehicleName;
    private int vehicleYear;
    private String vehicleColor;
    private String vehicleVinNumber;
    private double vehiclePrice;

    public Vehicle() {
        this.vehicleMake = "";
        this.vehicleColor = "";
        this.vehiclePrice = -1;
        this.vehicleYear = -1;
        this.vehicleVinNumber = "";
        this.vehicleId = -1;
        this.vehicleName = "";
    }

    public Vehicle(String make, double price, int year, String VinNumber, int id, String name, String color) {
        this.vehicleMake = make;
        this.vehicleColor = color;
        this.vehiclePrice = price;
        this.vehicleYear = year;
        this.vehicleVinNumber = VinNumber;
        this.vehicleId = id;
        this.vehicleName = name;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleMake() {
        return vehicleMake;
    }

    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public int getVehicleYear() {
        return vehicleYear;
    }

    public void setVehicleYear(int vehicleYear) {
        this.vehicleYear = vehicleYear;
    }

    public String getVehicleColor() {
        return vehicleColor;
    }

    public void setVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
    }

    public String getVehicleVinNumber() {
        return vehicleVinNumber;
    }

    public void setVehicleVinNumber(String vehicleVinNumber) {
        this.vehicleVinNumber = vehicleVinNumber;
    }

    public double getVehiclePrice() {
        return vehiclePrice;
    }

    public void setVehiclePrice(int vehiclePrice) {
        this.vehiclePrice = vehiclePrice;
    }

    public static void listVehicle(ArrayList<Vehicle> vehicleList) {
        for (Vehicle veh : vehicleList) {
            System.out.println("Id: " + veh.getVehicleId());
            System.out.println("Make: " + veh.getVehicleMake());
            System.out.println("Name: " + veh.getVehicleName());
            System.out.println("Year: " + veh.getVehicleYear());
            System.out.println("Color: " + veh.getVehicleColor());
            System.out.println("VinNumber: " + veh.getVehicleVinNumber());
            System.out.println("Price: " + veh.getVehiclePrice());
        }
    }

    public String toString() {
        String s = "";

        s = s + "\nId: " + this.getVehicleId();
        s = s + "\nMake: " + this.getVehicleMake();
        s = s + "\nName: " + this.getVehicleName();
        s = s + "\nYear: " + this.getVehicleYear();
        s = s + "\nColor: " + this.getVehicleColor();
        s = s + "\nVinNumber: " + this.getVehicleVinNumber();
        s = s + "\nPrice: " + this.getVehiclePrice();

        return s;
    }
}
