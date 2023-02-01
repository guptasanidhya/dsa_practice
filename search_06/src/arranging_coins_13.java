public class arranging_coins_13 {
    public static void main(String[] args) {
        int n =22;
        long lo = 1, hi = n;

        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;
            long sum = mid * (mid + 1) / 2;

            if (sum < n) lo = mid + 1;
            else if (sum > n) hi = mid - 1;
            else{
                System.out.println(mid);
                System.exit(0);
            };
        }

        System.out.println(hi);
    }
}
