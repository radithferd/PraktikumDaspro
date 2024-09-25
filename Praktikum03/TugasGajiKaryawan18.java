package Praktikum03;
import java.sql.SQLOutput;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
public class TugasGajiKaryawan18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int jamkerja, upahperjam, totalgajikotor;
        double gajidenganbonus, totalgajibersih;

        upahperjam = 10000;

        System.out.println("Masukkan jumlah jam kerja anda: ");
        jamkerja = sc.nextInt();
        totalgajikotor = upahperjam * jamkerja;

        System.out.println("Berikut adalah jumlah gaji kotor: " + totalgajikotor);
        gajidenganbonus = totalgajikotor * 0.1 + totalgajikotor;

        System.out.println("Berikut adalah jumlah gaji dengan bonus: " + gajidenganbonus);
        totalgajibersih = gajidenganbonus - 0.05 * gajidenganbonus;
        
        System.out.println("Berikut total gaji bersih anda: " + totalgajibersih);
    }
}