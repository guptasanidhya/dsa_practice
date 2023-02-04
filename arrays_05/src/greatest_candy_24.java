public class greatest_candy_24 {
    public static void main(String[] args) {
        int arr[]={2,3,5,1,3};
        int candy_count=3;
        int n=arr.length;
        for(int i=0;i<n;i++){
            int check=arr[i]+candy_count;
            boolean ans=greatest(check,arr);
            System.out.print(ans);
        }
    }
    public static boolean greatest(int check,int[] arr){
        for (int j : arr) {
            if (check < j) {
                return false;
            }
        }
        return true;
    }
}
