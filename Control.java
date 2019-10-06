import java.util.HashMap;
import java.util.ArrayList;

public class Control{

    public static String getAllDevicesBy(String field, String dis, DeviceAdmin device_admin){
        String db = device_admin.getDevices();
        String result = "";
        String[] entries = db.split("\n");
        for (String entry : entries) {
            String[] fields = entry.split(";");
            for (String _field : fields) {
                String[] aux = _field.split(":");
                String key = aux[0];
                String value = aux[1];
                if(key.equals(field) && value.equals(dis)){
                    result += entry + "\n";
                }
            }
        }
        if(result == ""){
            result = "Results not found";
        }
        return result;
    }

    public static String getAllRoomsBy(String field, String dis, HouseAdmin house_admin){
        String db = house_admin.getDBRooms();
        String result = "";
        String[] entries = db.split("\n");
        for (String entry : entries) {
            String[] fields = entry.split(";");
            for (String _field : fields) {
                String[] aux = _field.split(":");
                String key = aux[0];
                String value = aux[1];
                if(key.equals(field)  && value.equals(dis)){
                    result += entry + "\n";
                }
            }
        }
        if(result == ""){
            result = "Results not found";
        }
        return result;
    }
}