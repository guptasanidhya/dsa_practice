import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class all_anagrams_30_03 {
    public static void main(String[] args) {
        String s = "abab";
        String p = "ab";
        List<Integer> ans = findAnagrams(s,p);
        System.out.println(ans);
    }
    public static List<Integer> findAnagrams(String s, String p) {

        List<Integer> list = new ArrayList<Integer>();
        if(p.length() > s.length()) return  list; // Base Condition

        int N=s.length(); // Array1 of s
        int M=p.length(); // Array2 of p
        int[]count = freq(p); // intialize only 1 time

        int[]currentCount = freq(s.substring(0, M)); // freq function, update every-time according to sliding window

        if(compare(count,currentCount)) // areSame function
            list.add(0);

        int i;
        for(i=M;i<N;i++){ // going from 3 to 9 in above example
            currentCount[s.charAt(i-M) - 'a']--; // blue pointer, decrement frequency
            currentCount[s.charAt(i)-'a']++; // red pointer, increment frequency
            if(compare(count,currentCount)){ // now check, both array are same
                list.add(i-M+1); // if we find similar add their index in our list
            }
        }
        return list;
    }


    public static boolean compare(int x[],int[] y){
        for(int i=0;i<26;i++){
            if(x[i]!=y[i]){
                return false;
            }
        }
        return true;
    }

    public static int[] freq(String p){
        int[] count = new int[26];
        for(int i=0;i<p.length();i++){
            count[p.charAt(i)-'a']++;
        }
        return count;
    }
}
