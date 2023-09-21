import org.example.Guest;
import org.example.Rooms.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class ConferenceRoomTest {
    ConferenceRoom conferenceRoom;
    Guest guest;
    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom("The Room", 8);
        guest = new Guest("Ann");
    }
    @Test
    public void hasName(){
        assertEquals("The Room", conferenceRoom.getName());
    }
    @Test
    public void canAddGuest(){
        conferenceRoom.addGuest(guest);
        assertEquals(1, conferenceRoom.getNumberOfGuestsInRoom());
    }

}
