public class Speaker extends Device{

	private int volume; // Nivel de volumen de TV

	public Speaker(int roomId, int areaId, int houseId, String brand, String model){
		super(roomId, areaId, houseId, brand, model);
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
			";Volume: " + volume;
		return info;
	}
}