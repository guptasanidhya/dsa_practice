import java.util.Arrays;

public class merge_sorted_array_40 {
    public static void main(String[] args) {
        int nums1[]={4,5,6,0,0,0};
        int nums2[]={2,5,6};


        int j=nums2.length-1;
        int i=j;
        int k=nums1.length-1;

        while(j>=0){
            if(i>=0 && nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                k--;
                i--;
                System.out.println(Arrays.toString(nums1));
            }
            else{
                nums1[k]=nums2[j];
                k--;
                j--;
                System.out.println(Arrays.toString(nums1));
            }
            }
        }
        }

