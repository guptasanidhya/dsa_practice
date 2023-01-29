public class rotated_search_09 {
    public static void main(String[] args) {
        int arr[]={6,7,0,1,2,4,5};
// int arr[]={9,9,9,9,2,9};
//        int arr[]={7,1,1,2,2,4,4,6};
        int peak=mountain(arr);
        System.out.println(peak);
    }
    static int mountain(int arr[]){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(mid<e && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(s<mid && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[s]>=arr[mid]){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
    return -1;
    }}
