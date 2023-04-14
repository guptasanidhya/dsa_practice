public class product_individual_digits_05 {
    public static void main(String[] args) {
        int n= 55;
        int ans = multiply(n);
        System.out.println(ans);
    }

    public static int multiply(int n){
        if(n%10==n){
            return n;
        }
        int a=n%10;
        return a*multiply(n/10);
    }
    }

