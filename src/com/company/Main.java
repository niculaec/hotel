package com.company;

public class Main {
    public static void main(String[] args) {
        Guest guest1 = new Guest("Alex", 33.00);
        Guest guest2 = new Guest("Sergiu", 150.00);
        Guest guest3 = new Guest("Roxana", 600.00);
        Guest guest4 = new Guest("Andreea", 220.00);
        Guest guest5 = new Guest("Radu", 777.00);

        Hotel hotel = new Hotel();

        hotel.checkIn(guest1);
        hotel.checkIn(guest2);
        hotel.checkIn(guest3);
        hotel.checkIn(guest4);
        hotel.checkIn(guest5);

        System.out.println(hotel.roomLists);
        System.out.println("Random price for a room is :");

        System.out.println(Room.generateRoomPriceInRange(10,100) + "$");

        System.out.println(Room.generateRoomPriceInRange2(6,123) + "$");
        
        System.out.println("Hotel rooms are:");
        for (Room ddd: Room.generateRooms(5)) {
            System.out.println(ddd.toString());
        }

    }
}
