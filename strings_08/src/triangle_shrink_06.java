public class triangle_shrink_06 {
    public static void main(String[] args) {
        String S="Geeks";
                StringBuilder sb = new StringBuilder();
        for(int i=0;i<S.length();i++){
            for(int j=0;j<S.length();j++){
                if(j<i){
                    sb.append(".");
                }
                else{
                    sb.append(S.charAt(j));
                }
            }

        }
        System.out.println(sb.toString());
    }
}
