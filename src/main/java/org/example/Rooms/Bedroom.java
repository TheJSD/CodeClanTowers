package org.example.Rooms;

import org.example.Guest;

public class Bedroom extends Room{
    private int roomNumber;
    private RoomType roomType;
    public Bedroom(int roomNumber, RoomType roomType) {
        super(roomType.getCapacity());
        this.roomType = roomType;
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }
}
