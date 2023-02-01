public class arranging_coins_12 {
    public static void main(String[] args) {
        int target=20;
        int i=1;
        long sum=0;
        int ans=0;
     while(true){
         sum=sum+i;
         if(sum>target){
             ans=i-1;
             break;
         }
         else if (sum==target)
         {
             ans=i;
             break;
         }
         i++;
     }
        System.out.println(sum);
        System.out.println(ans);

    }
//    static int fact(int n) {
//        if (n == 1 || n == 0) {
//           return 1;
//        }
//        return n * fact(n - 1);
//    }
}
