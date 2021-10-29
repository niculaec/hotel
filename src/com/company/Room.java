package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Room {
    int roomNumber;
    int price;
    Guest guest;


    public Room(int roomNumber, int price) {

        this.roomNumber = roomNumber;
        this.price = price;
    }

    public void checkIn(Guest guest){

        this.guest = guest;
    }

    public void checkOut(Guest guest){

        this.guest = null;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", price=" + price +
                ", guest=" + guest +
                '}';
    }

    /**
     * generate Rooms with a roomNumber which will be sorted by the room number with a random price.
     * @param numberOfRooms number of created rooms
     * @return room list sorted by room number with random price
     */
    public static ArrayList<Room> generateRooms(int numberOfRooms){
        ArrayList<Room> roomList = new ArrayList<Room>();
        for (int index = 1; index<numberOfRooms; index= index + 1){
            Room room = new Room(index,generateRoomPriceInRange(2,10));
            roomList.add(room);
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
