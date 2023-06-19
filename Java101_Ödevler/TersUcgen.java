import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Basamak sayısı kullanıcıdan alınıyor.
        System.out.print("Basamak Sayısı: ");
        int Digits = input.nextInt();

        int star = Digits * 2 - 1;
        int space = 0;

        //  Alınan basamak sayısına göre for döngüleriyle "*" konularak ters üçgen çizdiriliyor.
        for (int i = 1; i <= Digits; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= star; k++) {
                System.out.print("*");
            }

            System.out.println();

            star -= 2;
            space++;
        }
        // Scanner kapatılıyor.
        input.close();
    }
}
