import java.util.Arrays;

public class remove_duplicates_inplace_36 {
    public static void main(String[] args) {
//        int arr[]={0,0,1,1,1,2,2,3,3,4};
        int arr[]={1,1,1};

     int a=removeDuplicates(arr);
        System.out.println(a);
    }
    public static int removeDuplicates(int[] nums) {
        int count=0;
        if(nums.length==1){
            return 1;
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<=nums[i+1]) {
                while (nums[i] == nums[i + 1]) {
                    count++;
                        rotate_range(i + 1, nums);
                }
            }   else{break;}

            System.out.println(Arrays.toString(nums));
        }
       for(int i=0;i<nums.length;i++){
           if(nums[i]>nums[i+1]){
               return i+1;
           }
       }
    return 0;
       }
    static void rotate_range(int range,int nums[]){
        int temp=Integer.MIN_VALUE+range;
        for(int i=range+1;i<nums.length;i++){
            nums[i-1]=nums[i];
        }
        nums[nums.length-1]=temp;
    }
}
