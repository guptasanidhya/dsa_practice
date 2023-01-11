public class first_element_k_times_15 {
    public static void main(String[] args) {
        int k=2;
        int a[]={1, 7, 4, 3, 4, 8, 7};
        int n=a.length-1;
     int A=   firstElementKTime( a, n, k);
        System.out.println(A);
    }
    public static int firstElementKTime(int[] a, int n, int k) {
        int arr[]=new int[300];
        for(int i=0;i<n;i++){
            arr[a[i]]++;

            if(arr[a[i]]>=k){
                return a[i];
            }
        }
        return -1;
    }
}
