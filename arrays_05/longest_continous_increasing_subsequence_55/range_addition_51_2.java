import java.util.Arrays;

class range_addition_51_2 {
    public static void main(String[] args) {
//      int M[][]={{0,0,0},{0,0,0},{0,0,0}};
      int ops[][]={{2,2},{3,3}};
//        int ops[][]={{2,2},{3,3},{3,3},{3,3},{2,2},{3,3},{3,3},{3,3},{2,2},{3,3},{3,3},{3,3}};
//        int ops[][]={};

        int ans =maxCount(3,3,ops);
        System.out.println(ans);
    }
    public static int maxCount(int m, int n, int[][] ops) {
        int k=ops.length;
        //int minc=k,minr=0;
        for (int i=0;i<k;i++)
        {
            int z=ops[i][0] ,x=ops[i][1];
            n=Math.min(n,x);
            m=Math.min(m,z);
        }
        return (m*n);
}}
