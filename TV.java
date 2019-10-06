public class TV extends Device{

	private int volume = 35; // Nivel de volumen de TV
	private int channel; //Canal de TV

	//Constructor define marca y modelo de TV
	public TV(String name,String brand, String model){
		super(name, brand, model, "TV");
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
		return "ID:" + deviceId +
			";Type:" + type + 
			";Device:" + name + 
			";Brand:" +  brand + 
			";Model:" + model +
			";Status:" + status +
			";Channel:" + channel +
			";Volume:" + volume;
	}
}