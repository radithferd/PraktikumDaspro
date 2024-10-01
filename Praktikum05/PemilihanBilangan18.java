package Praktikum05;

import java.util.Scanner;

public class PemilihanBilangan18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();

        String hasil = (angka % 2 == 0) ? "Bilangan genap" : "Bilangan Ganjil";
        System.out.println(angka + " adalah " + hasil);
    }
}