public class matrixelementSum {
    public static int elementSum(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int sum = 0;

        if( matrix == null || matrix.length == 0 ){
            return 0;
        }

        boolean[] not_in_cols = new boolean[cols];
        for(int i=0;i<rows;i++){
            for(int j = 0; j<cols;j++){
                if(not_in_cols[j]){
                    continue;
                }
                if(matrix[i][j] == 0){
                    not_in_cols[j] = true;
                }
                else{
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},
                {4,0,6},
                {7,8,9}};
        int result = elementSum(matrix);
        System.out.println(result);

    }
}
