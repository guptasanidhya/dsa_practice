public class reciprocal_08 {
    public static void main(String[] args) {
        String s= "ab C";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(Character.isUpperCase(ch)){
                int number= (int) ch - (int) 'A';
                int ans= (int) 'Z' -number;
                sb.append((char)ans);
            }
            else if(Character.isLowerCase(ch)){
                int number= (int) ch - (int) 'a';
                int ans= (int) 'z' -number;
                sb.append((char)ans);
            }
            else{
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
}
