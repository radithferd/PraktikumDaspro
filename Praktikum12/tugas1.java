package Praktikum12;
import java.util.Scanner;
public class tugas1 {
    public static void fbcIteratif(int jmlBilangan) {
        int angka1 = 1, angka2 = 1;

        System.out.print("Deret Fibonacci (Iteratif): ");
        if (jmlBilangan >= 1) {
            System.out.print(angka1); 
        }
        if (jmlBilangan >= 2) {
            System.out.print(", " + angka2); 
        }

        for (int i = 3; i <= jmlBilangan; i++) {
            int angkaBerikutnya = angka1 + angka2;
            System.out.print(", " + angkaBerikutnya);

            angka1 = angka2;
            angka2 = angkaBerikutnya;
        }
        System.out.println();
    }

    public static int fbcRekursif(int n) {
        int bilangan = 0;
        if (n == 1 || n == 2) {
            return bilangan = 1; 
        }
        return bilangan = (fbcRekursif(n - 1) + fbcRekursif(n - 2)); 
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah bilangan fibonacci yang ingin ditampilkan: ");
        int jmlBilangan = sc.nextInt();

        if (jmlBilangan <= 0) {
            System.out.println("Jumlah bilangan harus lebih dari 0.");
            return;
        }

        fbcIteratif(jmlBilangan);

        System.out.print("Deret Fibonacci (Rekursif): ");
        for (int i = 1; i <= jmlBilangan; i++) {
            System.out.print(fbcRekursif(i)); 
            if (i != jmlBilangan) {
                System.out.print(", ");
            }
        }
    }
}