//package Praktikum03;

public class ContohTipeData18 {
    public static void main(String[] args) {
        char GolonganDarah = 'A';
        short JumlahPenduduk = 1025;
        float suhu = 60.50f;
        double berat = 0.5467812345;
        long saldo = 1500000000;
        int AngkaDesimal = 0x10;

        System.out.println("Golongan darah\t " + (byte)GolonganDarah);
        System.out.println("Jumlah Penduduk\t: " + JumlahPenduduk);
        System.out.println("Suhu\t\t: " + suhu);
        System.out.println("Berat\t\t: " + (float)berat);
        System.out.println("Saldo\t\t: " + saldo);
        System.out.println("Angka desimal\t: " + AngkaDesimal);

    }
}
