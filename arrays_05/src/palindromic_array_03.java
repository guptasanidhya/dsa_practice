public class palindromic_array_03 {
    public static void main(String[] args) {
        int[] arr= {121};
        int ans=palindrome(arr,1);
        System.out.println(ans);
    }

    public static int palindrome(int[] arr,int n)
    {
        for(int i =0;i<n;i++){
            int number=arr[i];
            int sum=0;
            while(number>0){
                int r = number%10;
                number=number/10;
                sum=sum*10+r;
            }
            if(sum!=arr[i]){
                return 0;
            }
        }
        return 1;
    }
}
