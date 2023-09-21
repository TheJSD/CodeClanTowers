import org.example.Booking;
import org.example.Rooms.Bedroom;
import org.example.Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class BookingTest {
    Bedroom bedroom;
    Booking booking;
    @Before
    public void before() {
        bedroom = new Bedroom(1, RoomType.SINGLE, 50);
        booking = new Booking(bedroom, 4);
    }
    @Test
    public void hasBedroom() {
        assertEquals(bedroom, booking.getBedroom());
    }
    @Test
    public void hasNumberOfNights(){
        assertEquals(4,booking.getNumberOfNights());
    }
    @Test
    public void canGetTotalBill(){
        assertEquals(200, booking.totalBill(), 0.0);
    }
}
