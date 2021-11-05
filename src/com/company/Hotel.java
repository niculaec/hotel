package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Hotel {
    ArrayList<Room> roomList = new ArrayList<Room>();
    double revenue;

    public Hotel(int numberOfRooms) {
        roomList.addAll(Room.generateRooms(numberOfRooms));

    }


    public void displayHotelRevenue(){
        System.out.println("This is Hotel revenue:" + "\n" + revenue + "$");
    }

    public ArrayList<Guest> getAllClients(){
        ArrayList<Guest> guestsList = new ArrayList<Guest>();
        for (Room room:roomList) {
            if (room.guest != null){
                guestsList.add(room.guest);
            }
        }
        return guestsList;
    }

    // luam un client ii atribuim cea mai scumpa camera pe care si-o permite in functie de banii atribuiti, ii scadem din banii clientului suma respectiva si o adaugam la venitul(revenue) Hotelului.

    //indiciu: sortam lista de camere dupa pret descrescator. Pentru fiecare camera comparam pretul camerei cu banii clientului. Bagam clientul in camera(room check in), scadem pretul camerei din banii clientului si ii adaugam la venitul hotelului.

    public void checkIn(Guest guest){
        boolean guestWasCheckIn = false;
        roomList.sort(Collections.reverseOrder(Room::compareTo));
        for (Room room:roomList) {
            if (room.guest == null && room.price <= guest.money){
                guest.money = guest.money - room.price;
                revenue = revenue + room.price;
                room.checkIn(guest);
                guestWasCheckIn = true;
                break;
            }
        }
        if (!guestWasCheckIn){
            System.out.println("Not enough money");
        }
    }
    public ArrayList<Room> findRoomByNumber(int roomNr){
        ArrayList <Room> roomArrayList = new ArrayList<>();
        for (Room room:roomList) {
            if (room.roomNumber == roomNr)
                roomArrayList.add(room);
        }
        return null;
    }
    //decazam clientul din camera unde este cazat(de unde stim noi asta?)
    //pentru fiecare guest care nu este null
    public void checkOut( Guest guest){
        for (Room room:roomList) {
            if (room.guest == guest){
                room.checkOut(guest);
                break;
            }
        }
    }
    public void checkOutByRoomNumber( Guest guest){
        for (Room room:roomList) {
            if (room.guest == guest){
                room.checkOut(guest);
                break;
            }
        }
    }

}