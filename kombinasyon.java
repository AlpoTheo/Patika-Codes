package Patika_Codes;

import java.util.Scanner;

public class kombinasyon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n değerini girin: ");
        int n = scanner.nextInt();
        System.out.print("r değerini girin: ");
        int r = scanner.nextInt();

        int kombinasyon = hesaplaKombinasyon(n, r);
        System.out.println("C(" + n + ", " + r + ") = " + kombinasyon);
    }

    public static int hesaplaKombinasyon(int n, int r) {
        int faktoriyelN = faktoriyelHesapla(n);
        int faktoriyelR = faktoriyelHesapla(r);
        int faktoriyelNMinusR = faktoriyelHesapla(n - r);

        int kombinasyon = faktoriyelN / (faktoriyelR * faktoriyelNMinusR);
        return kombinasyon;
    }

    public static int faktoriyelHesapla(int sayi) {
        int faktoriyel = 1;
        for (int i = 1; i <= sayi; i++) {
            faktoriyel *= i;
        }
        return faktoriyel;
    }
}
