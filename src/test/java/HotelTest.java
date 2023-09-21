import org.example.Guest;
import org.example.Hotel;
import org.example.Rooms.Bedroom;
import org.example.Rooms.DiningRoom;
import org.example.Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;
    Bedroom bedroom;
    Bedroom bedroom2;
    Guest guest;
    Guest guest2;
    DiningRoom diningRoom;
    @Before
    public void before(){
        hotel = new Hotel();
        bedroom = new Bedroom(1, RoomType.SINGLE, 50);
        bedroom2 = new Bedroom(2, RoomType.DOUBLE, 75);
        guest = new Guest("Ann");
        guest2 = new Guest("Bob");
        diningRoom = new DiningRoom(8,"The Dining Room");
    }
    @Test
    public void roomsListStartsEmpty(){
        assertEquals(0, hotel.getNumberOfRooms());
    }
    @Test
    public void canHaveRooms(){
        hotel.addRoom(bedroom);
        assertEquals(1, hotel.getNumberOfRooms());
    }
    @Test
    public void canAddGuestToRoom(){
        hotel.checkInGuest(guest, bedroom);
        assertEquals(1,bedroom.getNumberOfGuestsInRoom());
    }
    @Test
    public void canAddMultipleGuestsToRoom(){
        ArrayList<Guest> guests = new ArrayList<>();
        guests.add(guest);
        guests.add(guest2);
        hotel.checkInGuest(guests, bedroom2);
        assertEquals(2, bedroom2.getNumberOfGuestsInRoom());
    }
    @Test
    public void cannotAddMultipleGuestsOverCapacity(){
        ArrayList<Guest> guests = new ArrayList<>();
        guests.add(guest);
        guests.add(guest2);
        hotel.checkInGuest(guests, bedroom);
        assertEquals(0, bedroom.getNumberOfGuestsInRoom());
    }
    @Test
    public void canRemoveGuestFromRoom(){
        hotel.checkInGuest(guest, bedroom);
        hotel.checkOutGuest(bedroom);
        assertEquals(0,bedroom.getNumberOfGuestsInRoom());
    }
    @Test
    public void canAddDiningRoom(){
        hotel.addDiningRoom(diningRoom);
        HashMap<String, DiningRoom> test = new HashMap<>();
        test.put("The Dining Room", diningRoom);
        assertEquals(test, hotel.getDiningRooms());
    }
    @Test
    public void canGetVacantRooms(){
    hotel.addRoom(bedroom);
    hotel.addRoom(bedroom2);
    hotel.checkInGuest(guest, bedroom);
    ArrayList<Bedroom> expectedEmptyRooms = new ArrayList<>();
    expectedEmptyRooms.add(bedroom2);
    assertEquals(expectedEmptyRooms, hotel.getVacantBedrooms());
    }
    @Test
    public void cannotDoMultipleSingleCheckIns(){
        hotel.checkInGuest(guest, bedroom2);
        hotel.checkInGuest(guest2, bedroom2);
        assertEquals(1,bedroom2.getNumberOfGuestsInRoom());
    }
}
