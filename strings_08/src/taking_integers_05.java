import java.util.ArrayList;
import java.util.Arrays;

public class taking_integers_05 {
    public static void main(String[] args) {
        java.util.ArrayList<String> ls = new ArrayList<>();
        String s = "4?=T5r C 96 TG P585 hGCE9 697";
        char[] news = s.toCharArray();
        System.out.println(Arrays.toString(news));

        for(int i=0;i<news.length;i++){
            if(Character.isDigit(news[i])){

            }

        }
//        String arr[]= s.split(":");
//        for(int i =0;i<arr.length;i++){
//            StringBuilder sb = new StringBuilder();
//            for(int j=0;j<arr[i].length();j++){
//                char v = arr[i].charAt(j);
//                if(Character.isDigit(v)){
//                    sb.append(v);
//                }
//            }
//            if(sb.length()!=0) {
//                ls.add(sb.toString());
//            }
//        }
    }
}
