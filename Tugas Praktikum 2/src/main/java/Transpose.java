package transpose;

public class Transpose {

    // Method to transpose a matrix
    public static void transpose(int[][] data) {
        int row = data.length;
        int column = data[0].length;

        System.out.println("Elements of transpose matrix T are: ");
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                System.out.print(data[c][r] + "\t");
            }
            System.out.println();
        }
    }

    // Method to rotate a transposed matrix back to original
    public static void rotateToNormal(int[][] transposed) {
        int row = transposed.length;
        int column = transposed[0].length;

        System.out.println("Rotated back to normal matrix: ");
        for (int r = 0; r < column; r++) {
            for (int c = 0; c < row; c++) {
                System.out.print(transposed[c][r] + "\t");
            }
            System.out.println();
        }
    }
}
