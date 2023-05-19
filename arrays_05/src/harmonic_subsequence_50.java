import java.util.*;
class harmonic_subsequence_50 {
    public static void main(String[] args) {
//        int arr[]={-3,-1,-1,-1,-3,-2};
        int arr[]={1,3,1,3,2,3,0,3,0,1,2,2,2,-1,2,1,0,0,2,2,3,-3,1,2,2,0,1,3,1};
        int ans=findLHS(arr);
        System.out.println(ans);
    }
    public static int findLHS(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        java.util.Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
                mp.put(nums[i],mp.get(nums[i])+1);
            }
            else{
                mp.put(nums[i],1);
            }
        }
        System.out.println(mp);
        java.util.Set<Integer> s= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }
        System.out.println(s);
        Object[] ans = s.toArray();
        Arrays.sort(ans);
        System.out.println(Arrays.toString(ans));
        int max=Integer.MIN_VALUE;
        for(int i=0;i<ans.length-1;i++){
        int one =(int)ans[i];
        int two =(int)ans[i+1];
            System.out.println("one="+one +"  "+"two="+two);
        if(Math.abs(two-one)==1){
            int sum=mp.get(two)+mp.get(one);
//            System.out.println(sum);
        if(sum>max){
            max=sum;
        }
        }
        }
        return max;
    }
}