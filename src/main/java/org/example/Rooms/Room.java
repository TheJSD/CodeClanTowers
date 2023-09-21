package org.example.Rooms;

import org.example.Guest;

import java.util.ArrayList;

public abstract class Room {
    int capacity;
    private ArrayList<Guest> guests;
    private double length;
    private double width;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }


    public int getNumberOfGuestsInRoom(){
        return this.guests.size();
    }
    public void addGuest(Guest guest){
            this.guests.add(guest);
        }

    public void checkOutGuests(){
        this.guests.clear();
    }
    public static double getSize(double length, double width){
        return length*width;
    }
    public boolean isEmpty() {
        return !(this.getNumberOfGuestsInRoom() >0);
    }
}
