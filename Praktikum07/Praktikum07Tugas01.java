package Praktikum07;
import java.util.Scanner;
public class Praktikum07Tugas01 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);   
    
    int totalTiketTerjual = 0;
    double totalPenjualan = 0, diskon = 0;
    int hargaTiket = 50000;

        do {
            System.out.print("Masukkan jumlah tiket yang dibeli (ketik 0 untuk selesai): ");
            int jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                break;
            }

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Silakan coba lagi.");
                continue;
            }

            double hargaTotal = jumlahTiket * hargaTiket;

            if (jumlahTiket > 10) {
                diskon = 0.15;
                hargaTotal -= hargaTotal*diskon;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
                hargaTotal -= hargaTotal*diskon;
            }

            totalTiketTerjual += jumlahTiket;
            totalPenjualan += hargaTotal;

            System.out.println("Total harga untuk " + jumlahTiket + " tiket: Rp " + hargaTotal);

        } while (true);

        System.out.println("Total tiket terjual: " + totalTiketTerjual);
        System.out.println("Total penjualan: Rp " + totalPenjualan);
        sc.close();
    }


    
}
