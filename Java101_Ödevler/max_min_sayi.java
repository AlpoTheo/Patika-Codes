import java.util.Scanner;

public class max_min_sayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan kaç sayi bilgisi alınır.
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = input.nextInt();

        // max ve min değerleri en küçük ve en büyük değerler olarak alınıp işlemde hata çıkmaması için tanımlanır.
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // Kaçıncı sayı değeri döndürülür ve if kısımlarında max ve min sayı hesaplanır.
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            int sayi = input.nextInt();

            if (sayi > max) {
                max = sayi;
            }

            if (sayi < min) {
                min = sayi;
            }
        }
        // En büyük ve en küçük sayı ekrana yazdırılır.
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    input.close();
    }
}
