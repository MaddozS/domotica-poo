public class TV implements Device{

	private static int id; //id del dispositivo
	private String brand; //marca del dispositivo
	private String model; //modelo del dispositivo
	private Boolean status; //indica si el dispositivo se encuentra encendido o apagado
	private int volume; // Nivel de volumen de TV
	private int channel; //Canal de TV

	//Constructor define marca y modelo de TV
	public TV(String brand, String model){
		id++;
		this.brand = brand;
		this.model = model;
		this.id = id;
	}
	
	public void setChannel(int channelTv){
		channel = channelTv;
	}

	public String getStatus(){
		return status;
	}

	public void turnOff(){
		status = false;
	}

	public void turnOn(){
		status = false;
	}

	public void volumeUp(){
		volume++;
	}

	public void volumeDown(){
		volume--;
	}

}