import java.io.*;
import java.util.HashMap;
import java.util.ArrayList;

public class General{

    public static void createFile(String file_name){
        File file = new File(file_name);
        // Checking if the database exist
        try{
            file.createNewFile();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        try {
            FileWriter fileWriter =
                new FileWriter(file_name);
            BufferedWriter bufferedWriter =
                new BufferedWriter(fileWriter);
            // bufferedWriter.write("");
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println("Error reading the database");                  
        }
    }
    public static String getDB(String file_name){
        String line = null;
        String result = "";
        try {
            FileReader fr = new FileReader(file_name);
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