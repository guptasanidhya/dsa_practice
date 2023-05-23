import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class all_anagrams_30_02 {
    public static void main(String[] args) {
        String s = "abab";
        String p = "ab";
        List<Integer> ans = findAnagrams(s,p);
        System.out.println(ans);
    }
    public static List<Integer> findAnagrams(String s, String p) {
        int n=p.length();
      List<Integer> ls = new ArrayList<>();
      if(s.length()<p.length()){
          return ls;
      }
        HashMap<String,ArrayList<Integer>> mp = new HashMap<>();
        for(int i=0;i<=s.length()-n;i++){
            String temp=s.substring(i,i+n);
            char arr[]=temp.toCharArray();
            Arrays.sort(arr);
            String ss = new String(arr);
            if(mp.containsKey(ss)){
                mp.get(ss).add(i);
            }
            else{
                ArrayList<Integer> al = new ArrayList<>();
                al.add(i);
                mp.put(ss,al);
            }
        }
        System.out.println(mp);
        char pp[]= p.toCharArray();
        Arrays.sort(pp);
        String p_compare= new String(pp);

        if(mp.containsKey(p_compare)){
          ls= mp.get(p_compare);
        }
        return ls;
    }
}
