package com.company;

import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Hotel athenePalace = new Hotel(272);

        athenePalace.checkIn(new Guest("Alex", 9.00));
        athenePalace.checkIn(new Guest("Sergiu", 150.00));
        athenePalace.checkIn(new Guest("Roxana", 600.00));
        athenePalace.checkIn(new Guest("Andreea", 220.00));
        athenePalace.checkIn(new Guest("Radu", 777.00));

        System.out.println("This is the Room List:");
            ArrayList<Guest> guestList = athenePalace.getAllClients();
            athenePalace.checkOut(guestList.get(2));
            athenePalace.checkOut(guestList.get(3));
            athenePalace.checkOut(guestList.get(0));
            athenePalace.checkOut(guestList.get(0));
            athenePalace.checkOut(guestList.get(0));

        athenePalace.displayHotelRevenue();

        //sa introduc numarul camere si nu guestList.indexOf
        //sa recazam acelasi client dar cand se intoarce sa vina cu banii cu care a plecat
   }
}
