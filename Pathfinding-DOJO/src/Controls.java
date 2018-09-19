import java.io.*;

public class Controls {
    private Map map;
    private Robot robot;
    private Interface theInterface = new Interface();

    public void start() throws FileNotFoundException, IOException{

        // SETUP
        // Initialyze empty map
        map = new Map(20, 40, readMap());

        // Draw Symbols in empty map:
        map.update(10, 3, 2);
        map.update(12,30, 4);
        map.drawHorizontalTiles(0, 23, 20, 1);
        map.drawHorizontalTiles(11, 23, 3, 0);
        map.drawHorizontalTiles(10, 26, 5, 1);

        robot = new Robot(map, map.searchForX(2),map.searchForY(2),0);

        theInterface.printMap(robot, map);

        // MOVE
        System.out.println(AStar.start(robot));
    }

    private String readMap() throws FileNotFoundException, IOException {
        File mapFile = new File("map.txt");
        BufferedReader reader = new BufferedReader(new FileReader(mapFile));
        return reader.readLine();
    }
}
