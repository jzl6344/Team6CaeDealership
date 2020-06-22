package edu.psu.abington.jzl6344.ist242;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Main main = new Main();

        Scanner scnr = new Scanner(System.in);

        ArrayList<SalesPerson> saleList = new ArrayList<>();
        ArrayList<Dealership> dealerList = new ArrayList<>();
        ArrayList<Customer> custList = new ArrayList<>();
        ArrayList<SalesLeader> leadList = new ArrayList<>();

        Dealership d1 = new Dealership("Team6","1234 South Cat Street, Philadelphia PA 00000");
        dealerList.add(d1);

        System.out.println("Welcome to Team 6 Car Dealership");
        Dealership.listDealerships(dealerList);

        SalesPerson s1 = new SalesPerson(1, "Wenhua", "1234 World Street", "123-456-1234");
        SalesPerson s2 = new SalesPerson(2, "Nina", "2134 World Street", "213-234-2341");
        SalesPerson s3 = new SalesPerson(3, "Jiahao", "3124 World Street", "312-213-2134");
        SalesPerson s4 = new SalesPerson(4, "Zicheng", "4213 World Street", "432-231-4312");
        saleList.add(s1);
        saleList.add(s2);
        saleList.add(s3);
        saleList.add(s4);

        Customer c1 = new Customer(1,"Yeak", "1111 Cat St", "123-234-4444",
                "1234@mail.com");
        custList.add(c1);

        SalesLeader l1 = new SalesLeader(1,"totto", "10/10/2010", "123-111-2222",
                "Toyota");
        leadList.add(l1);


        Inventory inventory = new Inventory();
        Scanner menuChoice = new Scanner(System.in);
        int mainMeun;
        do {
            System.out.println("\n1: Inventory Menu\n2: Add Customer\n3: Add SaleLead\n4: Search SalesPerson\n5: Customer\n6: Quit\n");
            System.out.println("\n Enter your choice: ");
            mainMeun = menuChoice.nextInt();
            switch (mainMeun) {
                case 1 :
                    int choice;
                    System.out.println("\n1.Vehicle");
                    System.out.println("2.Part");
                    System.out.println("3.Exit");
                    System.out.println("\n Enter your choice: ");
                    choice = scnr.nextInt();

                    switch(choice) {
                        case 1:
                            int ch;
                            System.out.println("\n1.Add");
                            System.out.println("2.Update");
                            System.out.println("3.Delete");
                            System.out.println("4.Search");
                            System.out.println("5.Exit");
                            System.out.println("\n Enter your choice: ");
                            ch = scnr.nextInt();

                            switch(ch) {
                                case 1:
                                    inventory.addVehicle();
                                    break;
                                case 2:
                                    int vid;
                                    System.out.println("\n Enter vehicle Id to update: ");
                                    vid = scnr.nextInt();
                                    inventory.updateVehicle(vid);
                                    break;
                                case 3:
                                    String vname;
                                    System.out.println("\n Enter vehicle name to delete: ");
                                    vname = scnr.next();
                                    inventory.deleteVehicle(vname);
                                    break;
                                case 4:
                                    String name;
                                    System.out.println("\n Enter vehicle name to search: ");
                                    name = scnr.next();
                                    Vehicle vv = inventory.searchVehicle(name);
                                    System.out.println(vv);
                                    break;
                                case 5:
                                    System.exit(0);
                            }
                            break;
                        case 2:
                            int ch1;
                            System.out.println("\n1.Add");
                            System.out.println("2.Update");
                            System.out.println("3.Delete");
                            System.out.println("4.Search");
                            System.out.println("5.Exit");
                            System.out.println("\n Enter your choice: ");
                            ch1 = scnr.nextInt();

                            switch(ch1) {
                                case 1:
                                    inventory.addPart();
                                    break;
                                case 2:
                                    int pid;
                                    System.out.println("\n Enter part Id to update: ");
                                    pid = scnr.nextInt();
                                    inventory.updatePart(pid);
                                    break;
                                case 3:
                                    String pname;
                                    System.out.println("\n Enter part name to delete: ");
                                    pname = scnr.next();
                                    inventory.deletePart(pname);
                                    break;
                                case 4:
                                    String name;
                                    System.out.println("\n Enter part name to search: ");
                                    name = scnr.next();
                                    Part pp = inventory.searchPart(name);
                                    System.out.println(pp);
                                    break;
                                case 5:
                                    System.exit(0);
                            }
                            break;
                        case 3:
                            break;
                    }
                    break;
                case 2 : {
                    custList.add(main.addCustomer());
                    break;
                }
                case 3 : {
                    leadList.add(main.addSaleLead());
                    break;
                }
                case 4 : {
                    int custid;
                    System.out.println("Enter customer Id to search: ");
                    custid = scnr.nextInt();
                    Customer cust = new Customer().search(custid, custList);
                    System.out.println(cust);
                    break;
                }
                case 5 : {
                    int salepid;
                    System.out.println("Enter sales person Id to search: ");
                    salepid = scnr.nextInt();
                    SalesPerson sp = new SalesPerson().search(salepid, saleList);
                    System.out.println(sp);
                    break;
                }
                case 6 : {
                    System.out.println("Quit Dealership");
                    System.exit(0);
                }
            }
        } while (mainMeun != 10);

    }

    public Customer addCustomer(){
        Customer cust;
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter Customer Id: ");
        int Id = scnr.nextInt();
        System.out.println("Enter Customer name: ");
        String name = scnr.nextLine();
        System.out.println("Enter Customer Address: ");
        String address = scnr.nextLine();
        System.out.println("Enter Customer PhoneNumber: ");
        String PhoneNumber = scnr.nextLine();
        System.out.println("Enter Customer Email: ");
        String email = scnr.nextLine();
        cust = new Customer(Id,name,address,PhoneNumber,email);
        return cust;
    }

    public SalesLeader addSaleLead(){
        SalesLeader lead;
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter SaleLead Id: ");
        int Id = scnr.nextInt();
        System.out.println("Enter SaleLead Name: ");
        String name = scnr.nextLine();
        System.out.println("Enter SaleLead join Date: ");
        String date = scnr.nextLine();
        System.out.println("Enter SaleLead PhoneNumber: ");
        String phone = scnr.nextLine();
        System.out.println("Enter what SaleLead interest: ");
        String interest = scnr.nextLine();
        lead = new SalesLeader(Id,name,date,phone,interest);
        return lead;
    }

}