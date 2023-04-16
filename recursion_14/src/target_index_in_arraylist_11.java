import java.util.ArrayList;
import java.util.Arrays;

public class target_index_in_arraylist_11 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,5};
        int target=4;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(find(arr,target,list,0));
    }
public static ArrayList<Integer> find(int arr[], int target, ArrayList<Integer> list,int index){
        if(index==arr.length){
            return list;
        }

        if(target==arr[index]){
            list.add(index);
            return find(arr,target,list,index+1);
        }
        else{
            return find(arr,target,list,index+1);
        }
}
}
