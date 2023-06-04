class rotating_array90_clock_30 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
    }
    public static void rotate(int[][] matrix) {

        transpose(matrix);

        reverse(matrix);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
  static  void transpose(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(i!=j && i<j){
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
        }
    }

   static void reverse(int[] [] matrix){
        for(int i=0;i<matrix.length;i++){
            matrix[i]=r(matrix[i]);
        }
    }

   static int[] r(int[] matrix){
        int s=0;
        int e=matrix.length-1;
        while(s<=e){
        int temp=matrix[s];
        matrix[s]=matrix[e];
        matrix[e]=temp;
        s++;
        e--;
        }
        return matrix;
    }
}