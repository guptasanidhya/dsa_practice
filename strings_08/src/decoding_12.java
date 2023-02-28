class decoding_12 {
    public static void main(String[] args) {
        String s="1326#";
       String ans= freqAlphabets(s);
        System.out.println(ans);
    }
    public static String freqAlphabets(String s) {
StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                String temp = ch+"";
                if(s.length()-i>=3) {
                    if (s.charAt(i + 2) == '#') {
                        temp = temp + s.charAt(i + 1) + "";
                        i = i + 2;
                    }
                }
                sb.append((char)(96+Integer.parseInt(temp)));

            }
        }
        return sb.toString();
    }
}