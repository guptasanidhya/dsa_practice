class valid_palindrome_phrase_25 {
    public static void main(String[] args) {

    }
    public static boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isDigit(c))
            {sb.append(c);}
            if(Character.isLetter(c))
            {sb.append(c);}
        }
        String main=sb.toString();
      String reverse= sb.reverse().toString();
        System.out.println(reverse);
        System.out.println(main);
        if(main.equals(reverse)){
            return true;
        }
        return false;
    }
}