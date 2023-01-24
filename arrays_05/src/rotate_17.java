import java.util.Arrays;

public class rotate_17 {
    public static void main(String[] args) {
        int n=2;
        int arr[]={1,2,3,4};
        for(int i=0;i<n;i++){
            rotate(arr);
        }


        }
    static void rotate(int arr[]){
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
        arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;

    }
}
