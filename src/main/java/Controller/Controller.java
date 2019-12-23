package Controller;

import Model.RobotJim;
import Model.RoomOfTheRooms;
import View.View;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

/**
 * Represents the Controller to move the Robot around the Room
 *
 * @author andrzejcalka
 * @author =-_-=
 */
public class Controller {
    private RoomOfTheRooms room;
    private RobotJim robotJim;
    private Operator operator;
    private HashMap<Integer, Character> directions;
    private JFrame frame;
    private View view;

    /**
     * Constructor of the Controller
     */
    public Controller(JFrame frame, View view) {
        this.setOperator(new Operator());
        this.setDirections(new HashMap<>());
        directions.put(0, 'N');
        directions.put(1, 'E');
        directions.put(2, 'S');
        directions.put(3, 'W');
        this.setFrame(frame);
        this.setView(view);
    }

    /**
     * Getters for this class
     */
    public RoomOfTheRooms getRoom() { return room; }
    public RobotJim getRobotJim() { return robotJim; }
    public Operator getOperator() { return operator; }
    public HashMap<Integer, Character> getDirections() { return directions; }
    public JFrame getFrame() { return frame; }
    public View getView() { return view; }

    /**
     * Setters for this class
     */
    public void setRoom(RoomOfTheRooms room) { this.room = room; }
    public void setRobotJim(RobotJim robotJim) { this.robotJim = robotJim; }
    public void setOperator(Operator operator) { this.operator = operator; }
    public void setDirections(HashMap<Integer, Character> directions) { this.directions = directions; }
    public void setFrame(JFrame frame) { this.frame = frame; }
    public void setView(View view) { this.view = view; }

    // ==============================================  Methods  ==============================================

    /**
     * Writing description in the view
     */
    public void createDescriptionInView() {
        getView().getTxtarDescr01().setText("Welcome in the controller to the Robot !\n" +
                "   It's a simple robot that can walk around in the Room\n\n" +
                "   Set & Run \n" +
                "       1. Setup parameters to initialize the Room and the Robot:\n" +
                "           - size of the Room (up to 50)\n" +
                "           - starting point and the direction of the Robot\n" +
                "           - type of the Room:\n" +
                "               - room without the walls that the Robot may fall out from \n" +
                "                       (the Robot is moved back to the starting point after he crashed,\n" +
                "                       but remember that the Robot dies after the third crash)\n" +
                "               - classical room that the Robot will just bang the walls with his head\n" +
                "               - torus room that goes round or Kleins bottle room of magic\n" +
                "                       (search online how exactly do they work)\n" +
                "       2. Use buttons to set the program (up to 90 characters) for the Robot\n" +
                "       3. Execute program by pressing Run button\n\n" +
                "   Results \n" +
                "       Header contains the description of settings and a final location of the Robot\n" +
                "       Below is the table with details about all the steps taken during program execution\n" +
                "       If room to die was chosen, then crashes of the Robot are also visible\n" +
                "       Death of the Robot is noticed in the header and the program is stopped in that case\n\n" +
                "   Have fun and enjoy programming the Robot !\n" +
                "   Settings as well as the program may be changed to rerun the Robot");
    }

    /**
     * Checking if the Robot is touching the border with his face
     *
     * @return      true if yes, false otherwise
     */
    public boolean touchTheBorder() {
        if ((getRobotJim().getDirection() == 0 && getRobotJim().getY() == getRoom().getMinY()) ||
                (getRobotJim().getDirection() == 1 && getRobotJim().getX() == getRoom().getMaxX()) ||
                (getRobotJim().getDirection() == 2 && getRobotJim().getY() == getRoom().getMaxY()) ||
                (getRobotJim().getDirection() == 3 && getRobotJim().getX() == getRoom().getMinX()))
            return true;
        return false;
    }

