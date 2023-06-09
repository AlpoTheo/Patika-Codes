package Java101_Pratikler ;

import java.util.Scanner;

public class uslusayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,son;
        System.out.print("Lütfen üssünü almak istediğiniz sayıyı giriniz:  ");
        a = input.nextInt();
        
        System.out.print("Üs olacak sayıyı giriniz: ");
        b = input.nextInt();

        son = 1;
        for (int i = 1; i<=b; i++){
            son *= a;
        }
        System.out.println("Sonuç: " + son);
        
    }
}
