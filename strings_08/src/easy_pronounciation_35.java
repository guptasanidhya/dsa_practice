public class easy_pronounciation_35 {
    public static void main(String[] args) {
//        String s = "apple";
//        String s = "schtschurowskia";
        String s = "tryst";
        int i=0;
        boolean check=true;
        while(i+3<s.length()){
            String sub =s.substring(i,i+4);
            if(sub.contains("a") ||sub.contains("e")||sub.contains("i")||sub.contains("o")||sub.contains("u") ){
                i++;
            }
            else{
                check=false;
                break;
            }
        }
        if (check) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }
}
