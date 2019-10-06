public class AC extends Device{

	private int temp; //temperatura del clima;

	//Constructor define marca y modelo del AC
	public AC(String name, String brand, String model){ //
		super(name, brand, model, "AC");
		temp = 16;
	}

	public String getBrand(){
		return brand;
	}

	public String getModel(){
		return model;
	}

	public int getTemp(){
		return temp;
	}

	//Baja temperatura
	public void coolDown(){
		if(temp>16){
			temp--;
		}
	}
	//Sube temperatura
	public void heatUp(){
		if(temp<30){
			temp++;
		}
	}

	//Despliega informacion del AC
	public String getInfo(){
		return "ID:" + deviceId +
			";Type:" + type + 
			";Device:" + name + 
			";Brand:" +  brand + 
			";Model:" + model +
			";Status:" + status +
			";Temperature:" + temp;
	}
}