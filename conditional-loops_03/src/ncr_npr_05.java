import java.util.*;
public class ncr_npr_05 {
    public static void main(String[] args) {
        int n=5;
        int r =2;
        int fac=factorial(n);
        double ncr=(factorial(n))/(factorial(n-r)*factorial(r));
        System.out.println("ncr="+ncr);
        double npr=(factorial(n))/factorial(n-r);
        System.out.println("npr"+npr);
    }
    static int factorial(int n) {
    if (n<=1){
        return 1;
    }else{
        return n*factorial(n-1);
    }
    }
}
