class flower_bed_53 {
    public static void main(String[] args) {
       int  flowerbed[] = {1,0,0,0,0,1};
               int n = 2;
              boolean ans = canPlaceFlowers(flowerbed,n);
        System.out.println(ans);
    }
    public static boolean canPlaceFlowers(int[] arr, int n) {

        if(arr.length==1 && n==1 && arr[0]==0){
            return true;
        }
//        if(arr.length==1 && n>=1 && arr[0]==1){
//            return true;
//        }

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==1 && arr[i+1]==0 || arr[i]==0 && arr[i+1]==1 ) {
                continue;
            }
            else if(arr[i]==0 && arr[i+1]==0){
                if(n>0) {
                    if (i > 0 && arr[i - 1] == 1 && i<arr.length-2 && arr[i+2]==0) {
                        arr[i + 1] = 1;
                        n--;
                    }
                    else if(i > 0 && arr[i - 1] == 1 && i<arr.length-2 && arr[i+2]==1) {
                       continue;
                    }
                    else{
                        arr[i] = 1;
                        n--;
                    }
                }
            }
            else if(arr[i]==1 && arr[i+1]==1){
                return false;
            }
        }
        if(n>0){
            return false;
        }
        return true;
    }
}