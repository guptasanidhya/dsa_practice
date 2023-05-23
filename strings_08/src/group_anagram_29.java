import java.util.*;
class group_anagram_29 {
    public static void main(String[] args) {
        String strs[]= {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> ans =groupAnagrams(strs);
        System.out.println(ans);
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String,ArrayList<String>> mp = new HashMap<>();

        for(int i=0;i<strs.length;i++){
            char arr[]=strs[i].toCharArray();
            Arrays.sort(arr);
            String s = new String(arr);

            if(mp.containsKey(s)){
                mp.get(s).add(strs[i]);
            }
            else{
                ArrayList<String> ls = new ArrayList<>();
                ls.add(strs[i]);
                mp.put(s,ls);
            }
        }

        for(Map.Entry<String, ArrayList<String>> entry: mp.entrySet()){
            Collections.sort(entry.getValue());
        }
//        System.out.println(result);

//        System.out.println(mp);
//        System.out.println(Arrays.toString(strs));
        result.addAll(mp.values());
        return result;
    }
}