public class ceiling_char_05 {
    public static void main(String[] args) {
        char arr[]={'a','e','f','f','f'};
        int n=arr.length;
        int s=0;
        int e=n-1;
        char x='z';
        char ans=arr[0];
        int mid= s+(e-s)/2;
        while(s<=e){

            if(arr[mid]==x){
        if(mid==e){
            break;
        }else{
            s=mid+1;
        }
            }
            else if(x>arr[mid]){
                s=mid+1;
            }
            else if(x<arr[mid]){
                ans=arr[mid];
                e=mid-1;
            }
            mid= s+(e-s)/2;
        }
        System.out.println(ans);
    }
}
