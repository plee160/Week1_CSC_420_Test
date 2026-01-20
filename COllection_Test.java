/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collection_test;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.Random;

/**
 *
 * @author Phili
 */
public class COllection_Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        List<String> Fnames = new ArrayList<>();
        List<String> Lnames = new ArrayList<>();
        List<String> FLnames= new ArrayList<>();
        
               
        String filePath = "C:/Users/Phili/Documents/Note_Pad/FirstNames.txt";       
        try {
           
            BufferedReader reader = new BufferedReader(new FileReader(filePath));  
            String line = reader.readLine();
            
            if (line != null) {
                String[] Fname = line.split(",");
            
                for (String name : Fname) {
                    Fnames.add(name);
                }
            }
            
            reader.close();
            System.out.println("First Print");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        String filePath2 = "C:/Users/Phili/Documents/Note_Pad/LastNames.txt";       
        try {
           
            BufferedReader reader = new BufferedReader(new FileReader(filePath2));  
            String line2 = reader.readLine();
            
            if (line2 != null) {
                String[] Lname = line2.split(",");
            
                for (String name : Lname) {
                    Lnames.add(name);
                }
            }
            
            reader.close();
            System.out.println("Last Print");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        List<String> firstNames = new ArrayList<>();
        List<String> lastNames = new ArrayList<>();
        
        for (int i = 0; i <10; i++) {
            int Fnum = rand.nextInt(Fnames.size());
            int Lnum = rand.nextInt(Lnames.size());
            FLnames.add(Fnames.get(Fnum) + " " + Lnames.get(Lnum));
            
            firstNames.add(Fnames.get(Fnum));
            lastNames.add(Lnames.get(Lnum));
        }
        
        System.out.println("----Non-Sorted List----");
        int num = 1;
        for (String test2 : FLnames) {
            
            System.out.println(num + ". " + test2);
            num++;
        }
        
        

        
    }
    
}
