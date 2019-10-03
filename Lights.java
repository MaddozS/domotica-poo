public class Lights extends Device{

	public Lights(int roomId, int areaId, int houseId, String brand, String model){
		super(roomId, areaId, houseId, brand, model);
	}

	public String getInfo(){
		String info = "Device: " + getId() + 
			";House: " + getHouseId() +
			";Area: " + getAreaId() + 
			";Room: " + getRoomId() +
			";Brand: " +  brand + 
			";Model: " + model +
			";Status: " + status;
		return info;
	}
}