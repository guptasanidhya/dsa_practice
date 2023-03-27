import java.lang.reflect.Array;
import java.util.Arrays;

public class longest_common_prefix_16 {
    public static void main(String[] args) {
        String strs[]={"flower","flow","flight"};
        Arrays.sort(strs);
        int id=0;
        String s1=strs[0];
        String s2=strs[strs.length-1];
        while(id<s1.length() && id<s2.length()){
            if(s1.charAt(id)==s2.charAt(id)){
                id++;
            }
            else{
                break;
            }
        }
        System.out.println(s1.substring(0,id));
    }
}
