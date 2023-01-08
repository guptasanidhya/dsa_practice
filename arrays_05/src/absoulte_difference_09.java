public class absoulte_difference_09 {
    public static void main(String[] args) {
        int arr[] = {3, 7, 11};
        int k=4;
        int[] f = new int[k];
        long ans=0;
        for(int val : arr) {
            val%=k;

            ans+=(long)f[val];
            System.out.println(ans+"-------------");
            f[val]++;
            
        }
    }
    }
