import java.util.Arrays;

public class Room{

	private int devices[];
	private String name;
	private int id;
	private static int numRoomes = 1;
	private int numDevices;

	public Room(String name){
		devices = new int[100];
		this.numDevices = 0;
		this.name = name;
		this.id = numRoomes;
		numRoomes++;
	}

	public void addDevice(Dispositivo device){
		Arrays.sort(devices);
		if(Arrays.binarySearch(devices,device.getId()) <= 0){
			System.out.println(device.getId());
			this.devices[numDevices] = device.getId(); 
			this.numDevices++;
		}
	}

	public int[] getDisList(){
		int[] newDevices = Arrays.copyOfRange(this.devices,100 - numDevices, 100);
		return newDevices;
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