import java.util.*;
public class till_zero_max_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int max=0;
        while(num!=0){
            if(num>max){
                max=num;
            }
            System.out.print("enter new number=");
            num=sc.nextInt();
        }
        System.out.println("max number="+max);
    }
}
