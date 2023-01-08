import java.util.ArrayList;
import java.util.Collections;

public class only_element_08 {
    public static void main(String[] args) {
        long arr[] = {1};
        java.util.ArrayList<Long> list = new ArrayList<>();
        for(int i = 0;i<arr.length;i++)
        {
            list.add(arr[i]);
        }
        Collections.sort(list);
            int x=(0+ list.size()-1)/2;
        System.out.println(list.get(x));
    }
}
