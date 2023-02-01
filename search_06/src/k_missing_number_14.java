public class k_missing_number_14 {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 7, 11};
        int count = 1;
        int false_count=0;
        while (true) {
            boolean x = binary(count, arr);
            if(x==false){
                false_count++;

            }
            if(false_count==5){
                System.exit(0);
            }
            count++;
        }
    }
    static boolean binary(int count,int arr[]){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(arr[mid]==count){
                return true;
            }
            else if(arr[mid]<count){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
            return false;
    }
}
