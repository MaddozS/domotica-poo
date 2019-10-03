public class Speaker extends Device{

	private String brand; //marca del dispositivo
	private String model; //modelo del dispositivo
	private Boolean status; //indica si el dispositivo se encuentra encendido o apagado
	private int volume; // Nivel de volumen de TV

	public Speaker(int roomId, int areaId, int houseId, String brand, String model){
		this.brand = brand;
		this.model = model;
		this.setDeviceId();
		this.setRoomId();
		this.setAreaId();
		this.setHouseId();
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