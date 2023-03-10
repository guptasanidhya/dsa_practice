import java.util.Arrays;

public class remove_duplicates_inplace_37 {
    public static void main(String[] args) {
//            int nums[]={0,0,1,1,1,2,2,3,3,4};
            int nums[]={1,1,2,2,3,3};
            int ans=removeDuplicates(nums);
        System.out.println(ans);
    }

        public static int removeDuplicates(int[] nums) {
            int j=1;
            for(int i=0;i<nums.length-1;i++){
                if(nums[i]<nums[i+1]){
                    nums[j] = nums[i+1];
                    j=j+1;
                }
                System.out.println(Arrays.toString(nums));
            }
//            System.out.println(Arrays.toString(nums));
            return j;

        }
    }

