import java.util.Arrays;

public class more_less_07 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 11, 12, 19};
        int[] ans = getMoreAndLess(arr, 7, 7);
        System.out.println(Arrays.toString(ans));
    }

    static int[] getMoreAndLess(int[] arr, int n, int x) {
        int a[] = {0, 0};
        int less = 0;
        int more = 0;
        for (int i = 0; i < n; i++) {
            if (x >= arr[i]) {
                more++;
                if (x <= arr[i]) {
                    less++;
                }
            }
            a[0] = less;
            a[1] = more;
        }
        return a;
    }
}