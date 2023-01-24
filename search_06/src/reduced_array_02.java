import java.util.Arrays;

class reduced_array_02 {
    public static void main(String[] args) {

    int arr[]={10,40,20};
    int n=arr.length;
        //Code here
        int temp[]=new int[n],eg[]=new int[n],x=0;


        for(int i=0;i<n;i++)temp[i]=arr[i];

        //sorting temp
        Arrays.sort(temp);

        // searching ezch element
        for(int i=0;i<n;i++){
            x=binary_Search(temp,0,n-1,arr[i]);
            eg[i]=x;
        }


        for(int i=0;i<n;i++)arr[i]=eg[i];


        System.out.println(Arrays.toString(arr));
    }

    //binary search function
   static int binary_Search(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;


            if (arr[mid] == x)
                return mid;


            if (arr[mid] > x)
                return binary_Search(arr, l, mid - 1, x);


            return binary_Search(arr, mid + 1, r, x);
        }


        return -1;
    }

}
