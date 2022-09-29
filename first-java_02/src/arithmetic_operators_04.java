import java.util.*;
public class arithmetic_operators_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        double num1= sc.nextDouble();
        double num2= sc.nextDouble();
        System.out.println("press + for addition,\n press - for subtraction,\npress * for multiplication,\n/ for division");
        String op=sc.next();
        if(op.equals("+")){
            System.out.println("addition="+(num1+num2));
        }
        else if(op.equals("-")){
            System.out.println("subtraction="+(num1-num2));
        }
        else if(op.equals("*")){
            System.out.println("multiplication="+(num1*num2));
        }
        else if(op.equals("/")){
            System.out.println("divide="+(num1/num2));
        }
        else {
            System.out.println("enter the correct operator");
        }
    }
}
