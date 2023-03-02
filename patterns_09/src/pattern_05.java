public class pattern_05 {
    public static void main(String[] args) {
        int n=5;
        for(int row =1;row<=(2*n)-1;row++){
            int cols=0;
            if(row<=n){ cols=row;}
            else{cols=n-(row-n);}
            for(int col=1;col<=cols;col++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
