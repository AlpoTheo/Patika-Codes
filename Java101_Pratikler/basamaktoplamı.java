package Java101_Pratikler;
import java.util.Scanner;

public class basamaktoplamı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = input.nextInt();

        int toplam = 0;
        int tempSayi = sayi;

        while (tempSayi != 0) {
            int basamak = tempSayi % 10;
            toplam += basamak;
            tempSayi /= 10;
        }

        System.out.println("Basamakların toplamı: " + toplam);
    }
}

