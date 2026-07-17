class ConvertToArray {

    int[] toArray(int[][] grid) {
        int[] result = new int[grid.length * grid[0].length];
        int rows = grid.length;
        int cols = grid[0].length;
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                result[i* cols + j] = grid[i][j];
            }
        }
        return result;
    }

}