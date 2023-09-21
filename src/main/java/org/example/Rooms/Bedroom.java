package org.example.Rooms;


public class Bedroom extends Room{
    private int roomNumber;
    private RoomType roomType;
    private double nightlyRate;
    public Bedroom(int roomNumber, RoomType roomType, int nightlyRate) {
        super(roomType.getCapacity());
        this.roomType = roomType;
        this.roomNumber = roomNumber;
        this.nightlyRate = nightlyRate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public double getNightlyRate() {
        return nightlyRate;
    }
}
