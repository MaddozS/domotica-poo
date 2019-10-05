import java.util.HashMap;
import java.util.Map;


public class Area {
    private String areaName;
    private int id;
    private static int areaId;
    public HashMap<Integer, Room> rooms = new HashMap<>();

    public Area(String areaName){
        areaId++;
    	this.areaName=areaName;
    	id=areaId;
    }

    public String getName(){
    	return areaName;
    }

    public int getId(){
    	return this.id;
    }

    public Map getRoomList(){
        return rooms;
    }

    public void addRoom(Room newRoom){
    	rooms.put(newRoom.getId(), newRoom);
    }

    public void removeRoom(Room room){
    	if(rooms.get(room.getId()) != null){
    		rooms.remove(room.getId());
    	}
    }
}