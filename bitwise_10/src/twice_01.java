public class twice_01 {
    public static void main(String[] args) {
//      int   N = 9;
//        int arr[] = {75250 ,50074, 43659 ,8931 ,11273 ,75250 ,50074 ,43659 ,8931};
        int   N = 45;
        int arr[] = {45,50879,77924,37710,64441,38166,84493,43043,7988,22504,82328,31730,78841,42613,44304,33170,17710,97158,29561,70934,93100,80279,51817,95336,50879,77924,37710,64441,38166,84493,43043,7988,22504,82328,31730,78841,42613,44304,33170,17710,97158,29561,70934,93100,80279,51817};
        int ans= findSingle(N,arr);
        System.out.println("ans="+ans);
    }
    public static int findSingle(int N,int arr[]){
        long add=0;
        int counter=0;
        long ans=0;
        for(int item:arr){
          long temp= Long.parseLong(Long.toBinaryString(item));
            add=add+temp;
           System.out.println(add);
        }

        while(add>0){
            if(add%2!=0){
                ans=ans+(long)Math.pow(2,counter);
            }
            counter++;
            add=add/10;
        }
        return (int)ans;
    }
}
