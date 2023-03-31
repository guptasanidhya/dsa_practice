import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

class intersection_two_arrays_03 {

    public static void main(String[] args) {
       int  nums1[]={1,2,2,1};
       int  nums2[]={2,2};
//       int  nums1[]={4,9,5};
//       int  nums2[]={9,4,9,8,4};
        int ans []= intersect(nums1,nums2);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        java.util.Map<Integer,Integer> hm= new HashMap<>();
        java.util.ArrayList<Integer> ls = new ArrayList<>();

        for(int i=0;i<nums1.length;i++){
            if(hm.containsKey(nums1[i])){
                hm.put(nums1[i],hm.get(nums1[i])+1);
            }
            else{
                hm.put(nums1[i],1);
            }
        }
        System.out.println(hm);
        for(int i=0;i<nums2.length;i++){
            if(hm.containsKey(nums2[i])){
                if(hm.get(nums2[i])>0){
                    hm.put(nums2[i],hm.get(nums2[i])-1);
                    ls.add(nums2[i]);
                }
            }
        }

        System.out.println(hm);



        int arr[]= new int[ls.size()];
        for(int i=0;i<ls.size();i++){
            arr[i]= ls.get(i);
        }
        return arr;
    }
}