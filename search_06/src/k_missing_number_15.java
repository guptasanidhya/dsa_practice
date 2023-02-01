public class k_missing_number_15 {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 7, 11};
        int n=arr.length;
        int s=0;
        int e=n-1;
        int k=2;
        while(s<=e){
            int mid=s+(e-s)/2;
            int x=arr[mid]-mid;
            if(x>k){
            e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        System.out.println(s+k);
    }
}
