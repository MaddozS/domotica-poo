import java.util.HashMap;

public class House{
    private String houseName;
    private static int houseId;
    public HashMap<Integer,Area> areas = new HashMap<>();

    public House(String houseName){
        houseId++;
    	this.houseName=houseName;
    }

    public void setName(String areaName){
    	this.houseName=areaName;
    }

    public String getName(){
    	return houseName;
    }

    public int getId(){
    	return houseId;
    }

    public void addRoom(Area area){
    	areas.put(area.getId(), area);
    }

    public void removeRoom(int areaId){
    	if(areas.get(areaId) != null){
    		areas.remove(areaId);
    	}
    }
}