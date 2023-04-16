public class unsorted_binary_search_12 {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,9,1,2,3};
        int target=4;
        int index=binary(arr,target,0,arr.length-1);
        System.out.println(index);
    }
    public static int binary(int arr[],int target,int s,int e){
        if(s>e){
            return -1;
        }
        int m = s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }

        if(arr[s]<=arr[m]){
            if(target>=arr[s] && target<=arr[m]){
                return binary(arr,target,s,m-1);
            }else{
                return binary(arr,target,m+1,e);
            }
        }

        if(target>=arr[m] && target <=arr[e]){
            return binary(arr,target,m+1,e);
        }
        return binary(arr,target,s,m-1);
    }
}
