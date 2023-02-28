class long_pressed_14 {
    public static void main(String[] args) {
        String name="alex";
        String typed="aaleex";
       boolean ans =  isLongPressedName(name,typed);
        System.out.println(ans);
    }
    public static boolean isLongPressedName(String name, String typed) {
        int i=0;
        int j=0;
        if(name.charAt(0)!=typed.charAt(0)){
            return false;
        }
        if(name.length()>typed.length()){
            return false;
        }
        while(i<name.length() && j<typed.length())
        if(name.charAt(i)==typed.charAt(j)){
            i++;
            j++;
        }
        else if(name.charAt(i-1)==typed.charAt(j)){
                j++;
        }
        else{
            return false;
        }

        while(j<typed.length()){
            if(name.charAt(i-1)==typed.charAt(j)){
                j++;
            }else{
                return false;
            }
        }
        if(i<name.length()){
            return false;
        }
        return true;
    }
}