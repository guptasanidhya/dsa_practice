import java.util.HashMap;

class isAnagram_20{
    public static void main(String[] args) {
        String s = "ab";
        String t= "a";
        boolean ans = isAnagram(s,t);
        System.out.println(ans);
    }
    public static boolean isAnagram(String s, String t) {

        if (s.length() == t.length()) {
            java.util.HashMap<Character, Integer> hm = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                char v = s.charAt(i);
                if (hm.containsKey(v)) {
                    hm.put(v, hm.get(v) + 1);
                } else {
                    hm.put(v, 1);
                }
            }
//        System.out.println(hm);
            for (int i = 0; i < t.length(); i++) {
                char v = t.charAt(i);
                if (hm.containsKey(v) && hm.get(v) > 0) {
                    hm.put(v, hm.get(v) - 1);
                } else {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

}