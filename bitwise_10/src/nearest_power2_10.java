class nearest_power2_10 {
    public static void main(String[] args) {
        long N=2;
        long ans = nearestPowerOf2(N);
        System.out.println(ans);
    }
    static long nearestPowerOf2(long N){
        long len=Long.toBinaryString(N).length();
        if(len==1){
            return 1;
        }
        else if((long)Math.pow(2,len-1)==N){
        return N;
        }
            return (long)Math.pow(2,len);

    }
}