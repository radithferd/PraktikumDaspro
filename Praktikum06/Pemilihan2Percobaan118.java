package Praktikum06;

import java.util.Scanner;

public class Pemilihan2Percobaan118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int tahun;

        System.out.print("Input tahun: ");
        tahun = sc.nextInt();

        if (tahun % 400 == 0 || (tahun % 4 == 0 && tahun % 100 != 0)) {
            System.out.println("Tahun Kabisat");
        } else {
            System.out.println("Bukan Tahun Kabisat");
        }
    } 
}