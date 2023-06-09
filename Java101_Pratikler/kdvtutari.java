package Java101_Pratikler;

import java.util.Scanner;

public class kdvtutari {
    public static void main(String[] args) {
        double tutar,kdvOran, kdvTutar, kdvliTutar;
        Scanner input = new Scanner(System.in);
        System.out.println("Ücret Tutarını giriniz: ");
        tutar = input.nextDouble();
        
        if (tutar<1000 && tutar>0){
            kdvOran = 0.18;
        }
        else{
            kdvOran = 0.08;
        } 

        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("Kdv'siz tutar: "+tutar);
        System.out.println("KDV oranı: "+kdvOran);
        System.out.println("Kdv Tutarı: "+kdvTutar);
        System.out.println("Kdv'li Tutarı: "+kdvliTutar);
    }
}
