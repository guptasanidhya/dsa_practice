import java.util.HashMap;

public class budget {
    public static void main(String[] args) {
        String s = "aaaaaaabbb";
        java.util.Map<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char v= s.charAt(i);
            if(hm.containsKey(v)){
                hm.put(v,hm.get(v)+1);
            }
            else{
                hm.put(v,1);
            }
        }
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(hm.get(c)>2) {
                hm.put(c, 1);
            }
        }

        for(Character keys : hm.keySet()){
//            System.out.println( keys );
            if(hm.containsKey(keys)){
                int count=hm.get(keys);
                while(count>0){
                    System.out.print(keys);
                    count--;
                }
            }
        }


//        System.out.println(hm);
    }
}
