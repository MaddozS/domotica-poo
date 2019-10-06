public abstract class Device{


	protected String brand; //marca del dispositivo
	protected String model; //modelo del dispositivo
	protected String name;
	protected int deviceId;
	protected static int count_devices;
	protected String type;
	protected String status; //indica si el dispositivo se encuentra encendido o apagado

	public Device(String name, String brand, String model, String type){ //
		count_devices++;
		this.brand = brand;
		this.model = model;
		this.name = name;
		this.deviceId = count_devices;
		this.type = type;
		status = "Off";
	}
	public void turnOff(){
		status = "Off";
	}
	public void turnOn(){
		status = "On";
	}
	public int getId(){
		return deviceId;
	}
	public String getName(){
		return name;
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
	public String getType(){
		return type;
	}
	public abstract String getInfo();
}