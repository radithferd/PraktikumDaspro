package Praktikum03;
import java.util.Scanner;
public class TugasListrik18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int tariflistrik, penggunaanlistrik, tagihan, listrikLebih;

        listrikLebih = 500;
        tariflistrik = 1500;

        System.out.println("Masukkan jumlah penggunaan listrik (kWh): ");
        penggunaanlistrik = sc.nextInt();
        tagihan = penggunaanlistrik * tariflistrik;
        System.out.println("Berikut adalah tagihan listrik anda: " + tagihan);
        System.out.println("Apakah listrik lebih dari 500kWh? " + (listrikLebih < penggunaanlistrik));
    }
}
