package Model;

import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

/**
 * Tests for the Robot class (10 tests)
 *
 * @author andrzejcalka
 * @author =-_-=
 */
public class RobotJimTest {

    @Test
    public void robotJimCreationTest_Direction01() {
        // Act
        RobotJim robotJim = new RobotJim(2, new Point(10,20));
        // Assert
        assertEquals(2, robotJim.getDirection());
    }

    @Test
    public void robotJimCreationTest_Direction02_Rounded() {
        // Act
        RobotJim robotJim = new RobotJim(9, new Point(10,20));
        // Assert
        assertEquals(1, robotJim.getDirection());
    }

    @Test
    public void robotJimCreationTest_PositionX01() {
        // Act
        RobotJim robotJim = new RobotJim(2, new Point(10,20));
        // Assert
        assertEquals(10, robotJim.getPosition().x);
    }

    @Test
    public void robotJimCreationTest_PositionY01() {
        // Act
        RobotJim robotJim = new RobotJim(2, new Point(10,20));
        // Assert
        assertEquals(20, robotJim.getPosition().y);
    }

    @Test
    public void robotJimCreationTest_AmountOfLives01() {
        // Act
        RobotJim robotJim = new RobotJim(2, new Point(10,20));
        // Assert
        assertEquals(3, robotJim.getAmountOfLives());
    }

    @Test
    public void robotJimCreationTest_AmountOfLives02_ChangeTheAmount() {
        // Arrange
        RobotJim robotJim = new RobotJim(2, new Point(10,20));
        // Act
        robotJim.setAmountOfLives(666);
        // Assert
        assertEquals(666, robotJim.getAmountOfLives());
    }

    @Test
    public void robotJimCreationTest_JustCrashed01() {
        // Act
        RobotJim robotJim = new RobotJim(2, new Point(10,20));
        // Assert
        assertFalse(robotJim.ifJustCrashed());
    }

    @Test
    public void robotJimCreationTest_JustCrashed02_AfterCrash() {
        // Arrange
        RobotJim robotJim = new RobotJim(2, new Point(10,20));
        // Act
        robotJim.setJustCrashed(true);
        // Assert
        assertTrue(robotJim.ifJustCrashed());
    }

    @Test
    public void getXTest01() {
        // Act
        RobotJim robotJim = new RobotJim(2, new Point(10,20));
        // Assert
        assertEquals(robotJim.getPosition().x, robotJim.getX());
    }

    @Test
    public void getYTest01() {
        // Act
        RobotJim robotJim = new RobotJim(2, new Point(10,20));
        // Assert
        assertEquals(robotJim.getPosition().y, robotJim.getY());
    }

}
