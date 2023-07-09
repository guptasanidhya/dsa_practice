public class mi_number_of_jumps_09 {

    public static void main(String[] args) {
        int arr[]= {2,3,1,1,2,4,2,0,1,1};
        int ans = minJumps(arr);
        System.out.println(ans);
    }
    static int minJumps(int[] arr){
        if(arr.length==0){
            return -1;
        }


        int i=0;
        int count=0;
        while(i<arr.length){
            if(arr[i]==0){
                return -1;
            }

            int jump=arr[i];
            i=i+jump;
            count++;
        }
        return count;
    }
}
