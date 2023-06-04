class minimum_cost_climbing_stairs_57 {
    public static void main(String[] args) {
//        int arr[]= {1,100,1,1,1,100,1,1,100,1};
//        int arr[]= {10,15,20};
        int arr[]= {0,1,2,2};
        int ans = minCostClimbingStairs(arr);
        System.out.println(ans);
    }
    public static int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        for (int i =2;i<n;i++){

            cost[i]=cost[i]+Math.min(cost[i-1],cost[i-2]);
        }

        return Math.min(cost[n-1],cost[n-2]);

    }
}