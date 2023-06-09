package Java101_Pratikler;

import java.util.Scanner;

public class ciftsayilar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int number;

        do {
            System.out.print("Bir sayı giriniz (Çıkmak için tek bir sayı giriniz): ");
            number = input.nextInt();

            if (number % 2 == 0 && number % 4 == 0) {
                sum += number;
            }
        } while (number % 2 != 1);

        System.out.println("Girilen çift ve 4'ün katları olan sayıların toplamı: " + sum);
    }
}
