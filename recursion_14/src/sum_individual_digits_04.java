import org.w3c.dom.ls.LSOutput;

public class sum_individual_digits_04 {
    public static void main(String[] args) {
        int n= 1342;
        int ans = summation(n);
        System.out.println(ans);
    }

    public static int summation(int n){
        if(n==0){
            return 0;
        }
       int a=n%10;
        return a+summation(n/10);
    }
}
