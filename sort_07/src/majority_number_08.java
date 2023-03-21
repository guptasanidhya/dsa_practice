import java.util.HashMap;

public class majority_number_08 {
    public static void main(String[] args) {
//        int nums[] = {3, 2, 3};
        int nums[] = {2,2,1,1,1,2,2};
        java.util.HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                hm.put(nums[i], hm.get(nums[i]) + 1);
                if(hm.get(nums[i])>(nums.length/2)){
                    System.out.println(nums[i]);
                    break;
                }
            } else {
                hm.put(nums[i], 1);
            }
        }
        System.out.println(hm);
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(hm.get(nums[i])>(nums.length/2)){
                System.out.println(nums[i]);
                break;
            }
        }
    }
}
