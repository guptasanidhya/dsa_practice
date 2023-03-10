public class swap_nibbles_04 {
    public static void main(String[] args) {

        int N=100;
        int d=18;
        String s = Integer.toBinaryString(N);
        System.out.println(s);
        int len=s.length();
        len=8;
//      if(s.length()%2!=0){
//          len=len+1;
//      }
        int divide=len/2;
        int right=N>>divide;
        System.out.println("right "+Integer.toBinaryString(right));
        int left=N<<divide;
//        System.out.println(left+right);
        System.out.println("left "+Integer.toBinaryString(left));
        int ans=left+right;
        System.out.println("ans "+Integer.toBinaryString(ans));
        String str=Integer.toBinaryString(ans);
        System.out.println(str);
        String answer=str;
        if(str.length()>8){
            answer=str.substring(str.length()-len);}
        ans=Integer.parseInt(answer,2);
        System.out.println(ans);





//        System.out.println(Integer.toBinaryString(N));
//        System.out.println(((n>>d)|(n<<(bits-d)))&65535);
//        String bits=Integer.toBinaryString(N);
//        int len=bits.length();
//        if(Math.pow(2,len)-1==N){
//            System.out.println(1);
//        }
//        else{System.out.println(0);}
    }

}
