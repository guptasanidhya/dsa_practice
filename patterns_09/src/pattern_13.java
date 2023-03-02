public class pattern_13 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {

                for (int space = 1; space <= n - row; space++) {
                    System.out.print(" ");
                }
                int cols=0;
                    cols = (2 * row) - 1;


                for (int col = 1; col <= cols; col++) {
                    if(row<n){
                    if (col == 1 || col == (2 * row) - 1) {
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


