import java.util.Scanner;
public class currency_06 {
    public static void main(String[] args) {
        System.out.println("Input the currency in rupee to convert it into USD");
        double usd=80.0;
        Scanner sc = new Scanner(System.in);
        double inr=sc.nextDouble();
        System.out.println("USD will be, "+(inr/usd));
    }
}
