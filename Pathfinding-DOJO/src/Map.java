import java.lang.*;

public class Map {
    private int[][] map;
    private int width;
    private int height;
    private final String[] objects = {" ", "#", "S", "R", "G", "+"};

    public Map(int width, int height, String mapString){
        this.width = width;
        this.height = height;
        map = new int[width][height];
        //initMap(mapString);
        initEmptyMap();
    }

    public void initMap(String mapString) {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                map[x][y] = Character.getNumericValue(mapString.charAt(x + y*20));
            }
        }
    }

    public void initEmptyMap() {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                map[x][y] = 0;
            }
        }
    }

    // TODO store Map back in file
    public void storeMap() {

    }

    // Returns Array of Objects
    public String[] getObjects() {
        return objects;
    }

    // Returns Object ID
    public int getObject(int x, int y) {
        return map[x][y];
    }

    // Converts given Index to Object
    public String getObjectSymbol(int x, int y) {
        return objects[map[x][y]];
    }

    // Converts given Object to Index; returns -1 if Object not found
    public int getObjectIndex(String obj) {
        for (int i = 0; i < objects.length; i++) {
            if (objects[i].equals(obj)) return i;
        }
        return -1;
    }

    // Returns map
    public int[][] getMap() {
        return map;
    }

    // Updates Map at given Coords with given Object
    public void update(int x, int y, int obj) {
        map[x][y] = obj;
    }

    // Draw Walls
    public void drawHorizontalTiles(int startX, int startY, int tiles, int obj) {
        for (int i = 0; i < tiles; i++) {
            update(startX + i, startY, obj);
        }
    }

    public void drawVerticalTiles(int startX, int startY, int tiles, int obj) {
        for (int i = 0; i < tiles; i++) {
            update(startX, startY + i, obj);
        }
    }

    // Getter methods for Height and Width (max x and y values)
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    // Search functions (to arbitrarily search X/Y coordinates of e.g. Start point)
    public int searchForX(int obj) {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (obj == map[x][y]) return x;
            }
        }
        return -1;
    }

    public int searchForY(int obj) {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (obj == map[x][y]) return y;
            }
        }
        return -1;
    }
}

