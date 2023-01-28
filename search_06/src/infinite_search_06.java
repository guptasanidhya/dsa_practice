//by me complex
public class infinite_search_06 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,29,1000,2000,3000,4000,5000,6000,10000,12000};
        int s=0;
        int e=1;
        int target=3000;
        int ans=-1;
        while(true) {
            if(target>arr[e]) {
                s = e + 1;
                e = s * s;
            }
            else {
                ans=binary(arr,s,e,target);
                System.out.println(ans);
                break;
            }
        }

    }
    static int binary(int arr[],int s,int e,int target){
        while(s<=e){
            int mid =(s+e)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return -1;
    }
}
