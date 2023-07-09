import java.util.Arrays;

public class merge_sort_09 {
    public static void main(String[] args) {
        int arr[]={5,3,8,2,9,4,5};
        int a[]= mergesort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(a));
    }
    public static int[] mergesort(int a[],int l,int r){

        if(l<r){
            int m=(l+r)/2;
            mergesort(a,l,m);
            mergesort(a,m+1,r);
            merge(a,l,m,r);
        }
        return a;
    }
    public static void merge(int a[],int l, int m,int r){
        int i=l;
        int j=m+1;
        int k=l;
        int b[]= new int[a.length];
        while(i<=m && j<=r) {
            if (a[i] < a[j]) {
                b[k] = a[i];
                i++;
            } else {
                b[k] = a[j];
                j++;
            }
            k++;
        }

        if(i>m){
            while(j<=r){
                b[k++]=a[j++];
            }
        }
        else{
            while(i<=m){
                b[k++]=a[i++];
            }
        }
        for(int z=l;z<=r;z++){
            a[z]=b[z];
        }
    }
}
