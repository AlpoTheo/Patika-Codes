import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan number girdisi alınıyor
        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        // Mükemmel number olup olmadığını hesaplayan kısım toplamla döngüye alınarak bulunuyor.
        int toplam = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                toplam += i;
            }
        }

        // Ekrana mükemmel sayı olup olmadığı yazdırılıyor.
        if (toplam == number) {
            System.out.println(number + " Mükemmel sayıdır.");
        } else {
            System.out.println(number + " Mükemmel sayı değildir.");
        }
        // Scanner kapatılıyor.
        scanner.close();
    }
}
