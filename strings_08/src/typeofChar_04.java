import java.lang.reflect.Array;
import java.util.Arrays;

public class typeofChar_04 {
    public static void main(String[] args) {
        String S="#GeeKs01fOr@gEEks07";
        int count[]= new int[4];
        for(int i=0;i<S.length();i++){
            char v=S.charAt(i);
            if(Character.isUpperCase(v)){
                count[0]++;
            }
            else if(Character.isDigit(v)){
                count[2]++;
            }
            else if(Character.isLowerCase(v)){
                count[1]++;
            }
            else{
                count[3]++;

            }

        }
        System.out.println(Arrays.toString(count));
    }
}
