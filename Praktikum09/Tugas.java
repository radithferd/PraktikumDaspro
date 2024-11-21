package Praktikum09;
import java.util.Scanner;
public class Tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] daftarMenu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        double[] daftarHarga = {20000, 22000, 15000, 17000, 13000, 18000, 20000};
        
        System.out.print("Masukkan jumlah menu yang akan dipesan: ");
        int jmlPesanan = sc.nextInt();
        sc.nextLine();

        String[] daftarPesanan = new String[jmlPesanan];
        int[] jmlPesananMenu = new int[jmlPesanan];

        for (int i = 0; i < jmlPesanan; i++) {
            System.out.println();
            System.out.print("Masukkan nama menu: ");
            String menuPesanan = sc.nextLine();

            int indeks = -1;
            for (int j = 0; j < daftarMenu.length; j++) {
                if (daftarMenu[j].equalsIgnoreCase(menuPesanan)) {
                    indeks = j;
                    break;
                }
            }

            if (indeks != -1) {
                daftarPesanan[i] = daftarMenu[indeks];
                System.out.print("Masukkan jumlah pesanan untuk " + menuPesanan + ": ");
                jmlPesananMenu[i] = sc.nextInt();
                sc.nextLine();
            } else {
                System.out.println("Menu yang anda pilih tidak tersedia");
                i--;
            }
        }

        double totalHarga = 0;
        for (int i = 0; i < jmlPesanan; i++) {
            int indeks = -1;
            for (int j = 0; j < daftarMenu.length; j++) {
                if (daftarMenu[j].equalsIgnoreCase(daftarPesanan[i])) {
                    indeks = j;
                    break;
                }
            }

            if (indeks != -1) {
                totalHarga += daftarHarga[indeks] * jmlPesananMenu[i];
            }
        }

        System.out.println();
        System.out.println("Daftar Pesanan Anda: ");
        for (int i = 0; i < jmlPesanan; i++) {
            System.out.println(daftarPesanan[i] + " - Jumlah: " + jmlPesananMenu[i]);
        }

        System.out.println();
        System.out.println("Total harga yang perlu dibayar: Rp " + totalHarga);
        System.out.println();
    }        
}      