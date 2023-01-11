import java.sql.SQLOutput;
import java.util.*;

class pythagoras_triplet_14 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 6, 5};
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++ ){
                for(int k=0;k<n;k++){
                    if((Math.pow(arr[i],2)==Math.pow(arr[j],2)+Math.pow(arr[k],2) ||
                            Math.pow(arr[j],2)==Math.pow(arr[k],2)+Math.pow(arr[i],2)||
                            Math.pow(arr[k],2)==Math.pow(arr[i],2)+Math.pow(arr[j],2) )
                            && ((!(i==j && i==k && j==k)))){
                        System.out.println("true");
                    }
                }
            }
        }
    }
}