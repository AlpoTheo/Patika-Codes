package Patika_Codes;

import java.util.Scanner;

public class sınıfort {
    
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik, sinir = 55;
        Scanner input = new Scanner(System.in);

        System.out.println("Not Ortalaması Hesaplama.");

        System.out.print("Matematik Notunuzu Giriniz : ");
        mat = input.nextInt();
        if (mat < 0 || mat > 100) {
            mat = 0;
        }

        System.out.print("Fizik Notunuzu Giriniz : ");
        fizik = input.nextInt();
        if (fizik < 0 || fizik > 100) {
            fizik = 0;
        }

        System.out.print("Türkçe Notunuzu Giriniz : ");
        turkce = input.nextInt();
        if (turkce < 0 || turkce > 100) {
            turkce = 0;
        }

        System.out.print("Kimya Notunuzu Giriniz : ");
        kimya = input.nextInt();
        if (kimya < 0 || kimya > 100) {
            kimya = 0;
        }

        System.out.print("Müzik Notunuzu Giriniz : ");
        muzik = input.nextInt();
        if (muzik < 0 || muzik > 100) {
            muzik = 0;
        }

        int notlarinToplami = mat + fizik + turkce + kimya + muzik;
        int dersSayisi = 0;

        if (mat > 0) {
            dersSayisi++;
        }
        if (fizik > 0) {
            dersSayisi++;
        }
        if (turkce > 0) {
            dersSayisi++;
        }
        if (kimya > 0) {
            dersSayisi++;
        }
        if (muzik > 0) {
            dersSayisi++;
        }

        double ortalama = (double) notlarinToplami / dersSayisi;

        System.out.println("Ortalama: " + ortalama);
    }
}
