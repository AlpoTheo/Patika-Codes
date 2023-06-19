import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Kullanıcıdan fibonacci serisinin eleman sayısı alınır.
        System.out.print("Fibonacci serisinin eleman sayısını girin: ");
        int count = input.nextInt();

        int num1 = 0;
        int num2 = 1;

        System.out.print("Fibonacci serisi: ");
        System.out.print(num1 + " " + num2);

        // Fibonnaci serisi döngü sayesinde hesaplanır.
        for (int i = 2; i < count; i++) {
            int sum = num1 + num2;
            System.out.print(" " + sum);
            num1 = num2;
            num2 = sum;
        }

        System.out.println();

        //Scanner kapatılır.
        input.close();
    }
}
