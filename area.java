public class Area {
    private String areaName;
    private String areaId;
    public Map<String, Room> rooms=new HashMap<>();

    Area(String areaName, String areaId){
    	this.areaName=areaName;
    	this.areaId=areaId;
    }

    public void setAreaName(String areaName){
    	this.areaName=areaName;
    }

    public void setAreaId(String areaId){
    	this.areaId=areaId;
    }

    public String getAreaName(){
    	return areaName;
    }

    public String getAreaId(){
    	return areaId;
    }

    public void addRoom(Room newRoom){
    	room.put(newRoom.getRoomId(), newRoom)
    }

    public void removeRoom(String roomID){
    	if(room.containsKey(roomID)){
    		room.remove(roomID);
    	}
    }
}