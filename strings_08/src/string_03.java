import java.util.Arrays;

public class string_03 {
    public static void main(String[] args) {
       String str = "i love programming";
       String ans="";
       String s[]= str.split(" ");
        for(int i=0;i<s.length;i++ ){
            String temp= capitalize(s[i]);
            if(i==s.length-1)
            {   ans=ans+temp;}
            else {
                ans = ans + temp + " ";
            }
        }
        System.out.println(Arrays.toString(s));
    }
    public static  String capitalize(String str)
    {
        if (str == null || str.length() == 0) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}

