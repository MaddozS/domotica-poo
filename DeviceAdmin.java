import java.util.HashMap;
import java.util.ArrayList;
import java.io.*;

public class DeviceAdmin{
    private static int total_devices;
    private final String database="devices_database.txt";
    private HashMap<Integer,Device> devices = new HashMap<>();
    private HashMap<String, Integer> devices_count = new HashMap<>();

    // public AdminDispositivo(){}
    // public addDevice(Dispositivo dispositivo){
    //     if()
    //     total_dispositivos++;
    public DeviceAdmin(){
        General.createFile(database);
    }
    public void printTypeDevices(){
        System.out.println(devices_count);
    }
    public void printTotalDevicesByType(){
        System.out.println(devices_count);
    }
    public void updateDevice(Device device, Room room){
        removeDevice(device);
        addDevice(device, room);
    }
    public int devicesOn(){
        String _devices = getDevices();
        int devices_on=0;
        String[] entries = _devices.split("\n");
        for (String field : entries) {
            String[] pairs = field.split(";");
            for (String pair : pairs) {
                String[] _aux = pair.split(":");
                if(_aux[0].equals("Status")){
                    if(_aux[1].equals("On")){
                        devices_on++;
                    }
                }
            }
        }
        return devices_on;
    }
    public int devicesOff(){
        String _devices = getDevices();
        int devices_off = 0;
        String[] entries = _devices.split("\n");
        for (String field : entries) {
            String[] pairs = field.split(";");
            for (String pair : pairs) {
                String[] _aux = pair.split(":");
                if(_aux[0].equals("Status")){
                    if(_aux[1].equals("Off")){
                        devices_off++;
                    }
                }
            }
        }
        return devices_off;
    }
    public void turnOffAllDevicesByRoom(Room room){
        String _devices = Control.getAllDevicesBy("Room", String.valueOf(room.getId()), this);
        String _id;
        String[] entries = _devices.split("\n");
        for (String field : entries) {
            String[] pairs = field.split(";");
            for (String pair : pairs) {
                String[] _aux = pair.split(":");
                if(_aux[0].equals("ID")){
                    _id=_aux[1];
                    Device aux_device = devices.get(Integer.valueOf(_id));
                    aux_device.turnOff();
                    updateDevice(aux_device, room);
                    devices.put(aux_device.getId(), aux_device);
                }
            }
        }
    }
    public void turnOnAllDevicesByRoom(Room room){
        String _devices = Control.getAllDevicesBy("Room", String.valueOf(room.getId()), this);
        String _id;
        String[] entries = _devices.split("\n");
        for (String field : entries) {
            String[] pairs = field.split(";");
            for (String pair : pairs) {
                String[] _aux = pair.split(":");
                if(_aux[0].equals("ID")){
                    _id=_aux[1];
                    Device aux_device = devices.get(Integer.valueOf(_id));
                    aux_device.turnOn();
                    updateDevice(aux_device, room);
                    devices.put(aux_device.getId(), aux_device);
                }
            }
        }
    }
    public void addDevice(Device device, Room room){
        if(devices.get(device.getId()) != null){
            System.out.println("This device is already in the Controller");
        }
        else{
            String entry;
            entry = device.getInfo();
            devices.put(device.getId(), device);
            total_devices++;
            Integer aux = devices_count.get(device.getType());
            if(aux != null){
               devices_count.put(device.getType(), aux.intValue()+1);
            }
            else{
                devices_count.put(device.getType(), 1);
            }
            insertDatabase(entry + ";Room:" + room.getId());
        }
    }

    public void removeDevice(Device device){
        String line = null;
        String tmp = "";
        try {
            FileReader fr = new FileReader(database);
            BufferedReader br = new BufferedReader(fr);
            while((line = br.readLine()) != null) {
                // Splitting each field
                String[] fields = line.split(";");
                // Getting the value of each field
                String[] field = fields[0].split(":");
                // Getting the device's id
                String device_id = field[1];

                // Each device with different id will be written to
                // the database
                Integer aux = devices_count.get(device.getType());
                if(device.getId() !=  Integer.parseInt(device_id) ){
                    tmp += line + "\n";
                }
                else{
                    devices.remove(device.getId());
                    total_devices--;
                    devices_count.put(device.getType(), aux.intValue()-1);
                }
            }
            br.close();
            
            try {
                // Saving the changes to the database
                FileWriter fw = new FileWriter(database);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(tmp);
                bw.close();
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
    public void insertDatabase(String entry){
        try {
            FileWriter fw = new FileWriter(database, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(entry);
            bw.newLine();
            bw.close();
        }
        catch(IOException ex) {
            System.out.println("Error reading the database");                  
        }
    } 
    public String getDevices(){
        String result = General.getDB(database);
        return result;
    }
    public void printDevices(){
        System.out.println(getDevices());
    }
    public String getDeviceById(Device device){
        String line = null;
        String result = "";
        try {
            FileReader fr = new FileReader(database);
            BufferedReader br = new BufferedReader(fr);
            while((line = br.readLine()) != null) {
                result += line + "\n";
            }   
            br.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open the database");                
        }
        catch(IOException ex) {
            System.out.println("Error reading the databse"); 
        }
        return result;
    }
}