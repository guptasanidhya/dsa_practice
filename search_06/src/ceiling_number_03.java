import java.sql.SQLOutput;

public class ceiling_number_03 {
    public static void main(String[] args) {
        int arr[]={2,2,2,3,15};
        int n=arr.length;
        int s=0;
        int e=n-1;
        int x=15;
        int ans=-1;
        int mid= s+(e-s)/2;
        while(s<=e){

            if(arr[mid]==x){
                System.out.println(x);
                break;
            }
            else if(x>arr[mid]){
                s=mid+1;
            }
            else if(x<arr[mid]){
                ans=arr[mid];
                e=mid-1;
            }
            mid= s+(e-s)/2;
        }
        System.out.println(ans);
    }
}
