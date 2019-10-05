public class Lights extends Device{
	public int counter = 0;

	public Lights(String brand, String model){
		super(brand, model);
	}

	public int LightCounter(){
		counter++;
	}

	public String getInfo(){
		String info = "Device: " + getId() + 
			";Brand: " +  brand + 
			";Model: " + model +
			";Status: " + status + 
			";Devices: " + counter;
		return info;
	}
}