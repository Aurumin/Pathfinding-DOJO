import java.io.*;

public class Controls {
    private Map map = new Map();
    private Interface theInterface = new Interface();

    private String mapString;

    public void start() throws FileNotFoundException, IOException{
        readMap();



        System.out.println(mapString);

        //theInterface.printMap(map.getMap(), map.getObjects());
    }

    private void readMap() throws FileNotFoundException, IOException {
        File mapFile = new File("map.txt");
        BufferedReader reader = new BufferedReader(new FileReader(mapFile));
        mapString = reader.readLine();
    }
}
