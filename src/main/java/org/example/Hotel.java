package org.example;

import org.example.Rooms.Room;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Room> rooms;

    public Hotel() {
        this.rooms = new ArrayList<>();
    }

    public int getNumberOfRooms(){
        return this.rooms.size();
    }
    public void addRoom(Room room) {
        this.rooms.add(room);
    }
}
