package transpose;

class Multiplication{
    public static int[][] multiplication(int[][] first, int[][] second) {
        int row = first.length, column = first[0].length;
        int[][] multiplication = new int[row][column];

        System.out.println("\nmultiplication of Matrices:\n");
        for (int r = 0; r < row; r++)
            for (int c = 0; c < column; c++)
                multiplication[r][c] = first[r][c] * second[r][c];

        Print2dArray.print2dArray(multiplication);
        return multiplication;
    }
}
