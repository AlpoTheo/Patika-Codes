import java.util.Scanner;

public class metotprint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N sayısını girin: "); // N sayısını kullanıcıdan alıyoruz
        int n = input.nextInt();

        recursiveN(n);
        input.close(); // Scanner kapatılıyor.
    }
    

    public static void recursiveN(int n) { // Verilen kurala göre N sayısı için işlem gerçekleştiriliyor.
        System.out.print(n + " ");

        if (n <= 0) {
            return;
        } else {
            recursiveN(n - 5);
            System.out.print(n + " ");
        }
    }
}
