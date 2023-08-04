import java.util.Arrays;

public class sort_zero_last_61 {
    public static void main(String[] args) {
        int arr[]= {1,2,3,43,0,1,2,3,0};

        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                count++;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
