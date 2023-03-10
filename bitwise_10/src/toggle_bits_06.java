public class toggle_bits_06 {
    public static void main(String[] args) {
        int n=17;
        int l=2;
        int r=3;
//        System.out.println(Integer.toBinaryString(n));
        int len=r-l+1;
        String sh="%"+len+"s";
        String st = String.format(sh, " ").replaceAll(" ", "1");
//        System.out.println(st);
        int reduce=Integer.parseInt(st,2);
        reduce=reduce<<(l-1);

        System.out.println(n^reduce);    }
}
