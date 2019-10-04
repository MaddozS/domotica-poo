
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;

public class HouseCRUD {
    public void createHouse(House house) throws IOException{
        String record;
        BufferedReader br = new BufferedReader( new FileReader("AdminHouse_db.txt") );
        BufferedWriter bw = new BufferedWriter( new FileWriter("AdminHouse_db.txt",true) );
        
        while( ( record = br.readLine() ) != null ) {
            if( record.contains("-") ) {
                bw.write(house.getHouseId()+";"+house.getHouseName()+";");
    		bw.flush();
    		bw.newLine();
    		bw.close();
            }
        }
        br.close();
    }
    public void createDevices() throws IOException{
        String record;
        BufferedReader br = new BufferedReader( new FileReader("devices_database.txt") );
        BufferedWriter bw = new BufferedWriter( new FileWriter("devices_database.txt",true) );
        
        while( ( record = br.readLine() ) != null ) {
            if( record.contains("-") ) {
    		bw.flush();
    		bw.newLine();
    		bw.close();
            }
        }
        br.close();
    }
    public void createRoom() throws IOException{
        
    }
    public void readHouse() throws IOException{
        
    }
    public void readFloor() throws IOException{
        
    }
    public void readRoom() throws IOException{
        
    }
    
    
}