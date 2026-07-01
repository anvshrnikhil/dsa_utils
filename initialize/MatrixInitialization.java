public class MatrixInitialization {


    int[][] initialize(int rows, int cols, int defaultValue) {
        int[][] matrix = new int[rows][cols];
        for(int rowItr=0;rowItr<rows;rowItr++) {
            for(int colItr=0;colItr<cols;colItr++) {
                matrix[rowItr][colItr] = defaultValue;
            }
        }
        return matrix;
    }

}