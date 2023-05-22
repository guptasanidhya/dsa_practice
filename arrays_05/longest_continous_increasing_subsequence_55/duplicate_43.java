import java.util.HashMap;

public class duplicate_43 {
    public static void main(String[] args) {
        java.util.HashMap<Integer,Integer> hm = new HashMap<>();
//        int nums[]={1,0,1,1};
        int nums[]={1,2,3,1};
//        int nums[]={99,99};
//        int nums[]={1,2,3,1,2,3};
        int k=3;
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
//
                if(Math.abs(hm.get(nums[i])-i)<=k){
                    System.out.println(true);
                    return;
                }
                else{
                    hm.put(nums[i],i);
                }
            }
            else{
                hm.put(nums[i],i);
            }
        }
        System.out.println(false);
    }
}
