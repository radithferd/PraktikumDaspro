package Praktikum06;

import java.util.Scanner;

public class Pemilihan2Percobaan318 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    
    String kategori;
    int penghasilan, gajiBersih;
    double pajak = 0;

    System.out.print("Masukkan Kategori : ");
    kategori = sc.nextLine();
    System.out.print("Masukkan Besarnya Penghasilan : ");
    penghasilan = sc.nextInt();

    if (kategori.equalsIgnoreCase("pekerja")) {
        if (penghasilan <= 2000000)
           pajak = 0.1;
        else if (penghasilan <= 3000000)
           pajak = 0.15;
        else 
           pajak = 0.2;
        gajiBersih = (int) (penghasilan - (pajak * penghasilan));
        System.out.println("Penghasilan Bersih : " + gajiBersih);
    } else 
        System.out.println("Masukan Kategori Salah");
    }
}