package Model;

import Controller.Operator;

/**
 * Represents the Room in which the Robot can spend time and walk around
 * max size of the Room is 50 in both directions
 * and there are 4 types of the Rooom
 *
 * @author andrzejcalka
 * @author =-_-=
 */
public class RoomOfTheRooms {
    private Operator operator = new Operator();
    private int minX;
    private int maxX;
    private int minY;
    private int maxY;
    private int mode;                   // type of the Room

    /**
     * Constructor of the Room with parameters
     */
    public RoomOfTheRooms(int maxX, int maxY, int mode) {
        this.setMinX(0);
        this.setMaxX(maxX);
        this.setMinY(0);
        this.setMaxY(maxY);
        this.setMode(mode);
    }

    /**
     * Getters for this class
     */
    public int getMinX() { return minX; }
    public int getMaxX() { return maxX; }
    public int getMinY() { return minY; }
    public int getMaxY() { return maxY; }
    public int getMode() { return mode; }

    /**
     * Setters for this class
     */
    public void setMinX(int minX) { this.minX = operator.modulo(minX,50); }
    public void setMaxX(int maxX) { this.maxX = operator.modulo(maxX,50); }
    public void setMinY(int minY) { this.minY = operator.modulo(minY,50); }
    public void setMaxY(int maxY) { this.maxY = operator.modulo(maxY,50); }
    public void setMode(int mode) { this.mode = operator.modulo(mode,4); }
}
