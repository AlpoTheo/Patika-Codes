package Java101_Pratikler;
import java.util.Scanner;

public class Recursivefibonacci {
    static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
