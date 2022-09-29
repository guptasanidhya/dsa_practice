import java.util.*;
public class factors_02 {
    public static void main(String[] args) {
        int num=50;

    if(num==1){
            System.out.println("factor is "+1);
        }
    else {
        System.out.print(1+" ");
        for (int i = 2; i <= num / 2; i++) {

            if (num % i == 0) {
                System.out.print(i + " ");
            }

        }
        System.out.print(num);


    }}
}
