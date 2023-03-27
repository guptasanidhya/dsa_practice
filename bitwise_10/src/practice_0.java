public class practice_0 {
    public static void main(String[] args) {

        String a="110100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        String b= "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
        String output="110111101100010011000101110110100000011101000101011001000011011000001100011110011010010011000000000";
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry == 1) {
            if (i >= 0) {
                carry += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                carry += b.charAt(j--) - '0';
            }
            sb.append(carry % 2);
            carry /= 2;
        }


        System.out.println(sb.reverse());


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
