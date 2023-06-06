package Patika_Codes;

import java.util.Scanner;

public class ucgenalan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b,c;
        System.out.print("Lutfen üçgenin 1. kenarını Giriniz : ");
        a = input.nextDouble();

        System.out.print("Lutfen üçgenin 2. kenarını Giriniz : ");
        b = input.nextDouble();

        System.out.print("Lutfen üçgenin 3. kenarını Giriniz : ");
        c = input.nextDouble();

        double u = (a + b + c) / 2.0;
        double Alan = Math.sqrt(u*(u-a)*(u-b)*(u-c)); 

        System.out.println("Üçgenin Alanı: "+Alan);
    }
}
