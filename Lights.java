public class Lights extends Device{

	public Lights(String brand, String model){
		super(brand, model);
	}

	public String getInfo(){
		String info = "Device: " + getId() + 
			";Brand: " +  brand + 
			";Model: " + model +
			";Status: " + status;
		return info;
	}
}