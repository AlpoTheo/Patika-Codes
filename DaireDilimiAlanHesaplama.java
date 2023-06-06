package Patika_Codes;

import java.util.Scanner;

public class DaireDilimiAlanHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Yarıçapı girin: ");
        double r = input.nextDouble();
        
        System.out.print("Merkez açının ölçüsünü girin: ");
        double alfa = input.nextDouble();
        
        double pi = 3.14;
        double alan = (pi * r * r * alfa) / 360.0;
        
        System.out.println("Daire diliminin alanı: " + alan);
    }
}

