package transpose;

class Devided{
    public static int[][] devided(int[][] first, int[][] second) {
        int row = first.length, column = first[0].length;
        int[][] devided = new int[row][column];

        System.out.println("\ndevided of Matrices:\n");
        for (int r = 0; r < row; r++)
            for (int c = 0; c < column; c++)
                devided[r][c] = first[r][c] / second[r][c];

        Print2dArray.print2dArray(devided);
        return devided;
    }
}
