import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class least_sum_index_52 {
    public static void main(String[] args) {
     String   list1[] = {"happy","sad","good"};
     String   list2 []= {"sad","happy","good"};
     String ans[]= findRestaurant(list1,list2);
        System.out.println(Arrays.toString(ans));
    }
    public static String[] findRestaurant(String[] list1, String[] list2) {
        java.util.Map<String,Integer> mp = new HashMap<>();
        java.util.Map<String,Integer> mp1 = new HashMap<>();
        java.util.ArrayList<String> ls = new ArrayList<>();

        for(int i=0;i<list1.length;i++){
            mp.put(list1[i],i);
        }
        int min=Integer.MAX_VALUE;
        String ans="";
        for(int i=0;i<list2.length;i++){
            if(mp.containsKey(list2[i])){
              int  sum=mp.get(list2[i])+i;
                mp1.put(list2[i],sum);
              if(sum<=min){
                  min=sum;
              }
            }
        }
        for(Map.Entry<String, Integer> entry: mp1.entrySet()) {

            // if give value is equal to value from entry
            // print the corresponding key
            if(entry.getValue() == min) {
                ls.add(entry.getKey());
            }
        }
//        System.out.println(ls);
//        System.out.println(min);
//        System.out.println(mp1);
        String[] str = new String[ls.size()];

        for (int i = 0; i < ls.size(); i++) {
            str[i] = ls.get(i);
        }
        return str;
    }
}