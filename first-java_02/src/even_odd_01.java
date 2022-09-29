import java.util.*;
public class even_odd_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        if (num%2==0){
            System.out.println("number is even,"+num);
        } else {
            System.out.println("number is odd,"+num);
        }
    }
}
