import org.example.Guest;
import org.example.Rooms.DiningRoom;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class DiningRoomTest {
    DiningRoom diningRoom;
    Guest guest;
    @Before
    public void before(){
        diningRoom = new DiningRoom(5,"The Dining Room");
        guest = new Guest("Ann");
    }
    @Test
    public void guestsStartEmpty(){
        assertEquals(0, diningRoom.getNumberOfGuestsInRoom());
    }
    @Test
    public void hasName(){
        assertEquals("The Dining Room", diningRoom.getName());
    }
    @Test
    public void canAddGuests(){
        diningRoom.addGuest(guest);
        assertEquals(1, diningRoom.getNumberOfGuestsInRoom());
    }
    @Test
    public void diningRoomCanGetSize(){
        assertEquals(500,DiningRoom.getSize(50,10), 0.0);
    }
}
