package Java101_Pratikler;

import java.util.Scanner;

public class sayiyagorekuvvet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        System.out.println("4'ün kuvvetleri:");
        for (int i = 0; i <= sayi; i++) {
            int sonuc = (int) Math.pow(4, i);
            if (sonuc <= sayi) {
                System.out.println(sonuc);
            } else {
                break;
            }
        }

        System.out.println("5'in kuvvetleri:");
        for (int i = 0; i <= sayi; i++) {
            int sonuc = (int) Math.pow(5, i);
            if (sonuc <= sayi) {
                System.out.println(sonuc);
            } else {
                break;
            }
        }
    }
}
