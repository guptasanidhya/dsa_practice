public class mountain_peak_07 {
    public static void main(String[] args) {
        int arr[]={0,1,2,4,2,1};
        int target=3;
        int peak=findPeakElement(arr);
        System.out.println(peak);
        int ans=binary(arr,0,peak,target,true);
        if(ans==-1){
            ans=binary(arr,peak+1,arr.length-1,target,false);
        }
        System.out.println(ans);
    }
    public static int binary(int arr[],int s,int e,int target,boolean isAsc){
        if(isAsc){
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return -1;}
        else{
            while(s<=e){
                int mid=s+(e-s)/2;
                if(arr[mid]==target){
                    return mid;
                }
                else if(arr[mid]>target){
                    s=mid+1;
                }
                else{
                    e=mid-1;
                }
            }
            return -1;
        }
    }
    public static int findPeakElement(int[] nums) {
        int s=0;
        int e=nums.length-1;
        while(s<e){
            int mid=s+(e-s)/2;
            if(nums[mid]>nums[mid+1]){
                e=mid;
            }
            else{
                s=mid+1;
            }
        }
        return e;
    }
}
