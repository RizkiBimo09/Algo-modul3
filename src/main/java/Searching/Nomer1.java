package Searching;
import java.util.Scanner;
public class Nomer1 {
    public static void main (String[] args){
    System.out.println("===== SEQUENTIAL SEARCH ====="+"\n");
        String data[] = {"Galileo", "Archimedes", "Alkhawarizmi", "Aljabar", "Bimo", "Tesla" };
        String key; 
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan data yang dicari: ");
        key = input.nextLine();
        
        System.out.print("isi data adalah:");
        for (int i = 0; i < data.length; i++) {
        
            System.out.print(data[i] + " ");
        }    
        System.out.println("");
        
        
        
        for (int i = 0; i <= data.length; i++) {
            if (key.equalsIgnoreCase(data[i])) {
                System.out.print("Data "+key+" berada pada index ke - " + i);
                 break; 
            }
        } 
        System.out.println("\n");
        System.out.println("Data ditemukan");
            System.out.println("===== TERIMA KASIH =====");     
           // "Rizki Bimo Wijaya"
           
    }
               
}


    

