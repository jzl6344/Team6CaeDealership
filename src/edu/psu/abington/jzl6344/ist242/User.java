package edu.psu.abington.jzl6344.ist242;

public class User {
    private int Id;
    private String Name;
    private String address;
    private String phoneNumber;

    public User() {
        this.Id = -1;
        this.Name = "";
        this.address = "";
        this.phoneNumber = "";
    }

    public User(int id, String name, String address, String phone) {
        this.Id = id;
        this.Name = name;
        this.address = address;
        this.phoneNumber = phone;
    }

    public int getId() { return Id; }
    public void setId(int id) { Id = id; }

    public String getName() { return Name; }
    public void setName(String name) { Name = name; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
}
