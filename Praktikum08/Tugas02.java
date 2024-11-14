package Praktikum08;
import java.util.Scanner;
public class Tugas02 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int jumlahCabor = 0;

    do{
        System.out.print("Masukkan cabang olahraga: ");
        String cabor = sc.nextLine();

        System.out.println("Cabang olahraga: " + cabor);
        System.out.println("Masukkan 5 nama atlet:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Nama atlet ke-" + i + ": ");
            String atlet = sc.nextLine();
        }
        jumlahCabor++;
    } while (jumlahCabor < 4);

    System.out.println("Pendaftaran selesai");
    sc.close();
    }
}
