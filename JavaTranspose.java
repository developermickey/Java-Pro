public class JavaTranspose {
    public static void main(String[] args) {
        int r = 3, c = 3;
        int matrix[][] = {{2,3,4},{5,6,7},{10,13,15}};
        // Print matrix
        printMatrix(matrix);

        // create transpose matrix 
        int transpose[][] = new int[c][r];
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        printMatrix(transpose);
    }
    public static void printMatrix(int matrix[][]){
        System.out.println("This is matrix: ");
        for(int i = 0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
