public class token {
    
    public static void main(String[] args) {
        int matrix[][] = {
            {0,1,1},
            {0,2,2},
            
            {1,1,5},
            {1,2,7}
        };
        int expiryLimit = 4;
        int maxValue_row = findMaxValueInColumn(matrix, 1);
        int maxValue_column = findMaxValueInColumn(matrix, 2);
        int column =expiryLimit +maxValue_column;
        System.out.println(maxValue_row);
        System.out.println(column);
        int [][] new_matrix = new int[maxValue_row][column];
        for (int i =0; i < matrix.length; i++){
            
            }
        }
       
    
    
        public static int findMaxValueInColumn(int[][] matrix, int columnIndex) {
            int maxValue = Integer.MIN_VALUE;
    
            for (int i = 0; i < matrix.length; i++) {
                maxValue = Math.max(maxValue, matrix[i][columnIndex]);
            }
        return maxValue;

        }
}

