import java.util.*;
public class fibonacci_07 {
    public static void main(String[] args) {
        int a=0;
        int b=1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.print(a+" "+b);
        for (int i=0;i<n-2;i++) {
            int c = a + b;
            System.out.print(" "+c);
            a = b;
            b = c;
        }
    }
}
