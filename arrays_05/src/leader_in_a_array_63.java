public class leader_in_a_array_63 {
    public static void main(String[] args) {
//        int arr[]={16,17,4,3,5,2};
        int arr[]={1,2,3,4,4, 0};
        int i=0;
        int j=arr.length-1;
        while(i<arr.length){
            if(i<j){
                if(arr[i]>=arr[j]){
                    j--;
                }
                else{
                    i++;
                    j=arr.length-1;
                }
            }
            else if(i==j){
                System.out.println(arr[i]);
                j=arr.length-1;
                i++;
            }
            else{
                j=arr.length-1;
            }
        }
    }
}
