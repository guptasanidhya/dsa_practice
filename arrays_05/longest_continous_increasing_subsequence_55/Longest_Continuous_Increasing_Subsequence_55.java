class Longest_Continuous_Increasing_Subsequence_55 {
    public static void main(String[] args) {
        int arr[]={1,3,5,4,7};
        int ans=findLengthOfLCIS(arr);
        System.out.println(ans);
    }
    public static int findLengthOfLCIS(int[] nums) {
        int max = Integer.MIN_VALUE;
        int count=1;
        int j=1;
        if(nums.length==1){
            return 1;
        }
        for(int i=0;i<nums.length-1;i++){
            if( nums[i]<nums[j]){
                j++;
                count++;
            }
            else{

                max= Math.max(count,max);
                count=1;
                j++;
            }
        }
        max= Math.max(count,max);
        return max;

    }
}