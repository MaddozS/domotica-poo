import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;

public class HouseCRUD {
    public void createHouse(House house){
         try {
            FileReader fileReader = 
                new FileReader(database);
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);
            while((line = bufferedReader.readLine()) != null) {
                String[] columns = line.split(";");
                String[] key = columns[0].split(": ");
                String device_id = key[1];
            if( record.contains("-") ) {
                bw.write(house.getHouseId()+";"+house.getHouseName()+";");
    			bw.flush();
    			bw.newLine();
    			bw.close();
            	}
        	}
        br.close();
    }
    public void createDevices(){
        try {
            FileReader fileReader = 
                new FileReader(database);
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);
            while((line = bufferedReader.readLine()) != null) {
                String[] columns = line.split(";");
                String[] key = columns[0].split(": ");
                String device_id = key[1];

            	if(devices.get(device.getId()) != null){
            		System.out.println("This device already exists");
        		}
        		else{
            		String entry;
        
            		entry = device.getInfo();
            		devices.put(device.getId(), device);
            		total_devices++;
            		insertDatabase(entry);
        		}
        	}
        br.close();
    	}
    }
    public void createRoom(){
        
    }
    public void readHouse(){
        
    }
    public void readFloor() throws IOException{
        
    }
    public void readRoom() throws IOException{
        
    }
    
    
}