    /**
     * Executing program line and moving the Robot around the Room
     *
     * @param commandLine       program line (accepted letters are L, R and F)
     */
    public void executeCommandLine(String commandLine) {
        int counter = 1;
        for (int i = 0; i < commandLine.length(); i++) {
            if (checkIfAlive()) {
                executeOneCommand(commandLine.charAt(i));               // execute instructions one by one
                if (counter <= 30) {
                    getView().getTxtarResultNumber01().setText(
                            getView().getTxtarResultNumber01().getText() + counter + "." + "\n");
                    getView().getTxtarResultStep01().setText(
                            getView().getTxtarResultStep01().getText() + commandLine.charAt(i) + "      -->" + "\n");
                    if (getRobotJim().ifJustCrashed()) {
                        getView().getTxtarResultResult01().setText(
                                getView().getTxtarResultResult01().getText() + "CRASHED" + "\n");
                        getRobotJim().setJustCrashed(false);
                    } else
                        getView().getTxtarResultResult01().setText(
                                getView().getTxtarResultResult01().getText() + reportPosition() + "\n");
                } else if (counter <= 60) {
                    getView().getTxtarResultNumber02().setText(
                            getView().getTxtarResultNumber02().getText() + counter + "." + "\n");
                    getView().getTxtarResultStep02().setText(
                            getView().getTxtarResultStep02().getText() + commandLine.charAt(i) + "      -->" + "\n");
                    if (getRobotJim().ifJustCrashed()) {
                        getView().getTxtarResultResult02().setText(
                                getView().getTxtarResultResult02().getText() + "CRASHED" + "\n");
                        getRobotJim().setJustCrashed(false);
                    } else
                        getView().getTxtarResultResult02().setText(
                                getView().getTxtarResultResult02().getText() + reportPosition() + "\n");
                } else {
                    getView().getTxtarResultNumber03().setText(
                            getView().getTxtarResultNumber03().getText() + counter + "." + "\n");
                    getView().getTxtarResultStep03().setText(
                            getView().getTxtarResultStep03().getText() + commandLine.charAt(i) + "      -->" + "\n");
                    if (getRobotJim().ifJustCrashed()) {
                        getView().getTxtarResultResult03().setText(
                                getView().getTxtarResultResult03().getText() + "CRASHED" + "\n");
                        getRobotJim().setJustCrashed(false);
                    } else
                        getView().getTxtarResultResult03().setText(
                                getView().getTxtarResultResult03().getText() + reportPosition() + "\n");
                }
                counter++;
            }
        }
    }

    /**
     * Executing one character from the program line
     *
     *  @param command       character (accepted letters are L, R and F)
     */
    public void executeOneCommand(char command) {
        if (command == 'F')
            changePosition();                                       // move
        else if (command == 'R')
            rotate(1);                                      // turn right
        else if (command == 'L')
            rotate(-1);                                     // turn left
        else
            throw new IllegalArgumentException("Error in the provided program - incorrect character: " + command);
    }

    /**
     * Moving the Robot one step forward
     */
    public void changePosition() {
        if (touchTheBorder())
            crossTheBorder();                                       // out of the Room consequence
        else
            switch (getRobotJim().getDirection()) {                 // making one step inside the Room in a proper direction
                case 0:
                    getRobotJim().getPosition().setLocation(getRobotJim().getX(), getRobotJim().getY() - 1);
                    break;
                case 1:
                    getRobotJim().getPosition().setLocation(getRobotJim().getX() + 1, getRobotJim().getY());
                    break;
                case 2:
                    getRobotJim().getPosition().setLocation(getRobotJim().getX(), getRobotJim().getY() + 1);
                    break;
                case 3:
                    getRobotJim().getPosition().setLocation(getRobotJim().getX() - 1, getRobotJim().getY());
                    break;
            }
    }

