import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class intersection_two_arrays_02 {
    public static void main(String[] args) {
        int nums1[]={4,9,5};
        int nums2[]={9,4,9,8,4};

        int ans[]= intersection(nums1,nums2);
//        System.out.println(Arrays.toString(ans));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        java.util.Set<Integer> s = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            s.add(nums1[i]);
        }
        java.util.ArrayList<Integer> ls = new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            if(s.contains(nums2[i])){
                ls.add(nums2[i]);
                s.remove(nums2[i]);
            }
        }

//        System.out.println(ls);
        int arr[]= new int[ls.size()];
        for(int i=0;i<ls.size();i++){
            arr[i]= ls.get(i);
        }
        return arr;
    }
}
