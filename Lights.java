public class Lights extends Device{

	private static int id; //id del dispositivo
	private Boolean status; //indica si el dispositivo se encuentra encendido o apagado

	public Lights(int roomId, int areaId, int houseId){
		this.setDeviceId();
		this.setRoomId();
		this.setAreaId();
		this.setHouseId();
	}

	public Boolean getStatus(){
		return status;
	}

	public void turnOff(){
		status = false;
	}

	public void turnOn(){
		status = false;
	}

}