    /**
     * Moving the Robot out of the Room
     */
    public void crossTheBorder() {
        switch (getRoom().getMode()) {
            case 0:                         // the Robot is falling out of the RoomToDie, decreasing his lives counter
                getRobotJim().setAmountOfLives(getRobotJim().getAmountOfLives() - 1);
                if (!checkIfAlive()) {      // inform if the Robot dies totally
                    getView().getLblResultDesc03().setText("After below steps Jim crashed for the third time and died");
                    getRobotJim().setJustCrashed(true);
                } else {                    // locate the Robot back in the starting point if he manage to survive
                    getRobotJim().setPosition(
                            new Point(getView().getCmbSetPositionX().getSelectedIndex(),
                                    getView().getCmbSetPositionY().getSelectedIndex()));
                    getRobotJim().setDirection(getView().getCmbSetDirection().getSelectedIndex());
                    getRobotJim().setJustCrashed(true);
                }
                break;
            case 1:                         // the Robot is hitting the wall and staying in the place in RoomWithWalls
                break;
            case 2:                         // the Robot goes round in the Room in a shape of torus
                                            // moving cross the wall means that he appears from the other side
                switch (getRobotJim().getDirection()) {
                    case 0:
                        getRobotJim().getPosition()
                                .setLocation(getRobotJim().getX(),
                                        getOperator().modulo(getRobotJim().getY() - 1, (getRoom().getMaxY() + 1)));
                        break;
                    case 1:
                        getRobotJim().getPosition()
                                .setLocation(getOperator().modulo(getRobotJim().getX() + 1, (getRoom().getMaxX() +1)),
                                        getRobotJim().getY());
                        break;
                    case 2:
                        getRobotJim().getPosition()
                                .setLocation(getRobotJim().getX(),
                                        getOperator().modulo(getRobotJim().getY() + 1, (getRoom().getMaxY() + 1)));
                        break;
                    case 3:
                        getRobotJim().getPosition()
                                .setLocation(getOperator().modulo(getRobotJim().getX() - 1, (getRoom().getMaxX() + 1)),
                                        getRobotJim().getY());
                        break;
                }
                break;
            case 3:                         // the Robot goes a little crazy in the Room in a shape of Klein's bottle
                                            // moving cross the wall  up and down is normal, he appears from the other side
                                            // but moving cross the walls left and right makes him a little dizzy
                switch (getRobotJim().getDirection()) {
                    case 0:
                        getRobotJim().getPosition()
                                .setLocation(getRobotJim().getX(),
                                        getOperator().modulo(getRobotJim().getY() - 1, (getRoom().getMaxY() + 1)));
                        break;
                    case 1:
                        getRobotJim().getPosition()
                                .setLocation(getOperator().modulo(getRobotJim().getX() + 1, (getRoom().getMaxX() + 1)),
                                        getRoom().getMaxY() - getRobotJim().getY());
                        break;
                    case 2:
                        getRobotJim().getPosition()
                                .setLocation(getRobotJim().getX(),
                                        getOperator().modulo(getRobotJim().getY() + 1, (getRoom().getMaxY() + 1)));
                        break;
                    case 3:
                        getRobotJim().getPosition()
                                .setLocation(getOperator().modulo(getRobotJim().getX() - 1, (getRoom().getMaxX() + 1)),
                                        getRoom().getMaxY() - getRobotJim().getY());
                        break;
                }
                break;
        }
    }

    /**
     * Checking if the Robot is still alive
     *
     * @return      true if alive, false otherwise
     */
    private boolean checkIfAlive() {
        boolean alive = true;
        if (getRobotJim().getAmountOfLives() <= 0)
            alive = false;
        return alive;
    }

    /**
     * Turning the Robot around by 90 degree
     *
     * @param rotation      direction of the turn
     */
    public void rotate(int rotation) {
        getRobotJim().setDirection(getOperator().modulo((getRobotJim().getDirection() + rotation), 4));
    }

    /**
     * Reporting final position in desired format to the user
     *
     * @return      position as "X Y D" where X,Y are Robot's coordinates ane D is Robot's direction
     */
    public String reportPosition() {
        return "(" +  (getRobotJim().getX() + 1) + "," + (getRobotJim().getY() + 1) + "," +
                getDirections().get(getRobotJim().getDirection()) + ")";
    }

    /**
     * Adding left turn to the program after using the button (with the limit of 90 commends)
     */
    public void addToProgramL() {
        if (getView().getTxtSetProgram().getText().length() < 90)
            getView().getTxtSetProgram().setText(getView().getTxtSetProgram().getText() + "L");
    }

    /**
     * Adding forward move to the program after using the button (with the limit of 90 commends)
     */
    public void addToProgramF() {
        if (getView().getTxtSetProgram().getText().length() < 90)
            getView().getTxtSetProgram().setText(getView().getTxtSetProgram().getText() + "F");
    }

    /**
     * Adding right turn to the program after using the button (with the limit of 90 commends)
     */
    public void addToProgramR() {
        if (getView().getTxtSetProgram().getText().length() < 90)
            getView().getTxtSetProgram().setText(getView().getTxtSetProgram().getText() + "R");
    }

    /**
     * Removing last character from the program after using the button
     */
    public void cleanOneFromProgram() {
        getView().getTxtSetProgram().setText(
                getView().getTxtSetProgram().getText().substring(0,getView().getTxtSetProgram().getText().length() - 1));
    }

    /**
     * Removing whole program after using the button
     */
    public void cleanAllFromProgram() {
        getView().getTxtSetProgram().setText("");
    }

