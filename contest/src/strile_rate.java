public class strile_rate {
    public static void main(String[] args) {
        int arr[]= {1,0,2,3};
        int sum=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            System.out.println(sum);
            float sr=(sum*100)/(i+1);
//            System.out.println(sr);
            if(sr==100){
                count++;
            }
        }
        System.out.println(count);
    }
}
