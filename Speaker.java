public class Speaker implements Device{

	private static int id; //id del dispositivo
	private String brand; //marca del dispositivo
	private String model; //modelo del dispositivo
	private Boolean status; //indica si el dispositivo se encuentra encendido o apagado
	private int volume; // Nivel de volumen de TV

	public Speaker(String brand, String model){
		id++;
		this.brand = brand;
		this.model = model;
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public String getStatus(){
		return status;
	}

	public void turnOff(){
		status = false;
	}

	public void turnOn(){
		status = false;
	}

	public void volumeUp(){
		volume++;
	}

	public void volumeDown(){
		volume--;
	}

}