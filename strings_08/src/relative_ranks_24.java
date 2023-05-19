import java.util.Arrays;
import java.util.*;
class relative_ranks_24 {
    public static void main(String[] args) {
        int arr[]={10,3,8,9,4};

        String ans[]=findRelativeRanks(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static String[] findRelativeRanks(int[] score) {
        int copy[]=new int[score.length];
        for(int i=0;i<score.length;i++){
            copy[i]=score[i];
        }
        Arrays.sort(copy);

        java.util.Map<Integer,String> mp = new HashMap<>();
        for(int i=0;i<copy.length;i++) {
            if (i == copy.length - 1) {
                mp.put(copy[i], "Gold Medal");
            } else if (i == copy.length - 2) {
                mp.put(copy[i], "Silver Medal");
            } else if (i == copy.length - 3) {
                mp.put(copy[i], "Bronze Medal");
            } else {
                mp.put(copy[i], (copy.length - i) + "");
            }
        }
        System.out.println(mp);
        String ans[] = new String[score.length];
        for(int i=0;i<score.length;i++)
        ans[i]=mp.get(score[i]);
        return ans;
    }
}