import java.util.HashMap;

public class Area{
    private String areaName;
    private static int areaId;
    public HashMap<Integer,Room> rooms = new HashMap<>();

    public Area(String areaName){
        areaId++;
    	this.areaName=areaName;
    }

    public void setAreaName(String areaName){
    	this.areaName=areaName;
    }

    public String getAreaName(){
    	return areaName;
    }

    public int getId(){
    	return areaId;
    }

    public void addRoom(Room newRoom){
    	rooms.put(newRoom.getId(), newRoom);
    }

    public void removeRoom(int roomID){
    	if(rooms.get(roomID) != null){
    		rooms.remove(roomID);
    	}
    }
}