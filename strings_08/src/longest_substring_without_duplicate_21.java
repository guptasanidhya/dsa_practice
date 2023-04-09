import java.util.HashSet;

class longest_substring_without_duplicate_21 {

    public static void main(String[] args) {
//        String s="pwwkew";
//        String s="abcabcbb";
        String s="aab";
        int len=lengthOfLongestSubstring(s);
    }
    public static int lengthOfLongestSubstring(String s) {
        java.util.Set<String> hs = new HashSet<>();
        String ans ="";
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++) {
                sb.append(s.charAt(j));
                if (!hs.contains(s.charAt(j)+"")) {
                    hs.add(s.charAt(j) + "");

                    System.out.println(sb + "" + hs);

                    if (sb.length() == hs.size()) {
                        System.out.println("equal");
                        if (ans.length() < sb.length()) {
                            ans = sb.toString();
//                        System.out.println(ans);
                        }
                    }
                }
               else {
                    System.out.println("hii");
                    sb.delete(0,sb.length());
                    hs.clear();
                    break;

                }
            }


            sb.delete(0,sb.length());
            hs.clear();

        }
        System.out.println("ans="+ans);
        return 0;
    }
}