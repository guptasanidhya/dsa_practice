public class print_numbers_forward_02 {
    public static void main(String[] args) {
        int n=5;
        print_num(n);
    }
    public static void print_num(int n){
        if(n<=0){
            return;
        }
        print_num(n-1);
        System.out.println(n);
    }
}
