import java.util.HashMap;
import java.util.Map;

public class Area {
    private String areaName;
    private String areaId;
    public Map<String, Room> rooms=new HashMap<>();
    public ArrayList<Map> val = new ArrayList<Map>();
    public ArrayList<Map> state = new ArrayList<Map>();


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
    	room.put(newRoom.getRoomId(), newRoom);
    }

    public void removeRoom(String roomID){
    	if(room.containsKey(roomID)){
    		room.remove(roomID);
    	}
    }
        
    //Obtiene todos los dispositivos de un area
    public String getRoomDevices(){
        Iterator<Integer> Iterator = rooms.keySet().Iterator();
        while(iterator.hasNext()){
            Room room = rooms.get(iterator.next());
            val.add(room.getDevicesInfo());
        }

        String roomDevices = val;

        return roomDevices;
	}

    //Obtiene todos los estados de encendido o apagado de las habitaciones
    public String getRoomState(){
        Iterator<Integer> Iterator = rooms.keySet().Iterator();
        while(iterator.hasNext()){
            Room room = rooms.get(iterator.next());
            state.add(room.getDevicesState());
        }

        String roomDevices = state;

        return roomDevices;
	}

}