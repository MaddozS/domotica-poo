public class AC implements Device{

	private static int id; //id del dispositivo
	private String brand; //marca del dispositivo
	private String model; //modelo del dispositivo
	private Boolean status; //indica si el dispositivo se encuentra encendido o apagado
	private int temp = 20; //temperatura del clima;

	//Constructor define marca y modelo del AC
	public AC(String brand, String model){ //
		id++; //Instancia de la cantidad de AC
		this.brand = brand;
		this.model = model;
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public String getBrand(){
		return brand;
	}

	public String getModel(){
		return model;
	}

	public Boolean getStatus(){
		return status;
	}

	public int getTemp(){
		return temp;
	}

	public void turnOff(){
		status = false;
	}

	public void turnOn(){
		status = true;
	}

	//Baja temperatura
	public void coolDown(){
		temp--;
	}

	//Sube temperatura
	public void heatUp(){
		temp++;
	}



}