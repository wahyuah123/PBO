package transpose;

class Substraction{
    public static int[][] substraction(int[][] first, int[][] second) {
        int row = first.length, column = first[0].length;
        int[][] substraction = new int[row][column];

        System.out.println("\nSubstraction of Matrices:\n");
        for (int r = 0; r < row; r++)
            for (int c = 0; c < column; c++)
                substraction[r][c] = first[r][c] - second[r][c];

        Print2dArray.print2dArray(substraction);
        return substraction;
    }
}
