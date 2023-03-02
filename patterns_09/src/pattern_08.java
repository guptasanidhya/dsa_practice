public class pattern_08 {
    public static void main(String[] args) {
        int n=5;
        for(int row =1;row<=n;row++){
            for(int space=1;space<=n-row;space++){
                System.out.print(" ");
            }
            int cols=2*row-1;
            for(int col=1;col<=cols;col++){
                System.out.print("*"+"");
            }
            System.out.println();
        }
    }
}
