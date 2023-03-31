import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class distinct_3rd_largest_45 {
    public static void main(String[] args) {
        int nums[]= {1,1,2};
        int ans = thirdMax(nums);
        System.out.println(ans);
    }
    public static int thirdMax(int[] nums) {
    java.util.Set<Integer> s = new HashSet<>();
    for(int i=0;i<nums.length;i++){
        s.add(nums[i]);
    }

        java.util.ArrayList<Integer> ls = new ArrayList<>(s);
        Collections.sort(ls);

        if(ls.size()>=3){
            return ls.get(ls.size()-3);
        }
        else{
            return ls.get(ls.size()-1);
        }
    }
}
