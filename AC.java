public class AC extends Device{

	private String brand; //marca del dispositivo
	private String model; //modelo del dispositivo
	private Boolean status; //indica si el dispositivo se encuentra encendido o apagado
	private int temp = 20; //temperatura del clima;

	//Constructor define marca y modelo del AC
	public AC(int roomId, int areaId, int houseId, String brand, String model){ //
		this.brand = brand;
		this.model = model;
		this.setDeviceId();
		this.setRoomId(roomId);
		this.setAreaId(areaId);
		this.setHouseId(houseId);
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

	//Despliega informacion del AC
	public void showInfo(){
		System.out.println("CasaId: " + getHouseId() +
			"\nAreaId: " + getAreaId() + 
			"\nHabitacion: " + getRoomId() +
			"\nId: " + getDeviceId() + 
			"\nMarca: " +  brand + 
			"\nModelo: " + model +
			"\nStatus: " + status +
			"\nTemperatura: " + temp);
	}



}