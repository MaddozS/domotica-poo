public class Lights extends Device{
	public int counter = 0;

	public Lights(int roomId, int areaId, int houseId, String brand, String model){
		super(roomId, areaId, houseId, brand, model);
	}

	public int LightCounter(){
		counter++;
	}

	public String getInfo(){
		String info = "Device: " + getId() + 
			";House: " + getHouseId() +
			";Area: " + getAreaId() + 
			";Room: " + getRoomId() +
			";Brand: " +  brand + 
			";Model: " + model +
			";Status: " + status + 
			";Devices: " + counter;
		return info;
	}
}