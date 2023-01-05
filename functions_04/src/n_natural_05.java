import java.sql.SQLOutput;

public class n_natural_05 {

    public static void main(String args[]){
        int number=10;
       long ans= sum(number);
        System.out.println(ans);
    }
    public static long sum(long n){
        long natural_sum=0;
        for(int i =1;i<=n;i++){
            natural_sum+=i;
        }
        return natural_sum;
    }
}
