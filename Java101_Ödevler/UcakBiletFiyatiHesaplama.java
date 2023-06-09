package Java101_Ödevler;

import java.util.Scanner;

public class UcakBiletFiyatiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan verileri alıp tanımlıyoruz.
        System.out.print("Mesafeyi (KM) giriniz: ");
        int mesafe = input.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        int yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1: Tek Yön, 2: Gidiş-Dönüş): ");
        int yolculukTipi = input.nextInt();

        // Kullanıcıdan alınan veriler ile fiyatı hesaplayoruz
        if (mesafe > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {
            double birimFiyat = 0.10;
            double toplamFiyat = mesafe * birimFiyat;

            if (yas < 12) {
                toplamFiyat *= 0.5; // %50 indirim
            } else if (yas >= 12 && yas <= 24) {
                toplamFiyat *= 0.9; // %10 indirim
            } else if (yas >= 65) {
                toplamFiyat *= 0.7; // %30 indirim
            }

            if (yolculukTipi == 2) {
                toplamFiyat *= 0.8; // %20 indirim
            }

            System.out.println("Toplam Tutar: " + toplamFiyat);
        } else {
            System.out.println("Hatalı Veri Girdiniz!");
        }

        input.close();
    }
}
