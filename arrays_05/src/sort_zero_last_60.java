import java.util.Arrays;

public class sort_zero_last_60 {
    public static void main(String[] args) {
        int arr []= {1,2,0,0,0,0,0,0,1,1};
        zero(arr);

    }
    public static void zero(int arr[]){
        int i=0;
        int j=0;
        while(i<arr.length && j <arr.length){
            if(arr[i]!=0 && arr[j]!=0){
                i++;
                j++;
            }
            else if(arr[i]!=0&& arr[j]==0){
                i++;
            }
            else if(arr[i]==0 && arr[j]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            else if(arr[i]==0 && arr[j]==0){
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
