package bankaccount.app.UTILS;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class ReadCsv {

    public static List<String[]> read(String path) {
        List<String[]> dataCustomer = new LinkedList<String[]>();
        String dataRow;
        try{
        BufferedReader bf = new BufferedReader(new FileReader(path));
        
        while ((dataRow = bf.readLine()) != null) {
            String[] fstring = dataRow.split(",");

            dataCustomer.add(fstring);
        }
        }catch(FileNotFoundException f){
            System.out.println("NOT FOUND FILE");
        
        }catch(IOException I){
            I.printStackTrace();
                    
        
        }
        
        return dataCustomer;

    }
}
