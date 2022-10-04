import java.util.Scanner;

public class prime_interval_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int low=sc.nextInt();
        int high=sc.nextInt();
        for(int i =low;i<=high;i++){
           boolean answer= isPrime(i);
           if(answer==true){
               System.out.print(i+" ");
           }
        }
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
