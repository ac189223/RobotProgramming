package Model;

/**
 * Represents the Room in which the Robot can spend time and walk around
 *
 * @author andrzejcalka
 * @author =-_-=
 */
public class RoomOfTheRooms {
    private int minX;
    private int maxX;
    private int minY;
    private int maxY;
    private int mode;                   // type of the room

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
     * Constructor of the empty Room
     */
    public RoomOfTheRooms() { }

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
    public void setMinX(int minX) { this.minX = minX; }
    public void setMaxX(int maxX) { this.maxX = maxX; }
    public void setMinY(int minY) { this.minY = minY; }
    public void setMaxY(int maxY) { this.maxY = maxY; }
    public void setMode(int mode) { this.mode = mode; }
}
