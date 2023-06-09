package Java101_Ödevler;

import java.util.Scanner;

public class Vucutkutle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Değişkenlerin tanımlanıp kullanıcıdan istenildiği kısım.
        double boy, kilo;
        System.out.print("Lütfen boyunuzu metre cinsinden giriniz: (Örnek: 1,75) ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: (Örnek: 75) ");
        kilo = input.nextDouble();

        // İndeks hesaplamasının yapıldığı kısım.
        double indeks = (kilo / boy) /boy;
        System.out.println("Vücut kitle İndeksiniz: "+indeks);
        input.close();
    }
}
