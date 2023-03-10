public class alternate_bits_13 {
    public static void main(String[] args) {
        int n=10;
        for(int i=1;i<=n;i++){
            boolean alt=result(i);
            if(alt){
                System.out.println(i);
            }
        }
    }
  static  boolean result(int n){
        n=n^(n>>1);
        boolean ans=all_bits_set(n);
        return ans;
    }


  static  boolean all_bits_set(int n){
        if(((n)&(n+1))==0){
            return true;
        }
        else{return false;}
    }
}
