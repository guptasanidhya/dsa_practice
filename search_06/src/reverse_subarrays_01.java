import java.util.*;
public class reverse_subarrays_01 {
    public static void main(String[] args) {
        int[] arrayss={36 ,93 ,64 ,48 ,96 ,55 ,70, 0 ,82 ,30 ,16 ,22 ,38 ,53 ,19 ,50 ,91 ,43 ,70, 88, 10 ,57 ,14, 94, 13, 36, 59, 32, 54, 58, 18, 82, 67};

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<arrayss.length;i++){
            arr.add(arrayss[i]);
        }
//        arr.add(3);
//        arr.add(4);
//        arr.add(5);
//        arr.add(6);
//        arr.add(7);
        int count = 0;
        int put_value=0;
        int k = 13;
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        lists.add(new ArrayList<>());


        for (int i = 0; i < arr.size(); i++) {
            if (count < k) {
                int x = arr.get(i);
                lists.get(put_value).add(x);
                count++;
            }
            else if (count == k) {
                count = 1;
                put_value++;
                lists.add(new ArrayList<>());
                int x = arr.get(i);
                lists.get(put_value).add(x);
            }
        }

        for(int i=0;i<lists.size();i++){
            Collections.reverse(lists.get(i));

        }
        System.out.println(lists);
        int variable=0;
        for(int i=0;i<lists.size();i++){
            for(int j=0;j<lists.get(i).size();j++){
               arr.set(variable,lists.get(i).get(j));
                variable++;
            }        }
//        System.out.println(arr);
    }
}
