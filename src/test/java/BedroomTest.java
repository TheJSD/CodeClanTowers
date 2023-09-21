import org.example.Guest;
import org.example.Rooms.Bedroom;
import org.example.Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BedroomTest {
    Bedroom bedroom;
    Guest guest;
    @Before
    public void before(){
        bedroom = new Bedroom(1, RoomType.SINGLE, 50);
        guest = new Guest("Ann");
    }
    @Test
    public void canGetRoomNumber(){
        assertEquals(1, bedroom.getRoomNumber());
    }
    @Test
    public void canGetRoomType(){
        assertEquals(RoomType.SINGLE, bedroom.getRoomType());
    }
    @Test
    public void canGetCapacity(){
        assertEquals(1, bedroom.getCapacity());
    }
    @Test
    public void canAddGuest(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.getNumberOfGuestsInRoom());
    }
    @Test
    public void canRemoveGuest(){
        bedroom.addGuest(guest);
        bedroom.checkOutGuests();
        assertEquals(0, bedroom.getNumberOfGuestsInRoom());
    }
    @Test
    public void canGetNightlyRate(){
        assertEquals(50, bedroom.getNightlyRate(), 0.0);
    }
    @Test
    public void bedroomCanGetSize(){
        assertEquals(30,Bedroom.getSize(10,3),0.0);
    }
    @Test
    public void isEmptyTrueWhenEmpty(){
        assertTrue(bedroom.isEmpty());
    }
    @Test
    public void isEmptyFalseWhenHasSomeone(){
        bedroom.addGuest(guest);
        assertFalse(bedroom.isEmpty());
    }
}
