import java.util.Arrays;

public class first_missing_positive_04 {
    public static void main(String[] args) {
//        int arr[]={7,8,6,11,12};
//        int arr[]={3,4,-1,1};
//        int arr[]={1,2,0};
//        int arr[]={1};
        int arr[]={2,1};
        int i=0;



        while(i<arr.length){
            if(arr[i]>0 && arr[i]<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{i++;}
            }
            else{i++;}
        }
        System.out.println(Arrays.toString(arr));
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j+1){
                System.out.println(j+1);
                break;
            }

        }    }
    static void swap(int arr[],int first ,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
