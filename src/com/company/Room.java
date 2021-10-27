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

    /**
     * generate Rooms with a roomNumber which will be sorted by the creation time with a random price.
     * @param numberOfRooms number of created rooms
     * @return room list sorted by room number with random price
     */
    public static ArrayList<Room> generateRooms(int numberOfRooms){
        ArrayList<Room> roomList = new ArrayList<Room>();
        for (numberOfRooms = 1; numberOfRooms <100; numberOfRooms++){

        }
            return roomList;
    }

    public static int generateRoomPriceInRange(int min, int max){
        int result = new Random().nextInt(max);
        if (result < min){
            return min;
        }
        return result;
    }

    public static int generateRoomPriceInRange2(int min, int max){

        return min + new Random().nextInt(max - min);
    }


}
