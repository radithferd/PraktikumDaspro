package Praktikum10;

import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] hasilSurvei = new double[10][6];

        System.out.println("Masukkan hasil survei (nilai 1-5):");
        
        for (int i = 0; i < 10; i++) {
            double totalPerResponden = 0;
            System.out.println("Responden ke-" + (i + 1));

            for (int j = 0; j < 6; j++) {
                System.out.print("Nilai untuk Pertanyaan ke-" + (j + 1) + ": ");
                hasilSurvei[i][j] = sc.nextDouble();
                totalPerResponden += hasilSurvei[i][j];
            }

            double rataRataResponden = totalPerResponden / 6;
            System.out.println("Nilai rata-rata responden " + (i + 1) + ": " + rataRataResponden);
        }

        System.out.println("\nRata-rata nilai per pertanyaan:");
        for (int j = 0; j < 6; j++) {
            double totalPerPertanyaan = 0;

            for (int i = 0; i < 10; i++) {
                totalPerPertanyaan += hasilSurvei[i][j];
            }

            double rataRataPertanyaan = totalPerPertanyaan / 10;
            System.out.println("Nilai rata-rata Pertanyaan ke-" + (j + 1) + ": " + rataRataPertanyaan);
        }

        double totalKeseluruhan = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                totalKeseluruhan += hasilSurvei[i][j];
            }
        }

        double rataRataKeseluruhan = totalKeseluruhan / (10 * 6);
        System.out.println("\nRata-rata nilai keseluruhan: " + rataRataKeseluruhan);

    }
}