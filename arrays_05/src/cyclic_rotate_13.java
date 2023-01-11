import java.util.Arrays;

public class cyclic_rotate_13 {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5};
        int n=arr.length-1;
        int temp=arr[n];
        for(int i=n;i>0;i--){
            arr[i]=arr[i-1];
            System.out.println(arr[(i)]+" "+arr[i-1]);
        }
        arr[0]=temp;
        System.out.println(Arrays.toString(arr));
    }

}
