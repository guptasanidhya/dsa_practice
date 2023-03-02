public class pattern_04 {
    public static void main(String[] args) {
        int n=5;
        for(int row =1;row<=n;row++){
            int cols=row;
            for(int col=1;col<=cols;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
