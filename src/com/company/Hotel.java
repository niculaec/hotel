package com.company;

import java.util.ArrayList;

public class Hotel {
    Hotel hotelManager = new Hotel();
    ArrayList<Room> roomLists = new ArrayList<Room>();
    ArrayList<Guest> guestLists = new ArrayList<Guest>();

    public void saveGuest(Guest guest) {
        guestLists.add(guest);
    }

    public void checkIn(Guest guest){


    }

    public void checkOut( Guest guest){

    }

}

