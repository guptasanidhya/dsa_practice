import java.util.ArrayList;
import java.util.Arrays;

public class perfect_array_06 {
    public static void main(String[] args) {
        long a[] = {2, 8, 7, 1, 5};
        long arr[]= new long[a.length-2];
        Arrays.sort(a);
        for(int i=0;i< a.length-2;i++){
            arr[i]=a[i];
        }
        System.out.println(Arrays.toString(arr));

    }

    }

