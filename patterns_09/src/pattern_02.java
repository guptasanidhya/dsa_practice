public class pattern_02 {
    public static void main(String[] args) {
        int n=5;
        for(int row =1;row<=n;row++){
            int cols=row;
            for(int col=1;col<=cols;col++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
