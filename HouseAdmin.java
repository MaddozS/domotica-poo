import java.util.HashMap;
import java.io.*;


public class HouseAdmin{
    // private final String db_houses = "db_houses.txt";
    private String house_name;
    private final String db_areas = "db_areas.txt";
    private final String db_rooms = "db_rooms.txt";
    // private HashMap<Integer,House> houses = new HashMap<>();
    private HashMap<Integer,Area> areas = new HashMap<>();
    private HashMap<Integer,Room> rooms = new HashMap<>();

    // public void addHouse(House house){
    //     File file = new File(db_houses);
    //     try{
    //         file.createNewFile();
    //     }
    //     catch(IOException e) {
    //         e.printStackTrace();
    //     }
    //     try {
    //         FileWriter fileWriter =
    //             new FileWriter(db_houses, true);
    //         BufferedWriter bufferedWriter =
    //             new BufferedWriter(fileWriter);
    //         bufferedWriter.write(house.getInfo());
    //         houses.put(house.getId(), house);
    //         bufferedWriter.newLine();
    //         bufferedWriter.close();
    //     }
    //     catch(IOException ex) {
    //         System.out.println("Error reading the database");                  
    //     }
    // }
    public HouseAdmin(String house_name){
        this.house_name = house_name;
        General.createFile(db_areas);
        General.createFile(db_rooms);
    }
    public String getHouseName(){
        return house_name;
    }
    public void addArea(Area area){
        try {
            FileWriter fileWriter =
                new FileWriter(db_areas, true);
            BufferedWriter bufferedWriter =
                new BufferedWriter(fileWriter);
            bufferedWriter.write(area.getInfo());
            areas.put(area.getId(), area);
            bufferedWriter.newLine();
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println("Error reading the database");                  
        }
    }
    public void addRoom(Room room, Area area){
        try {
            FileWriter fileWriter =
                new FileWriter(db_rooms, true);
            BufferedWriter bufferedWriter =
                new BufferedWriter(fileWriter);
            bufferedWriter.write("Area:"+ area.getId() + ";" + room.getInfo());
            rooms.put(room.getId(), room);
            bufferedWriter.newLine();
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println("Error reading the database");                  
        }
    }
    public String getDBRooms(){
        String result = General.getDB(db_rooms);
        return result;
    }  
    public String getDBAreas(){
        String result = General.getDB(db_areas);
        return result;
    }
}