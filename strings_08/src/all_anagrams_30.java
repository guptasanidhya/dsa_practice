import java.util.*;
public class all_anagrams_30 {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> ans = findAnagrams(s,p);
        System.out.println(ans);
    }
    public static List<Integer> findAnagrams(String s, String p) {
        int n=p.length();
        List<Integer> ls = new ArrayList<>();
        char pp[]= p.toCharArray();
        Arrays.sort(pp);
        String p_compare= new String(pp);
        for(int i=0;i<=s.length()-n;i++){
            String temp=s.substring(i,i+n);
            System.out.println(temp);
            char arr[]= temp.toCharArray();
            Arrays.sort(arr);
            String compare= new String(arr);
            if(compare.equals(p_compare)){
                ls.add(i);
            }
        }
        return ls;
    }
}
