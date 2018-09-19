public class Interface {
    public void printMap(Robot robot, Map map) {
        for (int n = 0; n < 22; n++) {
            System.out.print("-");
        }
        System.out.println();
        for (int y = map.getHeight() - 1; y >= 0; y--) {
            System.out.print("|");
            for (int x = 0; x < map.getWidth(); x++) {
                if (x == robot.getX() && y == robot.getY()) System.out.print(robot.getDirection());
                else System.out.print(map.getObject(x, y));
            }
            System.out.println("|");
        }
        for (int n = 0; n < 22; n++) {
            System.out.print("-");
        }
    }
}
