/*
Project: CarDealership Project
Course: IST 242
Author: Team 6
Date Developed: 6/21/2020
Revision: 1
*/
package edu.psu.abington.jzl6344.ist242;

import java.util.ArrayList;

public interface UserInterface<T> {
    public T search(int id, ArrayList<T> list);
}
