package com.VivekGuestManagement.GuestManagement.controller;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GuestDaoService {

    private static List<Guest> guests = new ArrayList<>();


    static {
        guests.add(new Guest(1,"Tejas", 22, "Bangalore"));
        guests.add(new Guest(2,"Vivek", 32, "Mandya"));
        guests.add(new Guest(3,"Harini", 16, "Bangalore"));
    }

    public List<Guest> getGuests(){
        return guests;
    }

    public Guest getGuestByID(int id){
        for (Guest guest : guests){
            if (guest.getId() == id){
                return guest;
            }
        }
        return null;
    }
}
