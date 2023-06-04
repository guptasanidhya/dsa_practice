public class lucky_number_31 {
    public static void main(String[] args) {
        int arr[][]={{3,7,8},{9,11,13},{15,16,17}};
//        int arr[][]={{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                int target=arr[i][j];
               boolean x= minimum(target,arr[i]);
               if(x){
                   boolean y= maximum(target,arr,j);
                   if(y){
                       System.out.println(arr[i][j]);
                   }
               }
            }
        }
    }

     static boolean minimum(int target, int[] arr) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        if(min==target){
            return true;
        }
        return false;
    }

    static boolean maximum(int target,int[][] arr,int k){
        int Max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i][k]>Max){
                Max=arr[i][k];
            }
        }
        if(Max==target){
            return true;
        }
        return false;
    }

}
