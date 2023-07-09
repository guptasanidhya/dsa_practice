import java.util.ArrayList;

public class Reverse_The_Array_01
{
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {   int n = arr.size();
        int start=m+1;
        int end=n-1;
        while(start<=end){
            int temp=arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end,temp);
            start++;
            end--;
    }
}
}
