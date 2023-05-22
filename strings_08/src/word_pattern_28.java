import java.util.HashMap;

class word_pattern_28 {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat fish";
        boolean ans = wordPattern(pattern, s);
        System.out.println(ans);
    }

    public static boolean wordPattern(String pattern, String s) {
        StringBuilder sb = new StringBuilder();
        String arr[] = s.split(" ");
//        for(int i=0;i<arr.length;i++){
//            char c= arr[i].charAt(0);
//            sb.append(c);
//        }
//        String input=sb.toString();
//        System.out.println(input);
        if (isIsomorphic(pattern, arr)) {
            return true;
        }
        return false;
    }

    public static boolean isIsomorphic(String s, String[] t) {
        java.util.Map<String, String> mp1 = new HashMap<>();
        java.util.Map<String, String> mp2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (mp1.containsKey(s.charAt(i) + "")) {
                if (!mp1.get(s.charAt(i) + "").equals(t[i])) {
                    return false;
                }
                continue;
            }
            if (mp2.containsKey(t[i])) {
                if (!mp2.get(t[i]).equals(s.charAt(i) + "")) {
                    return false;
                }
                continue;
            }
            mp1.put(s.charAt(i) + "", t[i]);
            mp2.put(t[i], s.charAt(i) + "");
        }
        return true;

        }
}