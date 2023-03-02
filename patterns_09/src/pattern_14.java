public class pattern_14 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {

                for (int space = 1; space <= n-(n - row+1); space++) {
                    System.out.print(" ");
                }
                int cols=0;
                    cols = (2*n)-1 - row + 1;


                for (int col = 1; col <= cols; col++) {
                    if(row!=1){
                    if (col == 1 || col == cols-row+1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                    else{
                        System.out.print("*");

                    }
                }
            System.out.println();
            }

        }
        }


