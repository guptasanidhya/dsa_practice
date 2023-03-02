public class pattern_12 {
    public static void main(String[] args) {
        int n=5;
        for(int row =1;row<=2*n;row++){
            int s=0;
        if(row<=n){s=row-1;}
        else{s=(2*n)-row;}
            for(int space=1;space<=s;space++){
                System.out.print(" ");
            }

            int cols=0;
            if(row<=n){cols=n-row+1;}
            else{cols=row-n;}
            for(int col=1;col<=cols;col++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
