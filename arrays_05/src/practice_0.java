import java.util.ArrayList;
import java.util.Arrays;

public class practice_0 {
    public static void main(String[] args) {
        int[] arr = {10,10,10,10,10,10};

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]<=arr[j]){

                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
//        System.out.println(Arrays.toString(arr));
        int max= arr[arr.length-1];
        for(int i =arr.length-2;i>0 ;i--){
            if(max!=arr[i]){
                System.out.println("Second Largest "+arr[i]);
                break;
            }
            }
        System.out.println("No Second Largest");
        }

    }

