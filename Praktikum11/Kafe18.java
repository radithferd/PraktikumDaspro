package Praktikum11;
import java.util.Scanner;
public class Kafe18 {

    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
    
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang anda inginkan.");
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }

    public static double Promo(String kodePromo){
        if (kodePromo.equalsIgnoreCase ("DISKON50")){
            System.out.println("Anda mendapatkan diskon tambahan 50%");
            return 0.5;
        } else if (kodePromo.equalsIgnoreCase("DISKON30")){
            System.out.println("Anda mendapatkan diskon tambahan 30%");
            return 0.3;
        } else {
            System.out.println("Kode promo tidak valid");
            return 0.0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama anda: ");
        String namaPelanggan = sc.nextLine();
        System.out.print("Apakah anda member (true/false): ");
        Boolean isMember = sc.nextBoolean();
        System.out.println();
        Menu(namaPelanggan, isMember);

        int totalHarga = 0;

        while (true) {
            System.out.print("\nMasukkan nomor menu yang ingin anda pesan (0 untuk selesai): ");
            int pilihanMenu = sc.nextInt();

            if (pilihanMenu == 0) {
                break;
            }

            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();

            totalHarga += hitungTotalHarga(pilihanMenu, banyakItem);
        }

        System.out.println("Total harga untuk pesanan anda: Rp" + totalHarga);

        System.out.println();
        System.out.print("Masukkan kode promo (jika ada): ");
        sc.nextLine();
        String kodePromo = sc.nextLine();

        double totalDiskon = Promo(kodePromo);
        
        // diskon member
        if (isMember){
            totalDiskon += 0.1;
        }

        double totalBayar = (totalHarga - (totalHarga * totalDiskon));
        System.out.println("Total yang harus dibayar: Rp" + totalBayar);
        System.out.println();
    }   
}