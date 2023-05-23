import java.util.HashMap;

class ransom_note_32 {
    public static void main(String[] args) {
        String ransomNote = "aa", magazine = "ab";
        boolean ans = canConstruct(ransomNote,magazine);
        System.out.println(ans);
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        java.util.Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            char v = magazine.charAt(i);
            if(map.containsKey(v)){
                int value=map.get(v);
                map.put(v,value+1);
            }
            else{
                map.put(v,1);
            }
        }
        System.out.println(map);
        int count=0;
        for(int i=0;i<ransomNote.length();i++){
            char v = ransomNote.charAt(i);
            if(map.containsKey(v)){
                if(map.get(v)>0){
                    int value=map.get(v);
                    map.put(v,value-1);
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
        }System.out.println(map);
        return true;

    }
}