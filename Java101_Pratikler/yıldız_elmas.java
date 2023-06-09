package Java101_Pratikler;

import java.util.Scanner;

public class yıldız_elmas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Elmasın yüksekliğini girin: ");
        int height = input.nextInt();

        int space = height - 1;
        int star = 1;

        // Yukarıdaki kısım
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < star; k++) {
                System.out.print("*");
            }
            System.out.println();
            space--;
            star += 2;
        }

        space = 1;
        star = height * 2 - 3;

        // Aşağıdaki kısım
        for (int i = 0; i < height - 1; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < star; k++) {
                System.out.print("*");
            }
            System.out.println();
            space++;
            star -= 2;
        }
    }
}
