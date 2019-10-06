import java.util.HashMap;
import java.util.Map;

public class House{
    private String houseName;
    private static int houseId;
    private int id;
    public HashMap<Integer,Area> areas = new HashMap<>();
    public ArrayList<Map> val = new ArrayList<Map>();
    public ArrayList<Map> state = new ArrayList<Map>();

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

    //Obtiene todos los dispositivos de la casa
    public String getHouseDevices(){
        Iterator<Integer> Iterator = areas.keySet().Iterator();
        while(iterator.hasNext()){
            Area area = areas.get(iterator.next());
            val.add(area.getRoomDevices());
        }

        String houseDevices = val;

        return houseDevices;
    }

    //Obtiene el estado encendido o apagado de cada dispositivo de la casa
    public String getAreasState(){
        Iterator<Integer> Iterator = areas.keySet().Iterator();
        while(iterator.hasNext()){
            Area area = areas.get(iterator.next());
            state.add(area.getRoomState());
        }

        String houseDevices = state;

        return houseDevices;
    }
}