//kadane algorithm - max subarray,start and end index of array ,length of subarray
import java.util.ArrayList;

public class maximum_subarray_33 {
    public static void main(String[] args) {
        java.util.ArrayList<Integer> ls = new ArrayList<>();
//        int nums[]={-2,1,-3,4,-1,2,1,-5,4};
        int nums[] = {5, 4, -1, 7, 8};
        int Max = nums[0];
        int sum = nums[0];
        int start=0;
        int end=0;
        for (int i = 1; i < nums.length; i++) {
            sum = sum + nums[i];

            int oldmax=Max;
            Max = Math.max(sum, Max);
            if (sum < 0) {
                sum = 0;
                start=i+1;

            }


            if(oldmax-Max!=0){
                end=i;
            }

        }
        System.out.println(start+" "+end);
        System.out.println(Max);
    }
}
