import java.util.Arrays;

class duplicate_03 {
    public static void main(String[] args) {
        int arr[]={1,3,4,2,2};
        int x=findDuplicate(arr);
        System.out.println(x);
    }
    public static int findDuplicate(int[] arr) {
        int i=0;
        while(i<arr.length)
        {
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{i++;}
            System.out.println(Arrays.toString(arr));
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j+1){
                return arr[j];
            }
        }
        return arr.length;
    }
   static void swap(int arr[], int start,int second){
        int temp=arr[start];
        arr[start]=arr[second];
        arr[second]=temp;
}
}