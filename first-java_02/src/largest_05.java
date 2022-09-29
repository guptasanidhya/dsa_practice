import java.util.*;
public class largest_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input the numbers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        if (num1>num2){
            System.out.println("num 1 is largest,"+num1);
        }else if(num2>num1){
            System.out.println("num 2 is largest,"+num2);
        }else {
            System.out.println("Both are equal");
        }
    }
}
