import java.util.*;
public class roman_to_decimal_15 {
    public static void main(String[] args) {
//        String s ="MCMXCIV";
//        String s ="LVIII";
        String s ="II";

        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("I",1);
        hm.put("V",5);
        hm.put("X",10);
        hm.put("L",50);
        hm.put("C",100);
        hm.put("D",500);
        hm.put("M",1000);
        hm.put("IV",4);
        hm.put("IX",9);
        hm.put("XL",40);
        hm.put("XC",90);
        hm.put("CD",400);
        hm.put("CM",900);

        int counter=s.length();
        int sum=0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length()-1;i++){
            sb.append(s.charAt(i));
            sb.append(s.charAt(i+1));
            if(hm.containsKey(sb.toString())){
                sum=sum+hm.get(sb.toString());
                i=i+1;
                sb.delete(0,sb.length());
                counter=counter-2;
            }
            else{
                sb.delete(1,sb.length());
                sum=sum+hm.get(sb.toString());
                sb.delete(0,sb.length());
                counter=counter-1;
                }
            }
     if(counter==1){
         sum=sum+hm.get(""+s.charAt(s.length()-1));
     }
        System.out.println(sum);
        }
    }


