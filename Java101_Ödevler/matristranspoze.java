public class matristranspoze {
    public static void main(String[] args) {
        int[][] matrix = {
            {2, 3, 4},
            {5, 6, 4}
        };
        
        int[][] transposedMatrix = transpose(matrix);
        
        System.out.println("Matris:"); // Kullanıcıdan matris alınır
        printMatrix(matrix);
        
        System.out.println("Transpoze:"); // Transpoze işlenir.
        printMatrix(transposedMatrix);
    }
    
    public static int[][] transpose(int[][] matrix) { // Matris transpozu kısmının yapıldığı yer
        int rows = matrix.length;
        int columns = matrix[0].length;
        
        int[][] transposedMatrix = new int[columns][rows];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        
        return transposedMatrix;
    }
    
    public static void printMatrix(int[][] matrix) { // Matrisin ekrana yazıldığı kısım
        int rows = matrix.length;
        int columns = matrix[0].length;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + "    ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
