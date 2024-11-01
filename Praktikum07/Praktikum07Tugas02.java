package Praktikum07;
import java.util.Scanner;
public class Praktikum07Tugas02 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);  
    
    int jenis, durasi, total=0;

    System.out.println("Alat penghitung biaya parkir");
    System.out.println("Ketik 1 untuk mobil");
    System.out.println("Ketik 2 untuk motor");
    System.out.println("Ketik 0 untuk keluar");
    
    do {
       System.out.print("Masukkan jenis kendaraan: ");
       jenis = sc.nextInt();

       if ((jenis==1)||(jenis ==2)) {
         System.out.print("Masukkan durasi parkir (jam): ");
         durasi = sc.nextInt();

          if (durasi > 5) {
            total += 12500;
          } else if (jenis == 1) {
            total += durasi * 3000;
          } else if (jenis == 2) {
            total += durasi * 2000;
         }
       } 
    } while (jenis != 0); 

    System.out.println("Total bayar parkir: " + total);
    sc.close();   
   }
}