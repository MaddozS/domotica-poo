import java.util.HashMap;
import java.util.Map;

public class Room{

	private Map <Integer,Integer> devices;
	private String name;
	private int id;
	private static int numRoomes = 1;
	private int numDevices;

	public Room(String name){
		devices = new HashMap<>();
		this.numDevices = 0;
		this.name = name;
		this.id = numRoomes;
		numRoomes++;
	}

	public void addDevice(Dispositivo device){
		devices.putIfAbsent(device.getId(),device.getId());
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

	public void setName(String name){
		this.name = name;
	}
}
