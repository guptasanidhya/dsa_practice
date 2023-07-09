import java.util.ArrayList;
import java.util.Arrays;

public class move_negative_values_04 {
    public static void main(String[] args) {
        int arr[]={1,-1,3,2,-7,-5,11,6};
        segregateElements(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void segregateElements(int arr[], int q)
    {
        java.util.ArrayList<Integer> p= new ArrayList<>();
        java.util.ArrayList<Integer> n= new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                p.add(arr[i]);
            }
            else{
                n.add(arr[i]);
            }
        }
        System.out.println(p);
        System.out.println(n);

        for(int i=0;i<p.size();i++){
            arr[i]=p.get(i);
        }
        System.out.println(Arrays.toString(arr));

        for(int i=0;i<n.size();i++){
            arr[p.size()+i]=n.get(i);
        }
    }
}
