public class TV extends Device{

	private int volume = 35; // Nivel de volumen de TV
	private int channel; //Canal de TV

	//Constructor define marca y modelo de TV
	public TV(String brand, String model){
		super(brand, model);
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
			";Brand: " +  brand + 
			";Model: " + model +
			";Status: " + status +
			";Channel: " + channel +
			";Volume: " + volume;
		return info;
	}
}