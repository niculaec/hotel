package com.company;

public class Room {
    int roomNumber;
    double price;
    Guest guest;


    public Room(int roomNumber, double price,Guest guest) {
        this.roomNumber = roomNumber;
        this.price = price;
        this.guest = guest;
    }
    public Room checkIn(Guest guest){

        return checkIn(guest);
    }
    public Room checkOut(Guest guest){

        return checkOut(guest);
    }



}
