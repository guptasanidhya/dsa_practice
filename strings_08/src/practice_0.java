public class practice_0 {
    public static void main(String[] args) {
//        String A = "gksrek";
//        String B = "geeksforgeeks";
        String A = "AXY";
        String B = "YADXCP";
        int counter=0;
        for(int i=0;i<B.length();i++){
            if(counter<A.length()) {
                if (B.charAt(i) == A.charAt(counter)) {
                    counter++;
                }
            }
        }
        if(counter==A.length()){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
