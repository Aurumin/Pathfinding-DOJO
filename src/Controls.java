import java.io.*;

public class Controls {
    private Map map;
    private Interface theInterface = new Interface();

    public void start() throws FileNotFoundException, IOException{
        map = new Map(readMap());

        theInterface.printMap(map.getMap(), map.getObjects());
    }

    private String readMap() throws FileNotFoundException, IOException {
        File mapFile = new File("map.txt");
        BufferedReader reader = new BufferedReader(new FileReader(mapFile));
        return reader.readLine();
    }
}
