package Java101_Ödevler;

import java.util.Scanner;

public class Manavkasa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meyveler kg fiyatlarına göre tanımlandı.
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.00;
        double toplam;

        // Kullanıcıdan kaç kg alındığına dair bilgi alınıp tanımlanıyor.
        System.out.println("Kaç kilo Armut aldınız: ");
        double armutKg = input.nextDouble();
        System.out.println("Kaç kilo Elma aldınız: ");
        double elmaKg = input.nextDouble();
        System.out.println("Kaç kilo Domates aldınız: ");
        double domatesKg = input.nextDouble();
        System.out.println("Kaç kilo Muz aldınız: ");
        double muzkg = input.nextDouble();
        System.out.println("Kaç kilo Patlican aldınız: ");
        double patlicankg = input.nextDouble();
        
        // Toplam hesabı yapılıp ekrana yazdırılıyor.
        toplam = (armut * armutKg) + (elma * elmaKg) + (domates * domatesKg) + (muz * muzkg) + (patlican * patlicankg);
        System.out.println("Toplam Tutar: "+toplam +" TL");
        input.close();
    }
}
