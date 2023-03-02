public class pattern_07 {
    public static void main(String[] args) {
        int n=5;
        for(int row =1;row<=n;row++){

            for(int space=0;space<row-1;space++){
                System.out.print(" ");
            }

            int cols=n-row+1;
            for(int col=1;col<=cols;col++){
                System.out.print("*"+"");
            }
            System.out.println();
        }
    }
}
