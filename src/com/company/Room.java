package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Room {
    int roomNumber;
    int price;
    Guest guest;

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", price=" + price + "$" +
                ", guest=" + guest +
                '}';
    }

    private Room(int roomNumber, int price) {
        this.roomNumber = roomNumber;
        this.price = price;
    }

    public int compareTo(Room otherRoom) {
        return Integer.compare(price, otherRoom.price);
    }

    public void checkIn(Guest guest){
        this.guest = guest;
        System.out.println("Guest check in:"+ toString());
    }

    public void checkOut(){
        System.out.println("Guest check out:"+ toString());
        this.guest = null;
    }



    /**
     * generate Rooms with a roomNumber which will be sorted by the creation time with a random price.
     * @param numberOfRooms number of created rooms
     * @return room list sorted by room number with random price
     */
    public static ArrayList<Room> generateRooms(int numberOfRooms){
        ArrayList<Room> roomList = new ArrayList<Room>();
        for (int index = 1; index<numberOfRooms; index= index+1){
            Room room = new Room(index, generateRoomPriceInRange(10,100));
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
    public static Room findRoomByNumber(int roomNumber, ArrayList<Room>roomList){
        for (Room room:roomList) {
            if (room.roomNumber == roomNumber){
                return room;
            }
        }
            return null;
    }


    public static int generateRoomPriceInRange2(int min, int max){

        return min + new Random().nextInt(max - min);
    }

}
