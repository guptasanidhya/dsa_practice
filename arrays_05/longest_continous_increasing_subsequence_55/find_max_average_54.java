class find_max_average_54 {
    public static void main(String[] args) {
        int arr [] = {5};
        int k=1;
        double ans = findMaxAverage(arr,k);
        System.out.println(ans);
    }
    public static double findMaxAverage(int[] nums, int k) {
//        double curr = 0.0;
        int curr=0;
        for(int i=0;i<k;i++){
            curr=curr+nums[i];
        }
        int result=curr;
        for(int i=0;i<nums.length-k;i++){
            curr=curr+nums[i+k]-nums[i];
            result = Math.max(curr,result);
        }
        double ans=(double)result/k;
//        String s=String.format("%.5f",ans);
//        System.out.println(s);
        return ans;
    }
}