public class Map {
    private int[][] map = new int[20][40];
    private final String[] objects = {" ", "#", "S", "R", "G", "+"};

    public Map(String mapString){
        initMap(mapString);
    }

    public void initMap(String mapString) {
        for (int y = 0; y < 40; y++) {
            for (int x = 0; x < 20; x++) {
                map[x][y] = Character.getNumericValue(mapString.charAt(x + y*20));
            }
        }
    }

    public String[] getObjects() {
        return objects;
    }

    public int[][] getMap() {
        return map;
    }
}

