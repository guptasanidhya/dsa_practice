import java.util.Arrays;

public class remove_duplicate_inplace_key_39 {
    public static void main(String[] args) {
        int k = 2;
        int arr[] = {3,2,2,3};
        int s = 0;
        int e = 0;
        int i = 0;
        while (i < arr.length){
            if (arr[s] != k) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e++;
                System.out.println(Arrays.toString(arr));
            } else {
                s++;
            }
        i++;
    }
        System.out.println(e);
        }

    }

