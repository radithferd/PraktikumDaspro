package Praktikum05;

import java.util.Scanner;

public class PemilihanHariDenganIf18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String angka, dayType;

        System.out.print("Input number: ");
        angka = sc.nextLine();

        switch (angka.toLowerCase()) {
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
               dayType = "Weekday";
               break;
            case "6":
            case "7":
               dayType = "Weekend";
               break;
            default:
               dayType = "Invalid Number";         
        }
        System.out.println(dayType);
    }    
}