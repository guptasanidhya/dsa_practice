public class reverse_number_06 {
    static int  sum=0;
    public static void main(String[] args) {
        int n=1342;

         reverse(n);
        System.out.println(sum);
    }
    public static void reverse(int n){
        if(n==0){
            return;
        }
        int rem=n%10;
        sum=sum*10+rem;
         reverse(n/10);
    }
}
