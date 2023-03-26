import java.util.ArrayList;
import java.util.List;

public class pascal_triangle_41 {
    public static void main(String[] args) {
        java.util.List<List<Integer>> ls = new ArrayList<>();
        int nums=0;
        int size=nums+1;
        int i=1;
        while(i<=size) {
            if (i <= 2) {
                java.util.List<Integer> ls1 = new ArrayList<>();
                for (int j = 0; j < i; j++) {
                    ls1.add(1);
                }
                ls.add(ls1);
                i++;
            }
            else {
                java.util.List<Integer> ls1 = new ArrayList<>();
                for(int j=0;j<i;j++){
                    if(j!=0 && j!=i-1){
                        int sum = ls.get(i-2).get(j-1)+ls.get(i-2).get(j);
                        ls1.add(sum);
                    }else{
                    ls1.add(1);}
                }
                ls.add(ls1);
                i++;
            }
        }
        System.out.println(ls);
        System.out.println(ls.get(nums));
    }
}
