public class factorial_03 {
    public static void main(String[] args) {
        int n=5;
        int ans = factorial(n);
        System.out.println(ans);
    }
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return factorial(n-1)*n;
    }
}
