import java.lang.reflect.Array;
import java.util.Arrays;

public class missing_number_01 {
    public static void main(String[] args) {
        int arr[]={0,1,2,3,4,5,6,7,9};
        int n=arr.length;
        int i=0;
        while(i<arr.length){
            int correct=arr[i];
                if(arr[i]<arr.length && arr[i]!=arr[correct]){
                    swap(i,correct,arr);
                }
                else{i++;}
            }

        System.out.println(Arrays.toString(arr));
        i=0;
        while(i<n){
            if(arr[i]!=i && i<n){
                System.out.println(i);
                System.exit(0);
            }
            else{
                i++;
            }
            }
        System.out.println(n);

        }

     static void swap(int i, int correct,int arr[]) {
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
}
