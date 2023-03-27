import java.sql.SQLOutput;
import java.util.*;

class last_word18_1{

    public static void main(String[] args) {
//        String s="   fly me   to   the moon  ";
        String s="luffy is still joyboy";
        s=s.trim();
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                count++;
            }
            else{
                break;
            }
        }

        System.out.println(count);
    }
}