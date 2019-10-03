public class Lights implements Device{

	private static int id; //id del dispositivo
	private Boolean status; //indica si el dispositivo se encuentra encendido o apagado

	public Lights(int id){
		id++;
		this.id = id;
	}

	public Boolean getStatus(){
		return status;
	}

	public int getId(){
		return id;
	}

	public void turnOff(){
		status = false;
	}

	public void turnOn(){
		status = false;
	}

}