import java.util.Arrays;

public class assign_cookies_46 {
    public static void main(String[] args) {
        int g[]={10,9,8,7};
        int s[]={5,6,7,8};
        int ans= findContentChildren( g, s);
        System.out.println(ans);

    }
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

 int count=0;
 int i=0;
 int j=0;
 while(i<g.length && j <s.length){
     if(g[i]<=s[j]){
         count++;
         i++;
         j++;
     }
     else{
         j++;
     }
 }

 return count;
    }
}
