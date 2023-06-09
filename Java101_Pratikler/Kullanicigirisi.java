package Java101_Pratikler;

import java.util.Scanner;

public class Kullanicigirisi {
    public static void main(String[] args) {
        String userName, password, newPassword, reset;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adınız: ");
        userName = input.nextLine();

        System.out.print("Şifreniz: ");
        password = input.nextLine();

        if (password.equals("Java123") && userName.equals("patika")) {
            System.out.println("Giriş Yaptınız");
        } else {
            System.out.println("Şifreniz yanlış. Şifrenizi sıfırlamak istiyorsanız 1'i, istemiyorsanız 0'ı tuşlayınız.");
            reset = input.nextLine();
            password = "Java123";
            if (reset.equals("1")) {
                boolean passwordCreated = false; // Şifre oluşturulup oluşturulmadığını kontrol etmek için bir bayrak kullanalım.
                while (!passwordCreated) {
                    System.out.print("Yeni Şifrenizi Giriniz: ");
                    newPassword = input.nextLine();
                    if (newPassword.equals(password)) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka bir şifre giriniz.");
                    } else {
                        password = newPassword;
                        System.out.println("Şifre oluşturuldu");
                        passwordCreated = true; // Şifre oluşturulduğunda döngüyü sonlandırmak için bayrağı true yapalım.
                    }
                }
            } else {
                System.out.println("Şifre oluşturma işlemi iptal edildi");
            }
        }
    }
}
