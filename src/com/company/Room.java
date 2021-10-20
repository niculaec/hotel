package com.company;

public class Room {
    int roomNumber;
    double price;
    Guest guest;

    public Room(int roomNumber, double price) {
        this.roomNumber = roomNumber;
        this.price = price;
    }

    public void checkIn(Guest guest){
        this.guest = guest;
    }

    public void checkOut(Guest guest){
        this.guest = null;
    }

    public enum RoomNumber{
        ROOM_NUMBER101,
        ROOM_NUMBER201,
        ROOM_NUMBER301,
        ROOM_NUMBER401,
        ROOM_NUMBER501,
        ROOM_NUMBER601,
        ROOM_NUMBER701,
        ROOM_NUMBER801;
    }

}
