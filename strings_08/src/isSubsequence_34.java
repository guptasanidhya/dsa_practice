class isSubsequence_34 {
    public static void main(String[] args) {
        String s = "acb";
        String t="ahbgdc";
        boolean ans = isSubsequence(s,t);
        System.out.println(ans);
    }
    public static boolean isSubsequence(String s, String t) {
        if(s.length()>t.length()){
            return false;
        }
        int s1=0;
        int t1=0;

        while(s1<s.length() && t1<t.length())
        {
            char s_char=s.charAt(s1);
            char t_char=t.charAt(t1);
            if(s_char==t_char){
                s1++;
                t1++;
            }
            else{
                t1++;
            }
        }

        if(s1==s.length()){
            return true;
        }
      return false;
    }
}