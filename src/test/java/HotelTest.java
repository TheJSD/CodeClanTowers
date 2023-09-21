import org.example.Hotel;
import org.example.Rooms.Bedroom;
import org.example.Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;
    Bedroom bedroom;
    @Before
    public void before(){
        hotel = new Hotel();
        bedroom = new Bedroom(1, RoomType.SINGLE);
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
}
