public class TV extends Device{

	private int volume = 35; // Nivel de volumen de TV
	private int channel; //Canal de TV
	public int counter = 0;

	public int TVCounter(){
		counter++;
	}

	//Constructor define marca y modelo de TV
	public TV(int roomId, int areaId, int houseId, String brand, String model){
		super(roomId, areaId, houseId, brand, model);
	}

	public void setChannel(int channelTv){
		channel = channelTv;
	}

	public void volumeUp(){
		volume++;
	}

	public void volumeDown(){
		volume--;
	}

	public String getInfo(){
		String info = "Device: " + getId() + 
			";House: " + getHouseId() +
			";Area: " + getAreaId() + 
			";Room: " + getRoomId() +
			";Brand: " +  brand + 
			";Model: " + model +
			";Status: " + status +
			";Channel: " + channel +
			";Volume: " + volume + 
			";Devices: " + counter;
		return info;
	}
}