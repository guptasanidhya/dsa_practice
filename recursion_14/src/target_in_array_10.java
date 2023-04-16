public class target_in_array_10 {
    public static void main(String[] args) {
        int target=4;
        int arr[]={1,2,3,4};
        System.out.println(find(arr,target,0));
        System.out.println(findIndex(arr,target,0));
    }
    public static boolean find(int[] arr,int target,int index){
        if(arr.length==index){
            return false;
        }
        return arr[index]==target || find(arr,target,index+1);
    }
    public static int findIndex(int[] arr,int target,int index){
        if(arr.length==index){
            return -1;
        }
        if(arr[index]==target){
           return index;
        }
        else{
          return  findIndex(arr,target,index+1);
        }
    }
}
