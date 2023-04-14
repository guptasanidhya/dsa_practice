public class no_of_steps_08 {
    public static void main(String[] args) {
        int n=41;
        int ans = reduce(n);
        System.out.println(ans);
    }
    public static int reduce(int n){
        return helper(n,0);
    }
    public static int helper(int n ,int c){
        if(n==0){
            return c;
        }
        if(n%2==0){
            return helper(n/2,c+1);
        }else{
            return helper(n-1,c+1);
        }
    }
}
