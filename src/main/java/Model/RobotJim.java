package Model;

import Controller.Operator;

import java.awt.*;

/**
 * Represents the Robot which can walk around the Room
 *
 * @author andrzejcalka
 * @author =-_-=
 */
public class RobotJim {
    private Operator operator = new Operator();
    private int direction;                  // 0 for North
    private Point position;
    private int amountOfLives;              // only for RoomToDie, 3 lives from default
    private boolean justCrashed;            // true if the Robot crashed right before a moment

    /**
     * Constructor of the Robot with possible-to-use life parameter and its starting position given as a Point
     */
    public RobotJim(int direction, Point point) {
        this.setDirection(direction);
        this.setPosition(point);
        this.setAmountOfLives(3);
        this.setJustCrashed(false);
    }

    /**
     * Getters for this class
     */
    public int getDirection() { return direction; }
    public Point getPosition() { return position; }
    public int getAmountOfLives() { return amountOfLives; }
    public boolean ifJustCrashed() { return justCrashed; }

    /**
     * Setters for this class
     */
    public void setDirection(int direction) { this.direction = operator.modulo(direction,4); }
    public void setPosition(Point position) { this.position = position; }
    public void setAmountOfLives(int amountOfLives) { this.amountOfLives = amountOfLives; }
    public void setJustCrashed(boolean justCrashed) { this.justCrashed = justCrashed; }

    // ==============================================  Methods  ==============================================

    /**
     * Getting the coordinates of the Point that the Robot is located at the moment
     *
     * @return      coordinate (x or y respectively)
     */
    public int getX() { return (int) getPosition().getX(); }
    public int getY() { return (int) getPosition().getY(); }
}
