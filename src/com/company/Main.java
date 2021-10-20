package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Guest guest1 = new Guest("Alex", 33.00);
        Guest guest2 = new Guest("Sergiu", 150.00);
        Guest guest3 = new Guest("Roxana", 600.00);
        Guest guest4 = new Guest("Andreea", 220.00);
        Guest guest5 = new Guest("Radu", 777.00);

        //Hotel.hotelManager.saveGuest(guest1);

        System.out.println(guest1);
        ArrayList<Hotel> resultList = Hotel.class.getMethods();
        System.out.println(resultList);

    }
}
