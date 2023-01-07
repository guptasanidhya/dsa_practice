import java.util.Arrays;

public class find_index_05 {
    public static void main(String[] args) {
        int a[] = {6, 5, 4, 3, 1, 2 };
        int arr[]=findIndex(a,6,5);
        System.out.println(Arrays.toString(arr));
        }

    static int[] findIndex(int a[], int N, int key)
    {
        int[] arr={-1,-1};
        int count_forward=0;
        int count_reverse=0;
        for(int i=0;i<N;i++){
            if(a[i] == key && count_forward==0){
                arr[0]=i;
                count_forward++;

            }
            if(a[a.length-1-i]==key && count_reverse==0){
                arr[1]=a.length-1-i;
                count_reverse++;

            }
        }
        return arr;
    }
}