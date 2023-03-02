public class pattern_15 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= (2*n)-1 ;row++) {
                int s=0;
                if(row<=n){s=n-row;}
                else{s=row-n;}
                for (int space = 1; space <=s; space++) {
                    System.out.print(" ");
                }
                int cols=0;
                    if(row<=n){cols = (2 * row) - 1;}
                    else{int r=(2*n)-row;
                        cols=(2*r)-1;
                    }


                for (int col = 1; col <= cols; col++) {
                    if (col == 1 || col == cols) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            System.out.println();
                }

            }

        }



