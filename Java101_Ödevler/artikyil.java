import java.util.Scanner;

public class artikyil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;

        // Yıl bilgisi kullanıcıdan alınır ve tanımlanır.
        System.out.println("Yıl giriniz: ");
        year = input.nextInt();

        // Artık yıl olup olmadığı hesaplanır ve ekrana yazdırılır.
        if (year % 4 == 0 || year % 400 == 0){
            System.out.println(year + " bir artık yıldır.");
        }else {
            System.out.println(year + " bir artık yıl değildir.");
        }
        
        input.close();
    }
}
