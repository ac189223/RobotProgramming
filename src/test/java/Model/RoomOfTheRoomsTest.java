package Model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests for the Room class (10 tests)
 *
 * @author andrzejcalka
 * @author =-_-=
 */
public class RoomOfTheRoomsTest {

    @Test
    public void roomCreationTest_MinX01() {
        // Act
        RoomOfTheRooms room = new RoomOfTheRooms(10, 20, 2);
        // Assert
        assertEquals(0, room.getMinX());
    }

    @Test
    public void roomCreationTest_MinX02_Rounded() {
        // Arrange
        RoomOfTheRooms room = new RoomOfTheRooms(65, 20, 2);
        // Act
        room.setMinX(52);
        // Assert
        assertEquals(2, room.getMinX());
    }

    @Test
    public void roomCreationTest_MaxX01() {
        // Act
        RoomOfTheRooms room = new RoomOfTheRooms(10, 20, 2);
        // Assert
        assertEquals(10, room.getMaxX());
    }

    @Test
    public void roomCreationTest_MaxX02_Rounded() {
        // Act
        RoomOfTheRooms room = new RoomOfTheRooms(65, 20, 2);
        // Assert
        assertEquals(15, room.getMaxX());
    }

    @Test
    public void roomCreationTest_MinY01() {
        // Act
        RoomOfTheRooms room = new RoomOfTheRooms(10, 20, 2);
        // Assert
        assertEquals(0, room.getMinY());
    }

    @Test
    public void roomCreationTest_MinY02_Rounded() {
        // Arrange
        RoomOfTheRooms room = new RoomOfTheRooms(65, 20, 2);
        // Act
        room.setMinY(76);
        // Assert
        assertEquals(26, room.getMinY());
    }

    @Test
    public void roomCreationTest_MaxY01() {
        // Act
        RoomOfTheRooms room = new RoomOfTheRooms(10, 20, 2);
        // Assert
        assertEquals(20, room.getMaxY());
    }

    @Test
    public void roomCreationTest_MaxY02_Rounded() {
        // Act
        RoomOfTheRooms room = new RoomOfTheRooms(10, 74, 2);
        // Assert
        assertEquals(24, room.getMaxY());
    }

    @Test
    public void roomCreationTest_Mode01() {
        // Act
        RoomOfTheRooms room = new RoomOfTheRooms(10, 20, 2);
        // Assert
        assertEquals(2, room.getMode());
    }

    @Test
    public void roomCreationTest_Mode02_Rounded() {
        // Act
        RoomOfTheRooms room = new RoomOfTheRooms(10, 20, 7);
        // Assert
        assertEquals(3, room.getMode());
    }
}
