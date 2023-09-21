package org.example.Rooms;

import org.example.Guest;

import java.util.ArrayList;

public abstract class Room {
    int capacity;
    private ArrayList<Guest> guests;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }
    public int getNumberOfGuestsInRoom(){
        return this.guests.size();
    }
    public void addGuest(Guest guest){
        this.guests.add(guest);
    }
}
