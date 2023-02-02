import java.lang.reflect.Array;
import java.util.Arrays;

public class first_missing_positive_05 {
    public static void main(String[] args) {
        int arr[]={2,1};
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]>0 && arr[i]<=arr.length && arr[i]!=arr[correct]){
                swap(i,correct,arr);
            }
            else{i++;}
        }

        System.out.println(Arrays.toString(arr));

        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j+1){
                System.out.println(j+1);
                System.exit(0);
            }
        }

        System.out.println(arr.length+1);

    }

    static void swap(int i, int correct,int arr[]) {
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
}