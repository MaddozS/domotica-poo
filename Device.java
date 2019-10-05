public abstract class Device{

	protected int roomId;
	protected int areaId;
	protected int houseId;
	protected String brand; //marca del dispositivo
	protected String model; //modelo del dispositivo
	protected int deviceId;
	protected static int count_devices;
	protected String status; //indica si el dispositivo se encuentra encendido o apagado
	public int devOn=0;//LLeva cuenta de cuantos dispositivos hay encendidos

	public Device(String brand, String model){ //
		count_devices++;
		this.brand = brand;
		this.model = model;
		this.deviceId = count_devices;
		status = "Off";
	}
	public void turnOff(){
		status = "Off";
		devOn--;
	}

	public void turnOn(){
		status = "On";
		devOn++;
	}

	public int getId(){
		return deviceId;
	}

	public void setRoomId(int id){
		roomId = id;
	}

	public void setAreaId(int id){
		areaId = id;
	}

	public void setHouseId(int id){
		houseId = id;
	}

	public String getBrand(){
		return brand;
	}

	public String getModel(){
		return model;
	}
	
	public String getStatus(){
		return status;
	}

	public abstract String getInfo();

}