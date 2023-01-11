import java.util.Arrays;

public class unique_array_12 {
    public static void main(String[] args) {
        int arr[] = {0, 0, 2,3};
        int N=arr.length;

        long ans=minIncrements(arr,N);
        System.out.println(ans);
    }
   static public long minIncrements(int[] arr, int N) {

       Arrays.sort(arr);
       long count=0;
       for (int i = 1; i < N; i++) {

           if(arr[i-1]>=arr[i]){

               count=count+arr[i-1]-arr[i]+1;
               arr[i]=arr[i-1]+1;

           }

       }
       return count;
   }}

