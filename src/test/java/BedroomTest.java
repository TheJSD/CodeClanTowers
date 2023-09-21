import org.example.Guest;
import org.example.Rooms.Bedroom;
import org.example.Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom;
    Guest guest;
    @Before
    public void before(){
        bedroom = new Bedroom(1, RoomType.SINGLE);
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
}
