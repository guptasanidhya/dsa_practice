import java.util.*;
public class hcf_maths_08 {
    public static void main(String[] args) {
        int value=0;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the number of digits");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("enter number=");
            int number = sc.nextInt();
            list.add(number);
        }
        ArrayList<ArrayList<Integer>> ls = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            int counter = 2;
            ls.add(new ArrayList<>());
            value=list.get(i);
            while(value!=1){
                if (value % counter == 0) {
                    value=value/counter;
                    ls.get(i).add(counter);
                } else {
                    counter = counter + 1;
                }
            }
        }
        System.out.println(ls);

    }
}