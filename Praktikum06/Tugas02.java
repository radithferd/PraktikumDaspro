package Praktikum06;

import java.util.Scanner;

public class Tugas02 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    String hari, jenisBuku;
    int jumlahBuku;
    double diskon, totalDiskon;

    System.out.println("Masukkan hari ini : ");
    hari = sc.nextLine();

    if (hari.equalsIgnoreCase("rabu")) {
        System.out.println("Masukkan jenis buku ");
        jenisBuku = sc.nextLine();
        if (jenisBuku.equalsIgnoreCase("kamus")){
            diskon = 0.1;
            System.out.println("Masukkan jumlah buku ");
            jumlahBuku = sc.nextInt();
            if (jumlahBuku > 2) {
               diskon = 0.12;
               System.out.println("Diskon yang anda dapat " + diskon);
            else {
                diskon = 0.1;
                System.out.println("Diskon yang anda dapat " + diskon);
            }
            }
        } else if (jenisBuku.equalsIgnoreCase("novel")){
            diskon = 0.07;
            System.out.println("Masukkan jumlah buku ");
            jumlahBuku = sc.nextInt();
            if (jumlahBuku > 3) {
                diskon = 0.09;
                System.out.println("Diskon yang anda dapat " + diskon);
            else {
                
            }
            }
        } 
    }
    
    }
}
