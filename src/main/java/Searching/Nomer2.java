package Searching;
import java.util.Scanner; 
public class Nomer2 {
    public static void main(String[] args){
        int number[] = { 2,4,6,8,10,12,14,16,18,20};
        int Indexearly = 0;
        int Indexlast = number.length-1;
        int found = 0;
        int point = 0;
        Scanner scan = new Scanner(System.in);
        
    System.out.println("isi data adalah:");
    for(int i=0; i<number.length; i++){
        System.out.print(number[i]+" ");
    }
    
    System.out.println("\nMasukan angka yang akan dicari:");
    int key = scan.nextInt();
    
    while ((Indexearly <= Indexlast) && (found == 0)){
    point = (Indexearly + Indexlast) / 2;
    System.out.println("index pointer :"+ point);
        if(key == number[point]){
            found = 1;
            System.out.println("number key: "+key+" Telah ditemukan pada index ke-"+point);
        }
        
        else if (key < number[point] ) {
            System.out.println("Cari di kiri");
            Indexlast = point-1;  
        }
        else {
            Indexearly = point+1;
            System.out.println("Cari di kanan");
        }
    }
    
    if (found == 1)
        System.out.println("\nData telah ditemukan");
    else {
    System.out.println("Data tidak ditemukan");
    System.out.println("Rizki Bimo Wijaya");
    }     
  }
}

    

