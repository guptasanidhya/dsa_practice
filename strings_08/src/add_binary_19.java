public class add_binary_19 {
    public static void main(String[] args) {
        String a="110100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        String b= "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
String output="110111101100010011000101110110100000011101000101011001000011011000001100011110011010010011000000000";
//        String a ="101";
//        String b = "11";
        int len1=a.length();
        int len2=b.length();
        System.out.println(len1+" "+len2);
        if(len1>len2){
           b=add_extra(len1,len2)+b;
        }
        else if(len1<len2){
            a=add_extra(len1,len2)+a;
        }
        System.out.println(a.length()+" "+b.length());
    long sum=0;
        long carry=0;
        StringBuilder sb = new StringBuilder();
        for(int i=a.length()-1;i>=0;i--){
            long val1=a.charAt(i)-'0';
            long val2=b.charAt(i)-'0';
            sum=val1+val2+carry;
            if(sum==0){
                sb.append(0);
                carry=0;
            }
            else if(sum==1){
                sb.append(1);
                carry=0;
            }
           else if(sum==2){
                sb.append(0);
                carry=1;
            }
           else if(sum==3){
                sb.append(1);
                carry=1;
            }
        }
        if(carry==1){
            sb.append(1);
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println("-------------------------------------------------------------------------------------------------------");
        String ans=sb.reverse().toString();
        System.out.println(ans);
        System.out.println(output);
//        System.out.println(ans.equals(output));


    }
        public static String add_extra(int len1,int len2){
            String temp="%"+(Math.abs(len1-len2))+"s";
            String ss=  String.format(temp," ").replaceAll(" ","0");
            System.out.println(ss);
            return ss;
        }
}
