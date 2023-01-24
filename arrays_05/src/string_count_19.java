public class string_count_19 {
    public static void main(String[] args) {
        String s ="0101011110";
        char[] chars = s.toCharArray();
        int index=-1;
        int n=chars.length;
        for(int i=0;i<n;i++){
        if(s.charAt(i)=='1'){
            index=i;
        }
        }
        System.out.println(index);
    }
}
