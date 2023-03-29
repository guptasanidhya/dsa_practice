import java.util.HashSet;

class isHappy_01 {

    public static void main(String[] args) {
        int n=15;
        boolean ans = isHappy(n);
    }
    public static boolean isHappy(int n) {
        java.util.Set<Integer> s = new HashSet<>();
       
        while(n!=1 && !s.contains(n)){
          
 s.add(n);
            System.out.println(n);
            int sum=0;
            while(n>0){
                int rem=n%10;
                sum=sum+(rem*rem);
                n=n/10;
            }

            n=sum;
        }
        return n==1;
    }
}