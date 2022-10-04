import java.util.*;
public class prime_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("check the prime number");
        int num=sc.nextInt();

        boolean answer=isPrime( num);
        System.out.println(answer);
    }
    public static boolean isPrime(int num)
    {
        if(num<=1){
            return false;
        }
        else{
            for(int i =2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    return false;
                }
            }
            return true;
        }
    }
}
