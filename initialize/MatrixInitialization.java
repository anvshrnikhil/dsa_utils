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

    boolean[][] initialize(int rows, int cols, boolean defaultValue) {
        boolean[][] matrix = new boolean[rows][cols];
        for(int rowItr=0;rowItr<rows;rowItr++) {
            for(int colItr=0;colItr<cols;colItr++) {
                matrix[rowItr][colItr] = defaultValue;
            }
        }
        return matrix;
    }

    void print(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        for(int rowItr=0;rowItr<rows;rowItr++) {
            for(int colItr=0;colItr<cols;colItr++) {
                System.out.print( matrix[rowItr][colItr] + " " );
            }
            System.out.println();
        }
    }

    void print(boolean[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        for(int rowItr=0;rowItr<rows;rowItr++) {
            for(int colItr=0;colItr<cols;colItr++) {
                System.out.print( matrix[rowItr][colItr] + " " );
            }
            System.out.println();
        }
    }

    List<List<Boolean>> initialize(int rows, int cols, boolean defaultValue) {
        List<List<Boolean>> result = new ArrayList<>();
        for(int i=0;i<rows;i++) {
            List<Boolean> row = new ArrayList<>(cols); 
            for(int j=0;j<cols;j++) {
                row.add(false);
            }
            result.add(row);
        }
        return result;
    }

}