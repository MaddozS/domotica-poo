public class Lights extends Device{

	public Lights(String name, String brand, String model){
		super(name, brand, model, "Light");
	}

	public String getInfo(){
		return "ID:" + deviceId +
			";Type:" + type + 
			";Device:" + name + 
			";Brand:" +  brand + 
			";Model:" + model +
			";Status:" + status;
	}
}