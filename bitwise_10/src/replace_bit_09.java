public class replace_bit_09 {
    public static void main(String[] args) {
        int n=890;
        int k=10;
        System.out.println(Integer.toBinaryString(n));
        int len=Integer.toBinaryString(n).length();
        int turn=len-k;
        n=n&(~(1<<(turn)));
        System.out.println(Integer.toBinaryString(n));
    }
}
