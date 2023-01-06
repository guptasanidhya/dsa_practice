import java.util.Arrays;

public class second_largest_01 {
    public static void main(String[] args) {
        int[] arr = {269 ,269 ,269 ,269 ,269 ,269 ,269,183};

       int ans=print_2_largest(arr);
        System.out.println(ans);
    }
    static int print_2_largest(int arr[]){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int max= arr[arr.length-1];
        for(int i =arr.length-2;i>=0 ;i--){
            if(max!=arr[i]){
                return arr[i];
            }
        }
        return -1;
    }
}
