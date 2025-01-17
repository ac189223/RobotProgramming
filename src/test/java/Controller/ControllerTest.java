package Controller;

import Model.RobotJim;
import Model.RoomOfTheRooms;
import View.View;
import org.junit.Test;

import javax.swing.*;

import java.awt.*;

import static org.junit.Assert.*;

/**
 * Tests for the Controller class (113 tests)
 *
 * @author andrzejcalka
 * @author =-_-=
 */
public class ControllerTest {

    @Test
    public void controllerCreationTest01_DirectionsAmount() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        // Act
        Controller controller = new Controller(frame,view);
        // Assert
        assertEquals(4, controller.getDirections().size());
    }

    @Test
    public void controllerCreationTest02_DirectionsDetails() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        // Act
        Controller controller = new Controller(frame,view);
        // Assert
        assertEquals("N", String.valueOf(controller.getDirections().get(0)));
        assertEquals("E", String.valueOf(controller.getDirections().get(1)));
        assertEquals("S", String.valueOf(controller.getDirections().get(2)));
        assertEquals("W", String.valueOf(controller.getDirections().get(3)));
    }

    @Test
    public void createDescriptionInViewTest01() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        Controller controller = new Controller(frame,view);
        // Act
        controller.createDescriptionInView();
        // Assert
        assertFalse(view.getTxtarDescr01().getText().isEmpty());
        assertEquals("Welcome", view.getTxtarDescr01().getText().substring(0, 7));
        assertEquals("Robot", view.getTxtarDescr01().getText()
                .substring(view.getTxtarDescr01().getText().length() - 5));
        assertTrue(view.getTxtarDescr01().getText().indexOf("room or Kleins") > 0);
    }

    @Test
    public void touchTheBorderTest_Touching01_OnTheNorthernBorder() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RoomOfTheRooms room = new RoomOfTheRooms(10, 20, 2);
        RobotJim robotJim = new RobotJim(0, new Point(5,0));        // direction = 0, y = 0
        Controller controller = new Controller(frame,view);
        controller.setRoom(room);
        controller.setRobotJim(robotJim);
        // Act
        boolean check = controller.touchTheBorder();
        // Assert
        assertTrue(check);
    }

    @Test
    public void touchTheBorderTest_Touching02_OnTheEasternBorder() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RoomOfTheRooms room = new RoomOfTheRooms(10, 20, 2);
        RobotJim robotJim = new RobotJim(1, new Point(10,10));        // direction = 1, x = 10
        Controller controller = new Controller(frame,view);
        controller.setRoom(room);
        controller.setRobotJim(robotJim);
        // Act
        boolean check = controller.touchTheBorder();
        // Assert
        assertTrue(check);
    }

    @Test
    public void touchTheBorderTest_Touching03_OnTheSouthernBorder() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RoomOfTheRooms room = new RoomOfTheRooms(10, 20, 2);
        RobotJim robotJim = new RobotJim(2, new Point(5,20));        // direction = 2, y = 20
        Controller controller = new Controller(frame,view);
        controller.setRoom(room);
        controller.setRobotJim(robotJim);
        // Act
        boolean check = controller.touchTheBorder();
        // Assert
        assertTrue(check);
    }

    @Test
    public void touchTheBorderTest_Touching04_OnTheWesternBorder() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RoomOfTheRooms room = new RoomOfTheRooms(10, 20, 2);
        RobotJim robotJim = new RobotJim(3, new Point(0,10));        // direction = 3, x = 0
        Controller controller = new Controller(frame,view);
        controller.setRoom(room);
        controller.setRobotJim(robotJim);
        // Act
        boolean check = controller.touchTheBorder();
        // Assert
        assertTrue(check);
    }

    @Test
    public void touchTheBorderTest_NoTouching01_InsideTheRoom() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RoomOfTheRooms room = new RoomOfTheRooms(10, 20, 2);
        RobotJim robotJim = new RobotJim(2, new Point(5,10));
        Controller controller = new Controller(frame,view);
        controller.setRoom(room);
        controller.setRobotJim(robotJim);
        // Act
        boolean check = controller.touchTheBorder();
        // Assert
        assertFalse(check);
    }

    @Test
    public void touchTheBorderTest_NoTouching02_OnTheNorthernBorder() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RoomOfTheRooms room = new RoomOfTheRooms(10, 20, 2);
        RobotJim robotJim = new RobotJim(2, new Point(5,0));        // direction <> 0, y = 0
        Controller controller = new Controller(frame,view);
        controller.setRoom(room);
        controller.setRobotJim(robotJim);
        // Act
        boolean check = controller.touchTheBorder();
        // Assert
        assertFalse(check);
    }

    @Test
    public void touchTheBorderTest_NoTouching03_OnTheEasternBorder() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RoomOfTheRooms room = new RoomOfTheRooms(10, 20, 2);
        RobotJim robotJim = new RobotJim(2, new Point(10,10));        // direction <> 1, x = 10
        Controller controller = new Controller(frame,view);
        controller.setRoom(room);
        controller.setRobotJim(robotJim);
        // Act
        boolean check = controller.touchTheBorder();
        // Assert
        assertFalse(check);
    }

    @Test
    public void touchTheBorderTest_NoTouching04_OnTheSouthernBorder() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RoomOfTheRooms room = new RoomOfTheRooms(10, 20, 2);
        RobotJim robotJim = new RobotJim(1, new Point(5,20));        // direction <> 2, y = 20
        Controller controller = new Controller(frame,view);
        controller.setRoom(room);
        controller.setRobotJim(robotJim);
        // Act
        boolean check = controller.touchTheBorder();
        // Assert
        assertFalse(check);
    }

    @Test
    public void touchTheBorderTest_NoTouching05_OnTheWesternBorder() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RoomOfTheRooms room = new RoomOfTheRooms(10, 20, 2);
        RobotJim robotJim = new RobotJim(2, new Point(0,10));        // direction <> 3, x = 0
        Controller controller = new Controller(frame,view);
        controller.setRoom(room);
        controller.setRobotJim(robotJim);
        // Act
        boolean check = controller.touchTheBorder();
        // Assert
        assertFalse(check);
    }

    @Test
    public void checkIfAliveTest01_Alive() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RobotJim robotJim = new RobotJim(2, new Point(5,10));
        Controller controller = new Controller(frame,view);
        controller.setRobotJim(robotJim);
        // Act
        boolean check = controller.checkIfAlive();
        // Assert
        assertTrue(check);
    }

    @Test
    public void checkIfAliveTest02_Dead() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RobotJim robotJim = new RobotJim(2, new Point(5,10));
        robotJim.setAmountOfLives(0);
        Controller controller = new Controller(frame,view);
        controller.setRobotJim(robotJim);
        // Act
        boolean check = controller.checkIfAlive();
        // Assert
        assertFalse(check);
    }

    @Test
    public void rotateTest01_PositiveNumber() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RobotJim robotJim = new RobotJim(2, new Point(5,10));
        Controller controller = new Controller(frame,view);
        controller.setRobotJim(robotJim);
        // Act
        controller.rotate(1);
        // Assert
        assertEquals(3,robotJim.getDirection());
    }

    @Test
    public void rotateTest02_PositiveNumberSumOver4() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RobotJim robotJim = new RobotJim(2, new Point(5,10));
        Controller controller = new Controller(frame,view);
        controller.setRobotJim(robotJim);
        // Act
        controller.rotate(3);
        // Assert
        assertEquals(1,robotJim.getDirection());
    }

    @Test
    public void rotateTest03_BiggerPositiveNumber() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RobotJim robotJim = new RobotJim(2, new Point(5,10));
        Controller controller = new Controller(frame,view);
        controller.setRobotJim(robotJim);
        // Act
        controller.rotate(12);
        // Assert
        assertEquals(2,robotJim.getDirection());
    }

    @Test
    public void rotateTest04_NegativeNumber() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RobotJim robotJim = new RobotJim(2, new Point(5,10));
        Controller controller = new Controller(frame,view);
        controller.setRobotJim(robotJim);
        // Act
        controller.rotate(-1);
        // Assert
        assertEquals(1,robotJim.getDirection());
    }

    @Test
    public void rotateTest05_BiggerNegativeNumber() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RobotJim robotJim = new RobotJim(2, new Point(5,10));
        Controller controller = new Controller(frame,view);
        controller.setRobotJim(robotJim);
        // Act
        controller.rotate(-4);
        // Assert
        assertEquals(2,robotJim.getDirection());
    }

    @Test
    public void reportPositionTest01() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RobotJim robotJim = new RobotJim(2, new Point(5,10));
        Controller controller = new Controller(frame,view);
        controller.setRobotJim(robotJim);
        // Act
        String report = controller.reportPosition();
        // Assert
        assertEquals("(6,11,S)",report);
    }

    @Test
    public void moveToStartingPointTest01() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RobotJim robotJim = new RobotJim(3, new Point(0,10));        // direction = 3, x = 0
        robotJim.setAmountOfLives(1);                                              // the Robot is close to die
        Controller controller = new Controller(frame,view);
        controller.setRobotJim(robotJim);
        for (int i = 0; i < 15; i++) {
            view.getCmbSetPositionX().addItem(i + 1);
            view.getCmbSetPositionY().addItem(i + 1);
        }
        view.getCmbSetPositionX().setSelectedIndex(6);                          // set start position and direction
        view.getCmbSetPositionY().setSelectedIndex(4);
        view.getCmbSetDirection().setSelectedIndex(2);
        // Act
        controller.moveToStartingPoint();
        // Assert
        assertEquals("(7,5,S)", controller.reportPosition());
    }

    @Test
    public void crossTheBorderTest_RoomToDieIn01_SingleCrash_DecreasingLifeCounter() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RoomOfTheRooms room = new RoomOfTheRooms(10, 20, 0);    // mode = 0
        RobotJim robotJim = new RobotJim(3, new Point(0,10));        // direction = 3, x = 0
        Controller controller = new Controller(frame,view);
        controller.setRoom(room);
        controller.setRobotJim(robotJim);
        // Act
        controller.crossTheBorder();
        // Assert
        assertEquals(2,robotJim.getAmountOfLives());
        assertTrue(robotJim.ifJustCrashed());
    }

    @Test
    public void crossTheBorderTest_RoomToDieIn02_SingleCrash_MovedToStartingPoint() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RoomOfTheRooms room = new RoomOfTheRooms(10, 20, 0);    // mode = 0
        RobotJim robotJim = new RobotJim(3, new Point(0,10));        // direction = 3, x = 0
        Controller controller = new Controller(frame,view);
        controller.setRoom(room);
        controller.setRobotJim(robotJim);
        for (int i = 0; i < 15; i++) {
            view.getCmbSetPositionX().addItem(i + 1);
            view.getCmbSetPositionY().addItem(i + 1);
        }
        view.getCmbSetPositionX().setSelectedIndex(6);                          // set start position and direction
        view.getCmbSetPositionY().setSelectedIndex(4);
        view.getCmbSetDirection().setSelectedIndex(2);
        // Act
        controller.crossTheBorder();
        // Assert
        assertEquals("(7,5,S)", controller.reportPosition());
    }

    @Test
    public void crossTheBorderTest_RoomToDieIn03_DeathAfterTripleCrash() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RoomOfTheRooms room = new RoomOfTheRooms(10, 20, 0);    // mode = 0
        RobotJim robotJim = new RobotJim(3, new Point(0,10));       // direction = 3, x = 0
        robotJim.setAmountOfLives(1);                                              // the Robot is close to die
        Controller controller = new Controller(frame,view);
        controller.setRoom(room);
        controller.setRobotJim(robotJim);
        // Act
        controller.crossTheBorder();
        // Assert
        assertEquals(0,robotJim.getAmountOfLives());
        assertTrue(robotJim.ifJustCrashed());
    }

    @Test
    public void crossTheBorderTest_RoomToDieIn04_DeathAfterTripleCrash_MessageInTheView() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RoomOfTheRooms room = new RoomOfTheRooms(10, 20, 0);    // mode = 0
        RobotJim robotJim = new RobotJim(3, new Point(0,10));        // direction = 3, x = 0
        robotJim.setAmountOfLives(1);                                              // the Robot is close to die
        Controller controller = new Controller(frame,view);
        controller.setRoom(room);
        controller.setRobotJim(robotJim);
        // Act
        controller.crossTheBorder();
        // Assert
        assertFalse(view.getLblResultDesc03().getText().isEmpty());
        assertEquals("After", view.getLblResultDesc03().getText().substring(0, 5));
        assertEquals("died", view.getLblResultDesc03().getText()
                .substring(view.getLblResultDesc03().getText().length() - 4));
        assertTrue(view.getLblResultDesc03().getText().indexOf("Jim") > 0);
    }

    @Test
    public void crossTheBorderTest_RoomWithWalls01_NoMove() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RoomOfTheRooms room = new RoomOfTheRooms(10, 20, 1);    // mode = 1
        RobotJim robotJim = new RobotJim(3, new Point(0,10));        // direction = 3, x = 0
        Controller controller = new Controller(frame,view);
        controller.setRoom(room);
        controller.setRobotJim(robotJim);
        // Act
        controller.crossTheBorder();
        // Assert
        assertEquals("(1,11,W)", controller.reportPosition());
    }

    @Test
    public void crossTheBorderTest_RoomGoesRound01_GoNorth() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RoomOfTheRooms room = new RoomOfTheRooms(10, 20, 2);    // mode = 2
        RobotJim robotJim = new RobotJim(0, new Point(5,0));        // direction = 0, y = 0
        Controller controller = new Controller(frame,view);
        controller.setRoom(room);
        controller.setRobotJim(robotJim);
        // Act
        controller.crossTheBorder();
        // Assert
        assertEquals("(6,21,N)", controller.reportPosition());
    }

    @Test
    public void crossTheBorderTest_RoomGoesRound02_GoEast() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RoomOfTheRooms room = new RoomOfTheRooms(10, 20, 2);    // mode = 2
        RobotJim robotJim = new RobotJim(1, new Point(10,10));        // direction = 1, x = 10
        Controller controller = new Controller(frame,view);
        controller.setRoom(room);
        controller.setRobotJim(robotJim);
        // Act
        controller.crossTheBorder();
        // Assert
        assertEquals("(1,11,E)", controller.reportPosition());
    }

    @Test
    public void crossTheBorderTest_RoomGoesRound03_GoSouth() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RoomOfTheRooms room = new RoomOfTheRooms(10, 20, 2);    // mode = 2
        RobotJim robotJim = new RobotJim(2, new Point(5,20));        // direction = 2, y = 20
        Controller controller = new Controller(frame,view);
        controller.setRoom(room);
        controller.setRobotJim(robotJim);
        // Act
        controller.crossTheBorder();
        // Assert
        assertEquals("(6,1,S)", controller.reportPosition());
    }

    @Test
    public void crossTheBorderTest_RoomGoesRound04_GoWest() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RoomOfTheRooms room = new RoomOfTheRooms(10, 20, 2);    // mode = 2
        RobotJim robotJim = new RobotJim(3, new Point(0,10));        // direction = 3, x = 0
        Controller controller = new Controller(frame,view);
        controller.setRoom(room);
        controller.setRobotJim(robotJim);
        // Act
        controller.crossTheBorder();
        // Assert
        assertEquals("(11,11,W)", controller.reportPosition());
    }

    @Test
    public void crossTheBorderTest_RoomOfMagic01_GoNorth() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RoomOfTheRooms room = new RoomOfTheRooms(10, 20, 3);    // mode = 3
        RobotJim robotJim = new RobotJim(0, new Point(5,0));        // direction = 0, y = 0
        Controller controller = new Controller(frame,view);
        controller.setRoom(room);
        controller.setRobotJim(robotJim);
        // Act
        controller.crossTheBorder();
        // Assert
        assertEquals("(6,21,N)", controller.reportPosition());
    }

    @Test
    public void crossTheBorderTest_RoomOfMagic02_GoEast() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RoomOfTheRooms room = new RoomOfTheRooms(10, 20, 3);    // mode = 3
        RobotJim robotJim = new RobotJim(1, new Point(10,12));        // direction = 1, x = 10
        Controller controller = new Controller(frame,view);
        controller.setRoom(room);
        controller.setRobotJim(robotJim);
        // Act
        controller.crossTheBorder();
        // Assert
        assertEquals("(1,9,E)", controller.reportPosition());
    }

    @Test
    public void crossTheBorderTest_RoomOfMagic03_GoSouth() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RoomOfTheRooms room = new RoomOfTheRooms(10, 20, 3);    // mode = 3
        RobotJim robotJim = new RobotJim(2, new Point(5,20));        // direction = 2, y = 20
        Controller controller = new Controller(frame,view);
        controller.setRoom(room);
        controller.setRobotJim(robotJim);
        // Act
        controller.crossTheBorder();
        // Assert
        assertEquals("(6,1,S)", controller.reportPosition());
    }

    @Test
    public void crossTheBorderTest_RoomOfMagic04_GoWest() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RoomOfTheRooms room = new RoomOfTheRooms(10, 20, 3);    // mode = 3
        RobotJim robotJim = new RobotJim(3, new Point(0,15));        // direction = 3, x = 0
        Controller controller = new Controller(frame,view);
        controller.setRoom(room);
        controller.setRobotJim(robotJim);
        // Act
        controller.crossTheBorder();
        // Assert
        assertEquals("(11,6,W)", controller.reportPosition());
    }

    @Test
    public void changePositionTest01_InsideTheRoom_FacingNorth() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RoomOfTheRooms room = new RoomOfTheRooms(10, 20, 2);
        RobotJim robotJim = new RobotJim(0, new Point(5,10));
        Controller controller = new Controller(frame,view);
        controller.setRoom(room);
        controller.setRobotJim(robotJim);
        // Act
        controller.changePosition();
        // Assert
        assertEquals("(6,10,N)", controller.reportPosition());
    }

    @Test
    public void changePositionTest02_InsideTheRoom_FacingEast() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RoomOfTheRooms room = new RoomOfTheRooms(10, 20, 2);
        RobotJim robotJim = new RobotJim(1, new Point(5,10));
        Controller controller = new Controller(frame,view);
        controller.setRoom(room);
        controller.setRobotJim(robotJim);
        // Act
        controller.changePosition();
        // Assert
        assertEquals("(7,11,E)", controller.reportPosition());
    }

    @Test
    public void changePositionTest03_InsideTheRoom_FacingSouth() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RoomOfTheRooms room = new RoomOfTheRooms(10, 20, 2);
        RobotJim robotJim = new RobotJim(2, new Point(5,10));
        Controller controller = new Controller(frame,view);
        controller.setRoom(room);
        controller.setRobotJim(robotJim);
        // Act
        controller.changePosition();
        // Assert
        assertEquals("(6,12,S)", controller.reportPosition());
    }

    @Test
    public void changePositionTest04_InsideTheRoom_FacingWest() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RoomOfTheRooms room = new RoomOfTheRooms(10, 20, 2);
        RobotJim robotJim = new RobotJim(3, new Point(5,10));
        Controller controller = new Controller(frame,view);
        controller.setRoom(room);
        controller.setRobotJim(robotJim);
        // Act
        controller.changePosition();
        // Assert
        assertEquals("(5,11,W)", controller.reportPosition());
    }

    @Test
    public void executeOneCommandTest01_RotateRight() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RobotJim robotJim = new RobotJim(3, new Point(5,10));
        Controller controller = new Controller(frame,view);
        controller.setRobotJim(robotJim);
        // Act
        controller.executeOneCommand('R');
        // Assert
        assertEquals(0, robotJim.getDirection());
    }

    @Test
    public void executeOneCommandTest02_RotateLeft() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RobotJim robotJim = new RobotJim(3, new Point(5,10));
        Controller controller = new Controller(frame,view);
        controller.setRobotJim(robotJim);
        // Act
        controller.executeOneCommand('L');
        // Assert
        assertEquals(2, robotJim.getDirection());
    }

    @Test
    public void executeOneCommandTest03_MoveForwardAndCrash() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RoomOfTheRooms room = new RoomOfTheRooms(10, 20, 0);    // mode = 0
        RobotJim robotJim = new RobotJim(3, new Point(0,10));        // direction = 3, x = 0
        Controller controller = new Controller(frame,view);
        controller.setRoom(room);
        controller.setRobotJim(robotJim);
        // Act
        controller.executeOneCommand('F');
        // Assert
        assertTrue(robotJim.ifJustCrashed());
    }

    @Test
    public void executeOneCommandTest04_MoveForwardAndHitTheWall() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RoomOfTheRooms room = new RoomOfTheRooms(10, 20, 1);    // mode = 1
        RobotJim robotJim = new RobotJim(3, new Point(0,10));        // direction = 3, x = 0
        Controller controller = new Controller(frame,view);
        controller.setRoom(room);
        controller.setRobotJim(robotJim);
        // Act
        controller.executeOneCommand('F');
        // Assert
        assertEquals("(1,11,W)", controller.reportPosition());
    }

    @Test
    public void executeOneCommandTest04_MoveForwardAndShowFromTheOtherSideInRoomGoesRound() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RoomOfTheRooms room = new RoomOfTheRooms(10, 20, 2);    // mode = 2
        RobotJim robotJim = new RobotJim(3, new Point(0,10));        // direction = 3, x = 0
        Controller controller = new Controller(frame,view);
        controller.setRoom(room);
        controller.setRobotJim(robotJim);
        // Act
        controller.executeOneCommand('F');
        // Assert
        assertEquals("(11,11,W)", controller.reportPosition());
    }

    @Test
    public void executeOneCommandTest05_WrongCharacter() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RobotJim robotJim = new RobotJim(3, new Point(5, 10));
        Controller controller = new Controller(frame, view);
        controller.setRobotJim(robotJim);
        // Act
        try {
            controller.executeOneCommand('P');
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException ignore) {
        }
    }

    @Test
    public void executeCommandLine01_EmptyProgram() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RobotJim robotJim = new RobotJim(3, new Point(5, 10));
        Controller controller = new Controller(frame, view);
        controller.setRobotJim(robotJim);
        // Act
        controller.executeCommandLine("");
        // Assert
        assertEquals("(6,11,W)",controller.reportPosition());
    }

    @Test
    public void executeCommandLine02_OneCharacterProgram() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RoomOfTheRooms room = new RoomOfTheRooms(10, 20, 2);    // mode = 2
        RobotJim robotJim = new RobotJim(3, new Point(5, 10));
        Controller controller = new Controller(frame, view);
        controller.setRoom(room);
        controller.setRobotJim(robotJim);
        // Act
        controller.executeCommandLine("F");
        // Assert
        assertEquals("(5,11,W)",controller.reportPosition());
    }

    @Test
    public void executeCommandLine03_TwoCharactersProgram() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RoomOfTheRooms room = new RoomOfTheRooms(10, 20, 2);    // mode = 2
        RobotJim robotJim = new RobotJim(3, new Point(5, 10));
        Controller controller = new Controller(frame, view);
        controller.setRoom(room);
        controller.setRobotJim(robotJim);
        // Act
        controller.executeCommandLine("FR");
        // Assert
        assertEquals("(5,11,N)",controller.reportPosition());
    }

    @Test
    public void executeCommandLine04_ProgramTooLong_NotificationInView() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RoomOfTheRooms room = new RoomOfTheRooms(10, 20, 2);    // mode = 2
        RobotJim robotJim = new RobotJim(3, new Point(5, 10));
        Controller controller = new Controller(frame, view);
        controller.setRoom(room);
        controller.setRobotJim(robotJim);
        String commandLine = "F".repeat(91);
        // Act
        controller.executeCommandLine(commandLine);
        // Assert
        assertFalse(view.getLblResultDesc03().getText().isEmpty());
        assertEquals("Program", view.getLblResultDesc03().getText().substring(0, 7));
        assertEquals("commands)", view.getLblResultDesc03().getText()
                .substring(view.getLblResultDesc03().getText().length() - 9));
        assertTrue(view.getLblResultDesc03().getText().indexOf(" (over") > 0);
    }

    @Test
    public void executeCommandLine05_FirstColumnOfProgramDetailsInView() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RoomOfTheRooms room = new RoomOfTheRooms(10, 20, 2);    // mode = 2
        RobotJim robotJim = new RobotJim(3, new Point(5, 10));
        Controller controller = new Controller(frame, view);
        controller.setRoom(room);
        controller.setRobotJim(robotJim);
        String commandLine = "F".repeat(90);
        // Act
        controller.executeCommandLine(commandLine);
        // Assert
        assertFalse(view.getTxtarResultNumber01().getText().isEmpty());                 // numbers of commands
        assertEquals("1.", view.getTxtarResultNumber01().getText().substring(0, 2));
        assertTrue(view.getTxtarResultNumber01().getText().indexOf("30.") > 0);
        assertFalse(view.getTxtarResultStep01().getText().isEmpty());                   // commands
        assertEquals("F ", view.getTxtarResultStep01().getText().substring(0, 2));
        assertTrue(view.getTxtarResultStep01().getText().indexOf("-->") > 0);
        assertFalse(view.getTxtarResultResult01().getText().isEmpty());                   // results of execution
        assertEquals("(5,11,W)", view.getTxtarResultResult01().getText().substring(0, 8));
    }

    @Test
    public void executeCommandLine06_SecondColumnOfProgramDetailsInView() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RoomOfTheRooms room = new RoomOfTheRooms(10, 20, 2);    // mode = 2
        RobotJim robotJim = new RobotJim(3, new Point(5, 10));
        Controller controller = new Controller(frame, view);
        controller.setRoom(room);
        controller.setRobotJim(robotJim);
        String commandLine = "F".repeat(90);
        // Act
        controller.executeCommandLine(commandLine);
        // Assert
        assertFalse(view.getTxtarResultNumber02().getText().isEmpty());                 // numbers of commands
        assertEquals("31.", view.getTxtarResultNumber02().getText().substring(0, 3));
        assertTrue(view.getTxtarResultNumber02().getText().indexOf("60.") > 0);
        assertFalse(view.getTxtarResultStep02().getText().isEmpty());                   // commands
        assertEquals("F ", view.getTxtarResultStep02().getText().substring(0, 2));
        assertTrue(view.getTxtarResultStep02().getText().indexOf("-->") > 0);
        assertFalse(view.getTxtarResultResult02().getText().isEmpty());                   // results of execution
        assertEquals("(8,11,W)", view.getTxtarResultResult02().getText().substring(0, 8));
    }

    @Test
    public void executeCommandLine07_ThirdColumnOfProgramDetailsInView() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RoomOfTheRooms room = new RoomOfTheRooms(10, 20, 2);    // mode = 2
        RobotJim robotJim = new RobotJim(3, new Point(5, 10));
        Controller controller = new Controller(frame, view);
        controller.setRoom(room);
        controller.setRobotJim(robotJim);
        String commandLine = "F".repeat(90);
        // Act
        controller.executeCommandLine(commandLine);
        // Assert
        assertFalse(view.getTxtarResultNumber03().getText().isEmpty());                 // numbers of commands
        assertEquals("61.", view.getTxtarResultNumber03().getText().substring(0, 3));
        assertTrue(view.getTxtarResultNumber03().getText().indexOf("90.") > 0);
        assertFalse(view.getTxtarResultStep03().getText().isEmpty());                   // commands
        assertEquals("F ", view.getTxtarResultStep03().getText().substring(0, 2));
        assertTrue(view.getTxtarResultStep03().getText().indexOf("-->") > 0);
        assertFalse(view.getTxtarResultResult03().getText().isEmpty());                   // results of execution
        assertEquals("(11,11,W)", view.getTxtarResultResult03().getText().substring(0, 9));
    }

    @Test
    public void addToProgramLTest01_AddToEmptyString() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        Controller controller = new Controller(frame, view);
        // Act
        controller.addToProgramL();
        // Assert
        assertEquals(1, view.getTxtSetProgram().getText().length());
        assertEquals("L", view.getTxtSetProgram().getText().substring(view.getTxtSetProgram().getText().length() - 1));
    }

    @Test
    public void addToProgramLTest02_AddToString() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        Controller controller = new Controller(frame, view);
        view.getTxtSetProgram().setText("F");
        // Act
        controller.addToProgramL();
        // Assert
        assertEquals(2, view.getTxtSetProgram().getText().length());
        assertEquals("L", view.getTxtSetProgram().getText().substring(view.getTxtSetProgram().getText().length() - 1));
    }

    @Test
    public void addToProgramLTest03_AddingIfLengthOf89() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        Controller controller = new Controller(frame, view);
        view.getTxtSetProgram().setText("F".repeat(89));
        // Act
        controller.addToProgramL();
        // Assert
        assertEquals(90, view.getTxtSetProgram().getText().length());
        assertEquals("L", view.getTxtSetProgram().getText().substring(view.getTxtSetProgram().getText().length() - 1));
    }

    @Test
    public void addToProgramLTest04_NotAddingIfLengthUpFrom90() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        Controller controller = new Controller(frame, view);
        view.getTxtSetProgram().setText("F".repeat(90));
        // Act
        controller.addToProgramL();
        // Assert
        assertEquals(90, view.getTxtSetProgram().getText().length());
    }

    @Test
    public void addToProgramFTest01_AddToEmptyString() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        Controller controller = new Controller(frame, view);
        // Act
        controller.addToProgramF();
        // Assert
        assertEquals(1, view.getTxtSetProgram().getText().length());
        assertEquals("F", view.getTxtSetProgram().getText().substring(view.getTxtSetProgram().getText().length() - 1));
    }

    @Test
    public void addToProgramFTest02_AddToString() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        Controller controller = new Controller(frame, view);
        view.getTxtSetProgram().setText("L");
        // Act
        controller.addToProgramF();
        // Assert
        assertEquals(2, view.getTxtSetProgram().getText().length());
        assertEquals("F", view.getTxtSetProgram().getText().substring(view.getTxtSetProgram().getText().length() - 1));
    }

    @Test
    public void addToProgramFTest03_AddingIfLengthOf89() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        Controller controller = new Controller(frame, view);
        view.getTxtSetProgram().setText("L".repeat(89));
        // Act
        controller.addToProgramF();
        // Assert
        assertEquals(90, view.getTxtSetProgram().getText().length());
        assertEquals("F", view.getTxtSetProgram().getText().substring(view.getTxtSetProgram().getText().length() - 1));
    }

    @Test
    public void addToProgramFTest04_NotAddingIfLengthUpFrom90() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        Controller controller = new Controller(frame, view);
        view.getTxtSetProgram().setText("L".repeat(90));
        // Act
        controller.addToProgramF();
        // Assert
        assertEquals(90, view.getTxtSetProgram().getText().length());
    }

    @Test
    public void addToProgramRTest01_AddToEmptyString() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        Controller controller = new Controller(frame, view);
        // Act
        controller.addToProgramR();
        // Assert
        assertEquals(1, view.getTxtSetProgram().getText().length());
        assertEquals("R", view.getTxtSetProgram().getText().substring(view.getTxtSetProgram().getText().length() - 1));
    }

    @Test
    public void addToProgramRTest02_AddToString() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        Controller controller = new Controller(frame, view);
        view.getTxtSetProgram().setText("F");
        // Act
        controller.addToProgramR();
        // Assert
        assertEquals(2, view.getTxtSetProgram().getText().length());
        assertEquals("R", view.getTxtSetProgram().getText().substring(view.getTxtSetProgram().getText().length() - 1));
    }

    @Test
    public void addToProgramRTest03_AddingIfLengthOf89() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        Controller controller = new Controller(frame, view);
        view.getTxtSetProgram().setText("F".repeat(89));
        // Act
        controller.addToProgramR();
        // Assert
        assertEquals(90, view.getTxtSetProgram().getText().length());
        assertEquals("R", view.getTxtSetProgram().getText().substring(view.getTxtSetProgram().getText().length() - 1));
    }

    @Test
    public void addToProgramRTest04_NotAddingIfLengthUpFrom90() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        Controller controller = new Controller(frame, view);
        view.getTxtSetProgram().setText("F".repeat(90));
        // Act
        controller.addToProgramR();
        // Assert
        assertEquals(90, view.getTxtSetProgram().getText().length());
    }

    @Test
    public void cleanOneFromProgramTest01_EmptyProgram() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        Controller controller = new Controller(frame, view);
        // Act
        controller.cleanOneFromProgram();
        // Assert
        assertEquals(0, view.getTxtSetProgram().getText().length());
    }

    @Test
    public void cleanOneFromProgramTest02_RegularProgram() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        Controller controller = new Controller(frame, view);
        view.getTxtSetProgram().setText("FRL");
        // Act
        controller.cleanOneFromProgram();
        // Assert
        assertEquals(2, view.getTxtSetProgram().getText().length());
    }

    @Test
    public void cleanAllFromProgramTest01_EmptyProgram() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        Controller controller = new Controller(frame, view);
        // Act
        controller.cleanAllFromProgram();
        // Assert
        assertEquals(0, view.getTxtSetProgram().getText().length());
    }

    @Test
    public void cleanAllFromProgramTest02_RegularProgram() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        Controller controller = new Controller(frame, view);
        view.getTxtSetProgram().setText("FRL");
        // Act
        controller.cleanAllFromProgram();
        // Assert
        assertEquals(0, view.getTxtSetProgram().getText().length());
    }

    @Test
    public void listWidthHeightTest01_Amount() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        Controller controller = new Controller(frame,view);
        // Act
        String[] check = controller.listWidthHeight();
        // Assert
        assertEquals(50, check.length);
    }

    @Test
    public void listWidthHeightTest02_Values() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        Controller controller = new Controller(frame,view);
        // Act
        String[] check = controller.listWidthHeight();
        // Assert
        assertEquals("1", check[0]);
        assertEquals("50", check[49]);
    }

    @Test
    public void setListPositionXTest01_Amount() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        Controller controller = new Controller(frame,view);
        for (int i = 0; i < 15; i++)
            view.getCmbSetWidth().addItem(i + 1);
        view.getCmbSetWidth().setSelectedIndex(12);
        // Act
        controller.setListPositionX();
        // Assert
        assertEquals(13, view.getCmbSetPositionX().getItemCount());
    }

    @Test
    public void setListPositionXTest02_Values() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        Controller controller = new Controller(frame,view);
        for (int i = 0; i < 15; i++)
            view.getCmbSetWidth().addItem(i + 1);
        view.getCmbSetWidth().setSelectedIndex(12);
        // Act
        controller.setListPositionX();
        // Assert
        assertEquals(1, view.getCmbSetPositionX().getItemAt(0));
        assertEquals(13, view.getCmbSetPositionX().getItemAt(view.getCmbSetPositionX().getItemCount() - 1));
    }

    @Test
    public void setListPositionYTest01_Amount() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        Controller controller = new Controller(frame,view);
        for (int i = 0; i < 15; i++)
            view.getCmbSetHeight().addItem(i + 1);
        view.getCmbSetHeight().setSelectedIndex(5);
        // Act
        controller.setListPositionY();
        // Assert
        assertEquals(6, view.getCmbSetPositionY().getItemCount());
    }

    @Test
    public void setListPositionYTest02_Values() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        Controller controller = new Controller(frame,view);
        for (int i = 0; i < 15; i++)
            view.getCmbSetHeight().addItem(i + 1);
        view.getCmbSetHeight().setSelectedIndex(5);
        // Act
        controller.setListPositionY();
        // Assert
        assertEquals(1, view.getCmbSetPositionY().getItemAt(0));
        assertEquals(6, view.getCmbSetPositionY().getItemAt(view.getCmbSetPositionY().getItemCount() - 1));
    }

    @Test
    public void listDirectionsTest01_Amount() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        Controller controller = new Controller(frame,view);
        // Act
        String[] check = controller.listDirections();
        // Assert
        assertEquals(4, check.length);
    }

    @Test
    public void listDirectionsTest02_Values() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        Controller controller = new Controller(frame,view);
        // Act
        String[] check = controller.listDirections();
        // Assert
        assertEquals("N", check[0]);
        assertEquals("E", check[1]);
        assertEquals("S", check[2]);
        assertEquals("W", check[3]);
    }

    @Test
    public void cleanOldResultsTest01_FirstColumn() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        Controller controller = new Controller(frame,view);
        view.getTxtarResultNumber01().setText("testNumber");
        view.getTxtarResultStep01().setText("testStep");
        view.getTxtarResultResult01().setText("testResult");
        // Act
        controller.cleanOldResults();
        // Assert
        assertEquals(0, view.getTxtarResultNumber01().getText().length());
        assertEquals(0, view.getTxtarResultStep01().getText().length());
        assertEquals(0, view.getTxtarResultResult01().getText().length());
    }

    @Test
    public void cleanOldResultsTest02_SecondColumn() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        Controller controller = new Controller(frame,view);
        view.getTxtarResultNumber02().setText("testNumber");
        view.getTxtarResultStep02().setText("testStep");
        view.getTxtarResultResult02().setText("testResult");
        // Act
        controller.cleanOldResults();
        // Assert
        assertEquals(0, view.getTxtarResultNumber02().getText().length());
        assertEquals(0, view.getTxtarResultStep02().getText().length());
        assertEquals(0, view.getTxtarResultResult02().getText().length());
    }

    @Test
    public void cleanOldResultsTest03_ThirdColumn() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        Controller controller = new Controller(frame,view);
        view.getTxtarResultNumber03().setText("testNumber");
        view.getTxtarResultStep03().setText("testStep");
        view.getTxtarResultResult03().setText("testResult");
        // Act
        controller.cleanOldResults();
        // Assert
        assertEquals(0, view.getTxtarResultNumber03().getText().length());
        assertEquals(0, view.getTxtarResultStep03().getText().length());
        assertEquals(0, view.getTxtarResultResult03().getText().length());
    }

    @Test
    public void cleanOldResultsTest04_Description() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        Controller controller = new Controller(frame,view);
        view.getLblResultDesc01().setText("testDescription01");
        view.getLblResultDesc02().setText("testDescription02");
        view.getLblResultDesc03().setText("testDescription03");
        // Act
        controller.cleanOldResults();
        // Assert
        assertEquals(0, view.getLblResultDesc01().getText().length());
        assertEquals(0, view.getLblResultDesc02().getText().length());
        assertEquals(0, view.getLblResultDesc03().getText().length());
    }

    @Test
    public void getDirectionDescriptionTest01_North() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RobotJim robotJim = new RobotJim(0, new Point(5,10));
        Controller controller = new Controller(frame,view);
        controller.setRobotJim(robotJim);
        // Act
        String check = controller.getDirectionDescription(robotJim.getDirection());
        // Assert
        assertEquals("North", check);
    }

    @Test
    public void getDirectionDescriptionTest02_East() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RobotJim robotJim = new RobotJim(1, new Point(5,10));
        Controller controller = new Controller(frame,view);
        controller.setRobotJim(robotJim);
        // Act
        String check = controller.getDirectionDescription(robotJim.getDirection());
        // Assert
        assertEquals("East", check);
    }

    @Test
    public void getDirectionDescriptionTest03_South() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RobotJim robotJim = new RobotJim(2, new Point(5,10));
        Controller controller = new Controller(frame,view);
        controller.setRobotJim(robotJim);
        // Act
        String check = controller.getDirectionDescription(robotJim.getDirection());
        // Assert
        assertEquals("South", check);
    }

    @Test
    public void getDirectionDescriptionTest04_West() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RobotJim robotJim = new RobotJim(3, new Point(5,10));
        Controller controller = new Controller(frame,view);
        controller.setRobotJim(robotJim);
        // Act
        String check = controller.getDirectionDescription(robotJim.getDirection());
        // Assert
        assertEquals("West", check);
    }

    @Test
    public void createRoomFromInputDataTest01_RoomSize() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        Controller controller = new Controller(frame,view);
        view.getCmbSetWidth().setSelectedIndex(8);
        view.getCmbSetHeight().setSelectedIndex(12);
        // Act
        controller.createRoomFromInputData();
        // Assert
        assertEquals(8, controller.getRoom().getMaxX());
        assertEquals(12, controller.getRoom().getMaxY());
    }

    @Test
    public void createRoomFromInputDataTest02_RoomMode0() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        Controller controller = new Controller(frame,view);
        view.getRdbtnRoomToDie().setSelected(true);
        // Act
        controller.createRoomFromInputData();
        // Assert
        assertEquals(0, controller.getRoom().getMode());
    }

    @Test
    public void createRoomFromInputDataTest03_RoomMode1() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        Controller controller = new Controller(frame,view);
        view.getRdbtnRoomWithWalls().setSelected(true);
        // Act
        controller.createRoomFromInputData();
        // Assert
        assertEquals(1, controller.getRoom().getMode());
    }

    @Test
    public void createRoomFromInputDataTest04_RoomMode2() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        Controller controller = new Controller(frame,view);
        view.getRdbtnRoomGoesRound().setSelected(true);
        // Act
        controller.createRoomFromInputData();
        // Assert
        assertEquals(2, controller.getRoom().getMode());
    }

    @Test
    public void createRoomFromInputDataTest05_RoomMode3() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        Controller controller = new Controller(frame,view);
        view.getRdbtnRoomOfMagic().setSelected(true);
        // Act
        controller.createRoomFromInputData();
        // Assert
        assertEquals(3, controller.getRoom().getMode());
    }

    @Test
    public void createRobotFromInputDataTest06_DescriptionInView_RoomSize() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        Controller controller = new Controller(frame,view);
        view.getCmbSetWidth().setSelectedIndex(8);
        view.getCmbSetHeight().setSelectedIndex(12);
        view.getRdbtnRoomToDie().setSelected(true);
        // Act
        controller.createRoomFromInputData();
        // Assert
        assertFalse(view.getLblResultDesc01().getText().isEmpty());
        assertEquals("9x13", view.getLblResultDesc01().getText()
                .substring(view.getLblResultDesc01().getText().length() - 4));
    }

    @Test
    public void createRobotFromInputDataTest07_DescriptionInView_RoomMode0() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        Controller controller = new Controller(frame,view);
        view.getCmbSetWidth().setSelectedIndex(8);
        view.getCmbSetHeight().setSelectedIndex(12);
        view.getRdbtnRoomToDie().setSelected(true);
        // Act
        controller.createRoomFromInputData();
        // Assert
        assertFalse(view.getLblResultDesc01().getText().isEmpty());
        assertEquals("Room", view.getLblResultDesc01().getText().substring(0, 4));
        assertTrue(view.getLblResultDesc01().getText().indexOf("die in 3x") > 0);
    }

    @Test
    public void createRoomFromInputDataTest08_DescriptionInView_RoomMode1() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        Controller controller = new Controller(frame,view);
        view.getCmbSetWidth().setSelectedIndex(8);
        view.getCmbSetHeight().setSelectedIndex(12);
        view.getRdbtnRoomWithWalls().setSelected(true);
        // Act
        controller.createRoomFromInputData();
        // Assert
        assertFalse(view.getLblResultDesc01().getText().isEmpty());
        assertEquals("Room", view.getLblResultDesc01().getText().substring(0, 4));
        assertTrue(view.getLblResultDesc01().getText().indexOf("with walls") > 0);
    }

    @Test
    public void createRoomFromInputDataTest09_DescriptionInView_RoomMode2() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        Controller controller = new Controller(frame,view);
        view.getCmbSetWidth().setSelectedIndex(8);
        view.getCmbSetHeight().setSelectedIndex(12);
        view.getRdbtnRoomGoesRound().setSelected(true);
        // Act
        controller.createRoomFromInputData();
        // Assert
        assertFalse(view.getLblResultDesc01().getText().isEmpty());
        assertEquals("Room", view.getLblResultDesc01().getText().substring(0, 4));
        assertTrue(view.getLblResultDesc01().getText().indexOf("goes round") > 0);
    }

    @Test
    public void createRoomFromInputDataTest10_DescriptionInView_RoomMode3() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        Controller controller = new Controller(frame,view);
        view.getCmbSetWidth().setSelectedIndex(8);
        view.getCmbSetHeight().setSelectedIndex(12);
        view.getRdbtnRoomOfMagic().setSelected(true);
        // Act
        controller.createRoomFromInputData();
        // Assert
        assertFalse(view.getLblResultDesc01().getText().isEmpty());
        assertEquals("Room", view.getLblResultDesc01().getText().substring(0, 4));
        assertTrue(view.getLblResultDesc01().getText().indexOf("of magic") > 0);
    }

    @Test
    public void createRobotFromInputDataTest01_Position() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        Controller controller = new Controller(frame,view);
        view.getCmbSetWidth().setSelectedIndex(8);
        view.getCmbSetPositionX().setSelectedIndex(4);
        view.getCmbSetHeight().setSelectedIndex(12);
        view.getCmbSetPositionY().setSelectedIndex(9);
        // Act
        controller.createRobotFromInputData();
        // Assert
        assertEquals(4, controller.getRobotJim().getX());
        assertEquals(9, controller.getRobotJim().getY());
    }

    @Test
    public void createRobotFromInputDataTest02_Direction0() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        Controller controller = new Controller(frame,view);
        view.getCmbSetDirection().setSelectedIndex(0);
        // Act
        controller.createRobotFromInputData();
        // Assert
        assertEquals(0, controller.getRobotJim().getDirection());
    }

    @Test
    public void createRobotFromInputDataTest03_Direction1() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        Controller controller = new Controller(frame,view);
        view.getCmbSetDirection().setSelectedIndex(1);
        // Act
        controller.createRobotFromInputData();
        // Assert
        assertEquals(1, controller.getRobotJim().getDirection());
    }

    @Test
    public void createRobotFromInputDataTest04_Direction2() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        Controller controller = new Controller(frame,view);
        view.getCmbSetDirection().setSelectedIndex(2);
        // Act
        controller.createRobotFromInputData();
        // Assert
        assertEquals(2, controller.getRobotJim().getDirection());
    }

    @Test
    public void createRobotFromInputDataTest05_Direction3() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        Controller controller = new Controller(frame,view);
        view.getCmbSetDirection().setSelectedIndex(3);
        // Act
        controller.createRobotFromInputData();
        // Assert
        assertEquals(3, controller.getRobotJim().getDirection());
    }

    @Test
    public void createRobotFromInputDataTest06_DescriptionInView_Position() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        Controller controller = new Controller(frame,view);
        view.getCmbSetWidth().setSelectedIndex(8);
        view.getCmbSetPositionX().setSelectedIndex(4);
        view.getCmbSetHeight().setSelectedIndex(12);
        view.getCmbSetPositionY().setSelectedIndex(9);
        view.getCmbSetDirection().setSelectedIndex(0);
        // Act
        controller.createRobotFromInputData();
        // Assert
        assertFalse(view.getLblResultDesc02().getText().isEmpty());
        assertEquals("Robot Jim", view.getLblResultDesc02().getText().substring(0, 9));
        assertTrue(view.getLblResultDesc02().getText().indexOf("(5,10)") > 0);
    }

    @Test
    public void createRobotFromInputDataTest07_DescriptionInView_Direction0() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        Controller controller = new Controller(frame,view);
        view.getCmbSetWidth().setSelectedIndex(8);
        view.getCmbSetPositionX().setSelectedIndex(4);
        view.getCmbSetHeight().setSelectedIndex(12);
        view.getCmbSetPositionY().setSelectedIndex(9);
        view.getCmbSetDirection().setSelectedIndex(0);
        // Act
        controller.createRobotFromInputData();
        // Assert
        assertFalse(view.getLblResultDesc02().getText().isEmpty());
        assertEquals("North", view.getLblResultDesc02().getText()
                .substring(view.getLblResultDesc02().getText().length() - 5));
    }

    @Test
    public void createRobotFromInputDataTest08_DescriptionInView_Direction1() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        Controller controller = new Controller(frame,view);
        view.getCmbSetWidth().setSelectedIndex(8);
        view.getCmbSetPositionX().setSelectedIndex(4);
        view.getCmbSetHeight().setSelectedIndex(12);
        view.getCmbSetPositionY().setSelectedIndex(9);
        view.getCmbSetDirection().setSelectedIndex(1);
        // Act
        controller.createRobotFromInputData();
        // Assert
        assertFalse(view.getLblResultDesc02().getText().isEmpty());
        assertEquals("East", view.getLblResultDesc02().getText()
                .substring(view.getLblResultDesc02().getText().length() - 4));
    }

    @Test
    public void createRobotFromInputDataTest09_DescriptionInView_Direction2() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        Controller controller = new Controller(frame,view);
        view.getCmbSetWidth().setSelectedIndex(8);
        view.getCmbSetPositionX().setSelectedIndex(4);
        view.getCmbSetHeight().setSelectedIndex(12);
        view.getCmbSetPositionY().setSelectedIndex(9);
        view.getCmbSetDirection().setSelectedIndex(2);
        // Act
        controller.createRobotFromInputData();
        // Assert
        assertFalse(view.getLblResultDesc02().getText().isEmpty());
        assertEquals("South", view.getLblResultDesc02().getText()
                .substring(view.getLblResultDesc02().getText().length() - 5));
    }

    @Test
    public void createRobotFromInputDataTest10_DescriptionInView_Direction3() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        Controller controller = new Controller(frame,view);
        view.getCmbSetWidth().setSelectedIndex(8);
        view.getCmbSetPositionX().setSelectedIndex(4);
        view.getCmbSetHeight().setSelectedIndex(12);
        view.getCmbSetPositionY().setSelectedIndex(9);
        view.getCmbSetDirection().setSelectedIndex(3);
        // Act
        controller.createRobotFromInputData();
        // Assert
        assertFalse(view.getLblResultDesc02().getText().isEmpty());
        assertEquals("West", view.getLblResultDesc02().getText()
                .substring(view.getLblResultDesc02().getText().length() - 4));
    }

    @Test
    public void reportPositionIfTheRobotSurvivedTest01() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RobotJim robotJim = new RobotJim(0, new Point(3,6));
        Controller controller = new Controller(frame,view);
        controller.setRobotJim(robotJim);
        // Act
        controller.reportPositionIfTheRobotSurvived();
        // Assert
        assertFalse(view.getLblResultDesc03().getText().isEmpty());
        assertEquals("After below", view.getLblResultDesc03().getText().substring(0, 11));
        assertTrue(view.getLblResultDesc03().getText().indexOf("Jim ended in") > 0);
    }

    @Test
    public void reportPositionIfTheRobotSurvivedTest02_Position() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RobotJim robotJim = new RobotJim(0, new Point(3,6));
        Controller controller = new Controller(frame,view);
        controller.setRobotJim(robotJim);
        // Act
        controller.reportPositionIfTheRobotSurvived();
        // Assert
        assertFalse(view.getLblResultDesc03().getText().isEmpty());
        assertTrue(view.getLblResultDesc03().getText().indexOf("(4,7)") > 0);
    }

    @Test
    public void reportPositionIfTheRobotSurvivedTest03_Direction0() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RobotJim robotJim = new RobotJim(0, new Point(3,6));
        Controller controller = new Controller(frame,view);
        controller.setRobotJim(robotJim);
        // Act
        controller.reportPositionIfTheRobotSurvived();
        // Assert
        assertFalse(view.getLblResultDesc03().getText().isEmpty());
        assertEquals("North", view.getLblResultDesc03().getText()
                .substring(view.getLblResultDesc03().getText().length() - 5));
    }

    @Test
    public void reportPositionIfTheRobotSurvivedTest04_Direction1() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RobotJim robotJim = new RobotJim(1, new Point(3,6));
        Controller controller = new Controller(frame,view);
        controller.setRobotJim(robotJim);
        // Act
        controller.reportPositionIfTheRobotSurvived();
        // Assert
        assertFalse(view.getLblResultDesc03().getText().isEmpty());
        assertEquals("East", view.getLblResultDesc03().getText()
                .substring(view.getLblResultDesc03().getText().length() - 4));
    }

    @Test
    public void reportPositionIfTheRobotSurvivedTest05_Direction2() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RobotJim robotJim = new RobotJim(2, new Point(3,6));
        Controller controller = new Controller(frame,view);
        controller.setRobotJim(robotJim);
        // Act
        controller.reportPositionIfTheRobotSurvived();
        // Assert
        assertFalse(view.getLblResultDesc03().getText().isEmpty());
        assertEquals("South", view.getLblResultDesc03().getText()
                .substring(view.getLblResultDesc03().getText().length() - 5));
    }

    @Test
    public void reportPositionIfTheRobotSurvivedTest06_Direction3() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RobotJim robotJim = new RobotJim(3, new Point(3,6));
        Controller controller = new Controller(frame,view);
        controller.setRobotJim(robotJim);
        // Act
        controller.reportPositionIfTheRobotSurvived();
        // Assert
        assertFalse(view.getLblResultDesc03().getText().isEmpty());
        assertEquals("West", view.getLblResultDesc03().getText()
                .substring(view.getLblResultDesc03().getText().length() - 4));
    }

    @Test
    public void reportPositionIfTheRobotSurvivedTest07_RobotWasDeadAlready() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        Controller controller = new Controller(frame,view);
        view.getLblResultDesc03().setText("TestDescription");
        // Act
        controller.reportPositionIfTheRobotSurvived();
        // Assert
        assertEquals("TestDescription", view.getLblResultDesc03().getText());
    }

    @Test
    public void getAndExecuteProgramTest01_RobotPosition() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RoomOfTheRooms room = new RoomOfTheRooms(10, 20, 2);
        RobotJim robotJim = new RobotJim(2, new Point(5,10));
        Controller controller = new Controller(frame,view);
        controller.setRoom(room);
        controller.setRobotJim(robotJim);
        view.getTxtSetProgram().setText("FRRFRLF");
        // Act
        controller.getAndExecuteProgram();
        // Assert
        assertEquals(5, controller.getRobotJim().getX());
        assertEquals(9, controller.getRobotJim().getY());
    }

    @Test
    public void getAndExecuteProgramTest02_RobotDirection() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        RoomOfTheRooms room = new RoomOfTheRooms(10, 20, 2);
        RobotJim robotJim = new RobotJim(2, new Point(5,10));
        Controller controller = new Controller(frame,view);
        controller.setRoom(room);
        controller.setRobotJim(robotJim);
        view.getTxtSetProgram().setText("FRRFRLF");
        // Act
        controller.getAndExecuteProgram();
        // Assert
        assertEquals(0, controller.getRobotJim().getDirection());
    }

    @Test
    public void showReportToTheUserTest01() {
        // Arrange
        JFrame frame = new JFrame();
        View view = new View();
        Controller controller = new Controller(frame,view);
        // Act
        controller.showReportToTheUser();
        // Assert
        assertEquals(2, view.getTabbedPane().getSelectedIndex());
    }
}
