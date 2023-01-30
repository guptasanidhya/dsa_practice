public class sqrt_10 {
    public static void main(String[] args) {
        int x=5;

        long low=1;long high=x;
        long ans=0;
        while(low<=high){
            long mid=low+(high-low)/2;
            if(mid*mid<=x){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }

        }
        System.out.println(ans);
    }
}
