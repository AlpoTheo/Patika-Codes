import java.util.Scanner;

public class cinzodyagi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dogumyılı;

        System.out.print("Doğum yılınızı giriniz: ");
        dogumyılı = input.nextInt();

        dogumyılı = dogumyılı % 12;

        if (dogumyılı==0){
            System.out.println("Maymun");
        }
        else if (dogumyılı==1){
            System.out.println("Horoz");
        }
        else if (dogumyılı==2){
            System.out.println("Köpek");
        }
        else if (dogumyılı==3){
            System.out.println("Domuz");
        }
        else if (dogumyılı==4){
            System.out.println("Fare");
        }
        else if (dogumyılı==5){
            System.out.println("Öküz");
        }
        else if (dogumyılı==6){
            System.out.println("Kaplan");
        }
        else if (dogumyılı==7){
            System.out.println("Tavşan");
        }
        else if (dogumyılı==8){
            System.out.println("Ejderha");
        }
        else if (dogumyılı==9){
            System.out.println("Yılan");
        }
        else if (dogumyılı==10){
            System.out.println("At");
        }
        else if (dogumyılı==11){
            System.out.println("Koyun");
        }
    input.close();
    }
}