//package Praktikum03;
import java.util.Scanner;
public class Bank18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double tabunganAwal, tabunganAkhir, bunga, presentaseBunga;
        int lamaMenabung;

        presentaseBunga = 0.0002;
        System.out.print("Masukkan jumlah tabungan awal: ");

        tabunganAwal = sc.nextDouble();
        System.out.print("Masukkan lama menabung (bulan): ");
        
        lamaMenabung = sc.nextInt();
        bunga = presentaseBunga * lamaMenabung * tabunganAwal;
        tabunganAkhir = tabunganAwal + bunga;
        System.out.println("Bunga: " + bunga);
        System.out.println("Tabungan akhir: " + tabunganAkhir);
        sc.close();
    }   
}
