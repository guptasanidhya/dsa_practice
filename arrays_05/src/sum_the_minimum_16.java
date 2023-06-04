import java.sql.SQLOutput;
import java.util.*;

class sum_the_minimum_16 {

    public static void main(String[] args) {
//        int arr[] = {1,3,7,5,6};
        int arr[] = {1, 4, 7, 10};
        int N = arr.length;

        long ans = minimizeSum(N, arr);
        System.out.println(ans);
    }

    static long minimizeSum(int N, int arr[]) {
        long sum = 0;
        Arrays.sort(arr);
        if (arr.length == 1) {
            sum = arr[0];
            return sum;
        } else {
            for (int i = 1; i < N; i++) {
                if (arr[i - 1] <= arr[i]) {
                    int a = arr[i - 1];
                    int b = arr[i];
                    sum = sum + a + b;
                    arr[i - 1] = 0;
                    arr[i] = a + b;
                    Arrays.sort(arr);
                }

            }

        }
        return sum;
    }
}