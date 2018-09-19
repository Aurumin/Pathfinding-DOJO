public class Robot {
    private Map map;
    private boolean[][][] visited;
    private int x, y, facing;
    private String[] directions = {"N", "E", "S", "W"};

    public Robot(Map map, int x, int y, int facing) {
        this.map = map;
        initVisited(map.getWidth(), map.getHeight());
        this.x = x;
        this.y = y;
        this.facing = facing;
    }

    // Getter Methods for Robot:
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getFacing() {
        return facing;
    }

    public String getDirection() {
        return directions[facing];
    }

    // Setter Methods:
    // Setup visited map:
    public void initVisited(int maxWidth, int maxHeight) {
        visited = new boolean[maxWidth][maxHeight][4];
        for (int i = 0; i < maxWidth; i++) {
            for (int j = 0; j < maxHeight; j++) {
                for (int k = 0; k < 4; k++) {
                    visited[i][j][k] = false;
                }
            }
        }
    }

    public boolean moveForward() {
        if (isObstructed(inFrontX(), inFrontY())) return false;
        else
        {
            x += inFrontX();
            y += inFrontY();
            return true;
        }
    }

    public boolean moveFastForward() {
        for (int i = 1; i <= 3; i++) {
            if (map.getObject(inFrontX() * i, inFrontY() * i) == 1) return false;
        }
        x += 3 * inFrontX();
        y += 3 * inFrontY();
        return true;
    }

    public void turnRight() {
        facing = (facing + 1) % 4;
    }

    public void turnLeft() {
        facing = (facing + 3) % 4;
    }

    // Check wether tile in front of robot is obstructed:
    public boolean isObstructed(int tx, int ty) {
        return (map.getObject(tx, ty) == 1 || tx < 0 || ty < 0 || tx > map.getWidth() || ty > map.getHeight());
    }

    // Returns the X/Y Coord in front of the robot
    public int inFrontY() {
        switch (facing) {
            case 0:
                return x + 1;
            case 2:
                return x - 1;
            default:
                return x;
        }
    }

    public int inFrontX() {
        switch (facing) {
            case 1:
                return y + 1;
            case 3:
                return y - 1;
            default:
                return y;
        }
    }
}
