public class Robot {
    private Map map;
    private int x, y, facing;
    private String[] directions = {"N", "E", "S", "W"};

    public Robot(Map map, int x, int y, int facing) {
        this.map = map;
        this.x = x;
        this.y = y;
        facing = this.facing;
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
    public boolean moveForward() {
        if (isObstructed()) return false;
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
    public boolean isObstructed() {
        return (map.getObject(inFrontX(), inFrontY()) == 1);
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
