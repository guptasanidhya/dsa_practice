public class swap_nibbles_05 {
    public static void main(String[] args) {
        int n=100;
        int left=n&15;
        left=left<<4;
        int right=n>>4;
        System.out.println(left|right);
    }
}
