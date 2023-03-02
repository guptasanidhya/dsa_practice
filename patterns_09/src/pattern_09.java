public class pattern_09 {
    public static void main(String[] args) {
        int n=5;
        for(int row =0;row<n;row++){
            for(int space=1;space<=row;space++){
                System.out.print(" ");
            }
            int cols=(2*n)-1-(2*row);
            for(int col=1;col<=cols;col++){
                System.out.print("*"+"");
            }
            System.out.println();
        }
    }
}
