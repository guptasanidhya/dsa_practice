import java.util.ArrayList;

public class last_word_18 {
    public static void main(String[] args) {
        String s="   fly me   to   the moon  ";
        s=s.trim();
        System.out.println(s);
       StringBuilder sb = new StringBuilder();
       java.util.List<String> ls = new ArrayList<>();
        for(int i=0;i<s.length();i++){
                if (Character.isAlphabetic(s.charAt(i))) {
                    sb.append(s.charAt(i));
                } else if (Character.isDigit(s.charAt(i))) {
                    sb.append(s.charAt(i));
                }
                else{
                    System.out.println(sb.toString());
                    if(sb.toString()!=""){
                    ls.add(sb.toString());}
                    sb.delete(0,sb.length());
                }
        }
        ls.add(sb.toString());
        System.out.println(ls);
        System.out.println(ls.get(ls.size()-1).length());
    }
}
