import javax.crypto.spec.PSource;

public class max_profit_42 {
    public static void main(String[] args) {

        int arr[]= {7,1,5,3,6,4};
//        int arr[]= {7,6,4,3,1};
//        int arr[]= {2,4,1};
//        int arr[]= {2,1,2,0,1};
//        int arr[]= {2,1,2,1,0,1,2};

        int lsf=Integer.MAX_VALUE;
        int op=0;
        int pist=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<lsf){
                lsf=arr[i];
            }
            pist=arr[i]-lsf;
            if(op<pist){
                op=pist;
            }
        }
        System.out.println(op);
    }
}
