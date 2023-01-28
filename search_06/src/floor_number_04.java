public class floor_number_04 {
    public static void main(String[] args) {
        int arr[]={2,2,2,3};
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
                ans=arr[mid];
            }
            else if(x<arr[mid]){

                e=mid-1;
            }
            mid= s+(e-s)/2;
        }
        System.out.println(ans);
    }
}
