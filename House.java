import java.util.HashMap;
import java.util.Map;

public class House{
    private String houseName;
    private static int houseId;
    private int id;
    public HashMap<Integer,Area> areas = new HashMap<>();

    public House(String houseName){
        houseId++;
    	this.houseName=houseName;
        id = houseId;
    }

    public void setName(String areaName){
    	this.houseName=areaName;
    }

    public String getName(){
    	return houseName;
    }

    public Map getAreaList(){
        return areas;
    }

    public int getId(){
    	return id;
    }

    public void addArea(Area area){
    	areas.put(area.getId(), area);
    }

    public void removeArea(Area area){
    	if(areas.get(area.getId()) != null){
            areas.remove(area.getId());
        }
    }
}