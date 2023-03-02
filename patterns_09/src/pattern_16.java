public class pattern_16 {
    public static void main(String[] args) {
        int n=5;
        for(int row =1;row<=n;row++){
           for( int space=1;space<=2*n-(2*row);space++){
               System.out.print(" ");
           }
            int coef=1;
            int cols=row;
            for(int col=1;col<=cols;col++){
                System.out.print(coef+"   ");
                coef=coef*(row-col)/(col);
            }
            System.out.println();
        }
    }
}
