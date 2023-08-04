public class majority_element_64 {
    public static void main(String[] args) {
        int arr[] = {3,1,3,3,2};
        int count=0;
        int el=0;
        int size=arr.length-1;

        for(int i=0;i<size;i++){
            if(count==0){
                count=1;
                el=arr[i];

            }
            else if(arr[i]==el){
                count++;
            }
            else{
                count--;
            }
        }
        int count1=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==el)
            {count1++;}
            if(count1>size/2){
                System.out.println(arr[i]);
                System.exit(0);
            }
        }
        System.out.println(-1);
    }
}
