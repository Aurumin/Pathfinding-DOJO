public class Interface {
    public void printMap(int[][] map, String[] objects) {
        for (int n = 0; n < 22; n++) {
            System.out.print("-");
        }
        System.out.println();
        for (int y = 0; y < 40; y++) {
            System.out.print("|");
            for (int x = 0; x < 20; x++) {
                System.out.print(objects[map[x][y]]);
            }
            System.out.println("|");
        }
        for (int n = 0; n < 22; n++) {
            System.out.print("-");
        }
    }
}