    /**
     * Setting list of choices for width and height of the Room
     *
     * @return      list of possible choices
     */
    public String[] listWidthHeight() {
        String[] list = new String[50];
        for (int i = 0; i < 50; i++)
            list[i] = String.valueOf(i+1);
        return list;
    }

    /**
     * Setting list of available choices for starting position on X axis after choosing width of the Room
     */
    public void setListPositionX() {
        int chosen = getView().getCmbSetWidth().getSelectedIndex();
        getView().getCmbSetPositionX().removeAllItems();
        for (int i = 0; i <= chosen; i++)
            getView().getCmbSetPositionX().addItem(i + 1);
    }

    /**
     * Setting list of available choices for starting position on Y axis after choosing height of the Room
     */
    public void setListPositionY() {
        int chosen = getView().getCmbSetHeight().getSelectedIndex();
        getView().getCmbSetPositionY().removeAllItems();
        for (int i = 0; i <= chosen; i++)
            getView().getCmbSetPositionY().addItem(i + 1);
    }

    /**
     * Setting list of available directions
     *
     * @return      list of possible choices
     */
    public String[] listDirections() {
        return new String[]{"N", "E", "S", "W"};
    }

    /**
     * Executing the program after using the button
     */
    public void executeProgram() {
        // clean old results
        getView().getTxtarResultNumber01().setText("");
        getView().getTxtarResultStep01().setText("");
        getView().getTxtarResultResult01().setText("");
        getView().getTxtarResultNumber02().setText("");
        getView().getTxtarResultStep02().setText("");
        getView().getTxtarResultResult02().setText("");
        getView().getTxtarResultNumber03().setText("");
        getView().getTxtarResultStep03().setText("");
        getView().getTxtarResultResult03().setText("");
        getView().getLblResultDesc01().setText("");
        getView().getLblResultDesc02().setText("");
        getView().getLblResultDesc03().setText("");

        int roomWidth = getView().getCmbSetWidth().getSelectedIndex();
        int roomHeight = getView().getCmbSetHeight().getSelectedIndex();
        int roomMode;
        String roomDescription;
        if (getView().getRdbtnRoomToDie().isSelected()) {
            roomMode = 0;
            roomDescription = getView().getLblRoomToDie().getText();
        } else if (getView().getRdbtnRoomWithWalls().isSelected()) {
            roomMode = 1;
            roomDescription = getView().getLblRoomWithWalls().getText();
        } else if (getView().getRdbtnRoomGoesRound().isSelected()) {
            roomMode = 2;
            roomDescription = getView().getLblRoomGoesRound().getText();
        } else {
            roomMode = 3;
            roomDescription = getView().getLblRoomOfMagic().getText();
        }
        room = new RoomOfTheRooms(roomWidth, roomHeight, roomMode);         // room creation according to input data

        int robotPositionX = getView().getCmbSetPositionX().getSelectedIndex();
        int robotPositionY = getView().getCmbSetPositionY().getSelectedIndex();
        int robotDirection = getView().getCmbSetDirection().getSelectedIndex();
        String robotDirectionDesc = getDirectionDescription(robotDirection);
        robotJim = new RobotJim(robotDirection, new Point(robotPositionX, robotPositionY));        // robot creation

        getView().getTabbedPane().setSelectedIndex(2);                      // activate report sheet and describe situation
        getView().getLblResultDesc01().setText("R" + roomDescription.substring(5) +
                " had the size of " + (roomWidth + 1) + "x" + (roomHeight + 1));
        getView().getLblResultDesc02().setText("Robot Jim started from (" + (robotPositionX + 1) + "," +
                (robotPositionY + 1) + ") facing " + robotDirectionDesc);

        String commandLine = getView().getTxtSetProgram().getText();
        executeCommandLine(commandLine);                                    // execute program

        if (getView().getLblResultDesc03().getText().equals(""))            // final report if the Robot survived
            getView().getLblResultDesc03().setText("After below steps Jim ended in (" +
                    (getRobotJim().getX() + 1) + "," + (getRobotJim().getY() + 1) + ") facing " +
                    getDirectionDescription(getRobotJim().getDirection()));
    }

    /**
     * Getting description of the direction from its numerical value
     *
     * @param robotDirection        numerical value of the direction
     * @return                      string describing the direction
     */
    private String getDirectionDescription(int robotDirection) {
        String description;
        if (robotDirection == 0)
            description = "North";
        else if (robotDirection == 1)
            description = "East";
        else if (robotDirection == 2)
            description = "South";
        else
            description = "West";
        return description;
    }
}
