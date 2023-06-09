package Java101_Ödevler;
import java.util.Scanner;

public class UcakBiletFiyatiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan istenilen bilgiler alınır ve tanımlanır.
        System.out.print("Mesafeyi (KM) giriniz: ");
        int mesafe = input.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        int yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1: Tek Yön, 2: Gidiş-Dönüş): ");
        int yolculukTipi = input.nextInt();

        // Tutarın hesaplandığı kısım.
        if (mesafe > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {
            double birimFiyat = 0.10;
            double toplamTutar = mesafe * birimFiyat;
        
            // İndirim oranının uygulandığı kısım.
            double indirimOrani = 0;
            if (yas < 12) {
                indirimOrani += 0.5; // %50 indirim
            } else if (yas >= 12 && yas <= 24) {
                indirimOrani += 0.1; // %10 indirim
            } else if (yas >= 65) {
                indirimOrani += 0.3; // %30 indirim
            }

            if (yolculukTipi == 2) {
                indirimOrani += 0.2; // %20 indirim
            }
            // İndirim tutarının hesaplandığı kısım.
            double indirimliTutar = toplamTutar - (toplamTutar * indirimOrani);
            double toplamTutarGidisDonus = indirimliTutar;
            if (yolculukTipi == 2) {
                toplamTutarGidisDonus *= 2;
            }

            System.out.println("Toplam Tutar = " + toplamTutarGidisDonus + " TL");
        } else {
            System.out.println("Hatalı Veri Girdiniz!");
        }

        input.close();
    }
}
