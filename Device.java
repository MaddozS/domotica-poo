public abstract class Device{

	private int roomId;
	private int areaId;
	private int houseId;
	private static int deviceId;

	public int getRoomId(){
		return roomId;
	}

	public int getAreaId(){
		return areaId;
	}

	public int getHouseId(){
		return houseId;
	}

	public int getDeviceId(){
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

	public void setDeviceId(){
		deviceId++;
	}

	public abstract void turnOff(); //Enciende un dispositivo
	public abstract void turnOn(); //Apaga un dispositivo

}