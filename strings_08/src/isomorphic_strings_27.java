import java.util.HashMap;

class isomorphic_strings_27 {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        boolean ans = isIsomorphic(s,t);
        System.out.println(ans);
    }
    public static boolean isIsomorphic(String s, String t) {
        java.util.Map<Character,Character> mp1 = new HashMap<>();
        java.util.Map<Character,Character> mp2 = new HashMap<>();
            for(int i=0;i<s.length();i++){
                if(mp1.containsKey(s.charAt(i))){
                    if(mp1.get(s.charAt(i))!=t.charAt(i)){
                        return false;
                    }
                    continue;
                }
                if(mp2.containsKey(t.charAt(i))){
                    if(mp2.get(t.charAt(i))!=s.charAt(i)){
                        return false;
                    }
                    continue;
                }
                mp1.put(s.charAt(i),t.charAt(i));
                mp2.put(t.charAt(i),s.charAt(i));
            }
        return true;
    }
}