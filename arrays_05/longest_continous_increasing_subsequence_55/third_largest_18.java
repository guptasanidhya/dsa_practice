import java.util.Arrays;

public class third_largest_18 {
    public static void main(String[] args) {
       int  A[] = {2,5,5,5,5};
        Arrays.sort(A);

        if(A.length<3){
            System.out.println("chota h");
        }

        else {
            int count = 1;

            for (int i = A.length - 1; i > 0; i--) {
                if (A[i - 1] < A[i]) {
                    count++;
                }
                if(count==3){
                    System.out.println(A[i-1]);
                    System.exit(-1);
                }
            }
            if(count<3){
                System.out.println(-1);
            }
        }
    }
}
