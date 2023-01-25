import java.util.Arrays;

public class greatest_right_side {
    public static void main(String[] args) {
        int arr[] = {16, 17, 4, 3, 5, 2};
        System.out.println(Arrays.toString(arr));
        int n = arr.length - 1;
        int count = 0;
        for (int i = 0; i <= n -1; i++) {
            count++;
            int g = greatest(arr, n, count);
            arr[i] = g;
        }
        arr[n]=-1;
//        System.out.println(Arrays.toString(arr));

    }

    static int greatest(int arr[], int n, int count) {
       int Max=-1;
//        System.out.println("hello");
        for (int i = count; i <=n ; i++) {
            Max = Math.max(Max, arr[i]);
        }
//        System.out.println(Max);
        return Max;
    }
}