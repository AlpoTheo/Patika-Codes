import java.util.Arrays;
import java.util.Scanner;

public class arraysort{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin boyutunu giriniz: "); // Dizi boyutu kullanıcıdan alınıyor.
        int n = input.nextInt();

        int[] dizi = new int[n];

        System.out.println("Dizinin elemanlarını giriniz:"); // Dizi elemanları kullanıcıdan alınıyor
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Elemanı: ");
            dizi[i] = input.nextInt();
        }
        

        Arrays.sort(dizi); // Sıralama fonksiyonu çalışıyor.

        System.out.print("Sıralama: ");

        for (int eleman : dizi) { // for döngüsü ile sıralama yapılıyor
            System.out.print(eleman + " ");
        }
    }
}
