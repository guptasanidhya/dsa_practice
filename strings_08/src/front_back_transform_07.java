public class front_back_transform_07 {
    public static void main(String[] args) {
        String s= "Hello";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(Character.isUpperCase(ch)){
                int number= (int) ch - (int) 'A';
                int ans= (int) 'Z' -number;
               sb.append((char)ans);
            }
            else{
                int number= (int) ch - (int) 'a';
                int ans= (int) 'z' -number;
                sb.append((char)ans);
            }
        }
        System.out.println(sb.toString());
    }
}
