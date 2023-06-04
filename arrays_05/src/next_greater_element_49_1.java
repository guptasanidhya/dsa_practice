import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class next_greater_element_49_1 {
    public static void main(String[] args) {

        int nums1[]={4,1,2};
        int nums2[]={1,2,3,4};

        int ans []= nextGreaterElement(nums1,nums2);
        System.out.println(Arrays.toString(ans));
    }
            public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
                int[] result = new int[nums1.length];
                Stack<Integer> stack=new Stack<>();
                Map<Integer, Integer> map = new HashMap<>();

                for(int num: nums2){
                    while(!stack.isEmpty() && num > stack.peek())
                        map.put(stack.pop(), num);
                    stack.push(num);
                }

                int i=0;
                for(int num : nums1)
                    result[i++] = map.getOrDefault(num, -1);
                return result;
            }
        }


