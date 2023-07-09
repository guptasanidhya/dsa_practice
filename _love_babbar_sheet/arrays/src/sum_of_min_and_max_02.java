public class sum_of_min_and_max_02 {
public static int sumOfMaxMin(int[] arr, int n) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
        min=Math.min(min,arr[i]);
        max=Math.max(max,arr[i]);
        }
        return max+min;
        }
        }