public class Speaker extends Device{

	private int volume; // Nivel de volumen de TV

	public Speaker(String name, String brand, String model){
		super(name, brand, model, "Speaker");
		volume = 30;
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
			";Volume:" + volume;
	}
}