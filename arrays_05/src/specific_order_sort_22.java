import java.util.Arrays;

public class specific_order_sort_22 {
    public static void main(String[] args) {
        long arr[]= {1, 2, 3, 5, 4, 7, 10};
        int n=arr.length;
        long temp[] = new long[n];
        for(int i=0;i<n;i++){
            temp[i]=arr[i];
        }
        Arrays.sort(temp);
        int count=0;
        for(int i=n-1;i>=0;i--){
            if(temp[i]%2!=0){
                arr[count]=temp[i];
                count++;
            }
        }
        for(int i=0;i<n;i++){
            if(temp[i]%2==0){
                arr[count]=temp[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
