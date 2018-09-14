public class Robot {
    private int x, y, facing;
    private String[] directions = {"N", "E", "S", "W"};

    public Robot(int x, int y, int facing) {
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
}
