import java.util.HashMap;
import java.io.*;

public class DeviceAdmin{
    private static int total_devices;
    private static String database="devices_database.txt";
    private HashMap<Integer,Device> devices = new HashMap<>();

    // public AdminDispositivo(){}
    // public addDevice(Dispositivo dispositivo){
    //     if()
    //     total_dispositivos++;
    public void addDevice(Device device){
        if(devices.get(device.getId()) != null){
            System.out.println("This device is already in the Controller");
        }
        else{
            String entry;
        
            entry = device.getInfo();
            devices.put(device.getId(), device);
            total_devices++;
            insertDatabase(entry);
        }
    }

    public void removeDevice(Device device){
        String line = null;
        String tmp = "";
        try {
            FileReader fileReader = 
                new FileReader(database);
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);
            while((line = bufferedReader.readLine()) != null) {
                String[] columns = line.split(";");
                String[] key = columns[0].split(": ");
                String device_id = key[1];

                if(device.getId() !=  Integer.parseInt(device_id) ){
                    tmp += line + "\n";
                }
                else{
                    devices.remove(device.getId());
                }
            }
            bufferedReader.close();
            
            try {
                FileWriter fileWriter =
                    new FileWriter(database);
                BufferedWriter bufferedWriter =
                    new BufferedWriter(fileWriter);
                bufferedWriter.write(tmp);
                bufferedWriter.close();
            }
            catch(IOException ex) {
                System.out.println("Error reading the database");                  
            }
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open the database");                
        }
        catch(IOException ex) {
            System.out.println("Error reading the databse"); 
        }
    }
    public static void insertDatabase(String entry){
        File file = new File(database);
        // Checking if the database exist
        try{
            file.createNewFile();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        try {
            FileWriter fileWriter =
                new FileWriter(database, true);
            BufferedWriter bufferedWriter =
                new BufferedWriter(fileWriter);
            bufferedWriter.write(entry);
            bufferedWriter.newLine();
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println("Error reading the database");                  
        }
    } 
    public static void showAllDevices(){
        String line = null;
        try {
            FileReader fileReader = 
                new FileReader(database);
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);
            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }   
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open the database");                
        }
        catch(IOException ex) {
            System.out.println("Error reading the databse"); 
        }
    }
}