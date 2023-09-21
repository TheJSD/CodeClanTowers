package org.example;

import org.example.Rooms.Bedroom;
import org.example.Rooms.DiningRoom;
import org.example.Rooms.Room;

import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {
    private ArrayList<Room> rooms;
    private HashMap<String, DiningRoom> diningRooms;

    public Hotel() {
        this.rooms = new ArrayList<>();
        this.diningRooms = new HashMap<>();
    }

    public int getNumberOfRooms(){
        return this.rooms.size();
    }
    public void addRoom(Room room) {
        this.rooms.add(room);
    }
    public void checkInGuest(Guest guest, Room room){
        if (room.getCapacity() > 0 && room.isEmpty()) {
            room.addGuest(guest);
        }
    }
    public void checkInGuest(ArrayList<Guest> guests, Room room) {
        if (guests.size() <= room.getCapacity()){
            for (Guest guest: guests) {
                room.addGuest(guest);
            }
        }
    }
    public void checkOutGuest(Room room){
        if (!room.isEmpty()) {
            room.checkOutGuests();
        }
    }
    public void addDiningRoom(DiningRoom diningRoom) {
        this.diningRooms.put(diningRoom.getName(), diningRoom);
    }
    public HashMap<String, DiningRoom> getDiningRooms() {
        return diningRooms;
    }
    public ArrayList<Bedroom> getVacantBedrooms(){
        ArrayList<Bedroom> vacantBedrooms = new ArrayList<>();
        for (Room room : this.rooms) {
            if (room instanceof Bedroom && room.isEmpty()) {
                vacantBedrooms.add((Bedroom) room);
            }
        }
        return vacantBedrooms;
    }
}
