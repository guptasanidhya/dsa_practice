public class subarray_with_given_sum_62 {
    public static void main(String[] args) {
        int arr[]= {1,2,3,7,5};
//        int arr[]= {135 ,101 ,170 ,125 ,79 ,159 ,163 ,65 ,106 ,146 ,82, 28, 162 ,92 ,196 ,143 ,28 ,37 ,192, 5 ,103 ,154 ,93 ,183, 22, 117, 119 ,96 ,48 ,127 ,172 ,139 ,70 ,113 ,68 ,100 ,36 ,95 ,104 ,12, 123, 134};
        int i=0;
        int count=0;
//        int target=468;
        int target=12;
        int sum=0;
        while(count<i||i<arr.length){
            if(target==sum){
                System.out.println("hello");
                System.out.println((count+1)+" "+i);
                break;
            }
            else if(sum<target){
                if (i >= arr.length){
                    break;}

                sum=sum+arr[i];
                i++;
            }
            else if(sum>target){
                if (count >= arr.length){
                    break;}
                sum=sum-arr[count];
                count++;
            }
            else { // If the current sum is less than the target and both count and i have reached the end, exit the loop
                break;
            }
        }
    }
}
