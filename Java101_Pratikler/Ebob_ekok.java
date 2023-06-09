package Java101_Pratikler;

import java.util.Scanner;

public class Ebob_ekok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı girin: ");
        int num1 = input.nextInt();
        System.out.print("İkinci sayıyı girin: ");
        int num2 = input.nextInt();

        int ebob = 1;
        int ekok = (num1 * num2);

        int smaller = Math.min(num1, num2);
        int greater = Math.max(num1, num2);

        while (smaller != 0) {
            int temp = smaller;
            smaller = greater % smaller;
            greater = temp;
        }

        ebob = greater;
        ekok /= ebob;

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }
}
