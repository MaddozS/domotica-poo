import java.util.HashMap;
import java.util.Map;

public class Room{

	private Map<Integer,Device> devices = new HashMap<>();
	public ArrayList<Map> val = new ArrayList<Map>();
	public ArrayList<Map> state = new ArrayList<Map>();
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

	//Obtiene todos los dispositivos de una habitación
	public String getDevicesInfo(){
		Iterator<Integer> iterator = devices.keySet().iterator();
		while(iterator.hasNext()){
			Device device = devices.get(iterator.next());
			val.add(device.getInfo());
		}

		String infoDevices = val1;

		return infoDevices;

	}

	//Obtiene el estado encendido o apagado de una habitacion
	public String getDevicesState(){
		Iterator<Integer> iterator = devices.keySet().iterator();
		while(iterator.hasNext()){
			Device device = devices.get(iterator.next());
			val.add(device.getStatus());
		}

		String infoDevices = state;

		return infoDevices;

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

	//Enciende todos los dipositivos
	public void turnOnAllDevices() {
        for (Device device: devices.id()) {
            device.turnOn();
        }
    }

	//Apagar todos los dispositivos
    public void turnOffAllDevices() {
		for (Device device: devices.id()) {
			device.turnOff();
   		}
    }
}


