import java.util.*;
public class simple_interest_03 {
    public static void main(String[] args) {
        System.out.println("Simple Interest Calculator");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Principal amount");
        double principal = sc.nextDouble();
        System.out.println("Enter your time Period in years");
        double time=sc.nextDouble();
        System.out.println("Enter your Rate of Interest");
        double rate=sc.nextDouble();

        double si=(principal*rate*time)/100;
        System.out.println("Simple Interest="+si);
    }
}
