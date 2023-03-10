public class ones_compliment_07 {
    public static void main(String[] args) {
        String S = "0110110011111110";
        int N=16;

        if(N==1){
            System.out.println("0");
            System.exit(-1);
        }
        else if(N==0){
            System.out.println("1");
            System.exit(-1);
        }
        int ans = Integer.parseInt(S,2);
//        System.out.println(ans);
        int bits=(int)Math.pow(2,N)-1;
//        System.out.println(Integer.toBinaryString(bits));
        ans=ans^bits;
//        System.out.println(Integer.toBinaryString(ans));
        if(S.length()>Integer.toBinaryString(ans).length()){
        String temp="%"+(N-Integer.toBinaryString(ans).length())+"s";
        String ss = String.format(temp," ").replaceAll(" ","0");
        ss=ss+Integer.toBinaryString(ans);}
        else{
            System.out.println(Integer.toBinaryString(ans));
        }
//        System.out.println(ss);

    }
}
