public class closest_number_20 {
    public static void main(String[] args) {
//        int arr[]={6 ,7 ,7, 9 ,11 ,12 ,16 ,16 ,18};
        int arr[]={1,2,3,7};
        int n=arr.length;
        int target=17;
        int s=0;
        int e=n-1;
        int ans=-1;
        while(s<=e){
            if(Math.abs(arr[s]-target)==Math.abs(arr[e]-target)){
                System.out.println("if 1"+ans);

                s++;
                ans=e;
            }
            else if(Math.abs(arr[s]-target)<Math.abs(arr[e]-target))
            {ans=s;
                System.out.println("if 2"+ans);
                e--;

            }
            else if(Math.abs(arr[s]-target)>Math.abs(arr[e]-target)) {
                s++;
                System.out.println("if 3"+ans);
                ans=e;
            }
        }
        System.out.println(arr[ans]);
    }
}
