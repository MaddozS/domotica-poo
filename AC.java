public class AC extends Device{

	private int temp = 16; //temperatura del clima;

	//Constructor define marca y modelo del AC
	public AC(int roomId, int areaId, int houseId, String brand, String model){ //
		super(roomId, areaId, houseId, brand, model);
	}

	public String getBrand(){
		return brand;
	}

	public String getModel(){
		return model;
	}

	public int getTemp(){
		return temp;
	}

	//Baja temperatura
	public void coolDown(){
		if(temp>16){
			temp--;
		}
	}
	//Sube temperatura
	public void heatUp(){
		if(temp<30){
			temp++;
		}
	}

	//Despliega informacion del AC
	public String getInfo(){
		String info = "Device: " + getId() + 
			";House: " + getHouseId() +
			";Area: " + getAreaId() + 
			";Room: " + getRoomId() +
			";Brand: " +  brand + 
			";Model: " + model +
			";Status: " + status +
			";Temperature: " + temp + ";";
		return info;
	}
}