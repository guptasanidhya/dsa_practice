import java.util.ArrayList;

public class value_equal_to_index_02 {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 0, 0};
        ArrayList<Integer> ans= function1(arr);
        System.out.println(ans);
    }


    static ArrayList<Integer> function1(int[] arr){
        java.util.ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==i+1){
                list.add(i+1);
            }
        }
        return (list);
    }
}
