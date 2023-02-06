import java.util.ArrayList;
import java.math.BigInteger;
public class array_form_28 {
    public static void main(String[] args) {
        int arr[] = {1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};
        int k = 516;
        java.util.List<Integer> ls = new ArrayList<>();
        String a="";
        for(int i=0;i<arr.length;i++){
            a=a+arr[i];
        }
        String kk=k+"";
        BigInteger aa=new BigInteger(a);
        BigInteger extra=new BigInteger(kk);
        BigInteger ans=aa.add(extra);
        String str=ans.toString();
        for(char ch:str.toCharArray()){
            ls.add(0,Character.getNumericValue(ch));
        }
        System.out.println(ls);
        }
        }


