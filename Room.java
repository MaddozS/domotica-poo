import java.util.HashMap;
import java.util.Map;

public class Room{

	private Map<Integer,Device> devices = new HashMap<>();
	private String name;
	private static int roomId;
	private int id;

	public Room(String name){
		roomId++;
		this.name = name;
		id = roomId;
	}

	public void addDevice(Device device){
		devices.put(device.getId(),device);
	}

	public Map getDeviceList(){
		return devices;
	}

	public int getId(){
		return this.id;
	}

	public String getName(){
		return this.name;
	}
	
	public void removeDevice(Device device){
    	if(devices.get(device.getId()) != null){
    		devices.remove(device.getId());
		}
	}
}
