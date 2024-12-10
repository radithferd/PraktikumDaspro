package Praktikum12;

public class Pangkat18 {
    public static int pangkat(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            return x * pangkat(x, y - 1);
        }
    }

    public static int pangkatIterative(int x, int y) {
        int hasil = 1;

        for (int i = 1; i <= y; i++) {
            hasil = hasil * x;
        }

        return hasil;
    }

    public static String cetakDeret(int x, int y) {
        String deret = "";
        int hasil = 1;

        for (int i = 1; i <= y; i++) {
            hasil *= x;
            deret += x + "x"; 
        }
        deret += "1 = " + hasil;

        return deret;
    }

    public static void main(String[] args) {
        System.out.println(pangkat(6, 4));
        System.out.println(pangkatIterative(6, 4));
        System.out.println(cetakDeret(6, 4));
    }
}