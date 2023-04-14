public class print_n_numbers_01 {
    public static void main(String[] args) {
        int n=5;
    print_numbers(n);
    }

  public static void print_numbers(int n){
        if(n>0){
            System.out.println(n);
            print_numbers(n-1);
        }
  }
}
