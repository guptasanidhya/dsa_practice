import java.util.Arrays;

public class arrays_left_rotate_21 {
    public static void main(String[] args) {
       long arr[]={ 1,2,3,4,5,6,7};
       int n=arr.length;
       int k=10;
       int start=k%n;
        long a[]=new long[n];
        for(int i=0;i<n;i++){
            a[i]=arr[i];
        }
        for(int i=0;i<n;i++){
            arr[i]=a[(i+start)%n];
        }
        System.out.println(Arrays.toString(arr));
    }
}
