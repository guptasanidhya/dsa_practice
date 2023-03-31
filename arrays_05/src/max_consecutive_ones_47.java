public class max_consecutive_ones_47 {
    public static void main(String[] args) {
//        int  arr[]= {1,1,0,1,1,1};
        int  arr[]= {0};
        int max=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
                if(i==arr.length-1){
                    if(max<count){
                        max=count;
                    }
                }
            }
            else{
                if(max<count){
                    max=count;
                }
                count=0;
            }
        }
        System.out.println(max);
    }
}
