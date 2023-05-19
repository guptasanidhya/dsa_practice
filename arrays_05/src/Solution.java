import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
//      int M[][]={{0,0,0},{0,0,0},{0,0,0}};
//      int ops[][]={{2,2},{3,3}};
      int ops[][]={{2,2},{3,3},{3,3},{3,3},{2,2},{3,3},{3,3},{3,3},{2,2},{3,3},{3,3},{3,3}};

      int ans =maxCount(3,3,ops);
    }
    public static int maxCount(int m, int n, int[][] ops) {
        int arr[]=new int[m*n];
        int max=Integer.MIN_VALUE;
        if(ops.length==0){
            return m*n;
        }

        for (int i = 0;i<ops.length;i++){
            int j=ops[i][0];
            int k=ops[i][1];
            int mul=j*k;
            for(int l=0;l<mul;l++){
                arr[l]=arr[l]+1;
                if(arr[l]>max){
                    max=arr[l];
                }
            }
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
          if(max==arr[i]){
              count++;
          }
        }
        System.out.println(count);
        System.out.println(max);
        System.out.println(Arrays.toString(arr));
        return count;
    }
}