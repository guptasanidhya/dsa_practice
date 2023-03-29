public class xor {
    public static void main(String[] args) {
        int  a=1;
        int  b=2;
        int  c=3;
       long low,high,mid;
       long x=low=-1; low++;
        high= (1<<30)-1;
        while (low<=high){
            mid = (low + high)/2;
            if ((a^mid) < (b^mid) && (b ^ mid) < (c ^ mid)) {
                x = mid;
                break;
            }
        else if ((a ^ mid)<(b ^ mid)) {
                high = mid-1;
            } else {
                low = mid+1;
            }
        }

        System.out.println(x);
    }
}
