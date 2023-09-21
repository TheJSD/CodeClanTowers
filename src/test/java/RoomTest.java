import org.example.Rooms.Room;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RoomTest {
    @Test
    public void canGetSize(){
        assertEquals(125, Room.getSize(25,5), 0.001);
    }
}
