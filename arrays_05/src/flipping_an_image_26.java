import java.util.Arrays;

public class flipping_an_image_26 {
    public static void main(String[] args) {
        int arr[][]={{1,1,0},{1,0,1},{0,0,0}};
        for(int i=0;i<arr.length;i++){
            arr[i]=reverse(arr[i]);
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    static int[] reverse(int arr[]){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;

            if(s!=e) {
                if (arr[s] == 1) {
                    arr[s] = 0;
                } else {
                    arr[s] = 1;
                }
                if (arr[e] == 1) {
                    arr[e] = 0;
                } else {
                    arr[e] = 1;
                }
            }
            else{
                if (arr[s] == 1) {
                    arr[s] = 0;
                } else {
                    arr[s] = 1;
                }
            }
            s++;
            e--;
        }
        return arr;
    }
}
