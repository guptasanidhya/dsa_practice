import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class twice_02 {
    public static void main(String[] args) {
        int   N = 45;
        int arr[] = {50879,77924,37710,64441,38166,84493,43043,7988,22504,82328,31730,78841,42613,44304,33170,17710,97158,29561,70934,93100,80279,51817,95336,50879,77924,37710,64441,38166,84493,43043,7988,22504,82328,31730,78841,42613,44304,33170,17710,97158,29561,70934,93100,80279,51817};
        int ans= findSingle(N,arr);
        System.out.println("ans="+ans);
    }
    public static int findSingle(int N,int arr[]){
        int ans=0;
      java.util.HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
      for(int item:arr){
          if(hm.containsKey(item)){
              int count=hm.get(item);
              hm.put(item,count+1);
          }
          else {
              hm.put(item, 1);
          }
      }
        Iterator<Map.Entry<Integer,Integer>> itr =hm.entrySet().iterator();

        while(itr.hasNext())
        {
            Map.Entry<Integer,Integer> entry = itr.next();

                   ans= entry.getValue();
                   if(ans==1){
                       ans=entry.getKey();
                       return ans;
                   }
        }

        return -1;
    }
}
