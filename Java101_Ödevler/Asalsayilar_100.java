public class Asalsayilar_100 {
    public static void main(String[] args) {
        System.out.println("Asal Sayılar (1-100):");

        // 2 ile 100 arasında ilerler. 
        for (int i = 2; i <= 100; i++) {
            if (isAsal(i)) {
                System.out.print(i + " ");
            }
        }
    }
    // Bir sayının asal olup olmadığını kontrol eden metot.
    public static boolean isAsal(int number) {
        if (number <= 1) {
            return false;
        }
    // 2'den sayının kareköküne kadar olan sayılar üzerinde dönen number döngüsünün olduğu kısım
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Bölünebilir bir bölen bulunursa asal değildir.
            }
        }

        return true; // Bölünebilir bir bölen bulunmazsa asal sayıdır.
    }
}

