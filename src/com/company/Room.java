package com.company;

import java.util.Random;

public class Room {
    int roomNumber;
    int price;
    Guest guest;


    public Room(int roomNumber, int price) {
        this.roomNumber = roomNumber;
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
        ROOM_NUMBER801
    }

    public static int roomPriceRange(){
        Random random = new Random();
        int randomPrice = random.nextInt(30 + 120);
        return randomPrice;
    }

}
