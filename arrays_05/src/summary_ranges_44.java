import java.util.ArrayList;

public class summary_ranges_44 {
    public static void main(String[] args) {
//        int nums[]={0,2,3,4,6,8,9};
        int nums[]={1,3};
//        int nums[]={0,1,2,4,5,7};
        int e=0;
        java.util.List<String> ls = new ArrayList<>();
//        StringBuilder sb = new StringBuilder();
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]-nums[i]==1){
                if(i+1!=nums.length-1) {
                    continue;
                }
                else{
                    String temp = "\"" + nums[e] + "->" + nums[i+1] + "\"";
                    ls.add(temp);
                    e = i + 1;
                }
            }
            else{
                if(e==i){
                    String temp = "\""+nums[e]+"\"";
                    ls.add(temp);
                    e=i+1;
                }
                else{

                        String temp = "\"" + nums[e] + "->" + nums[i] + "\"";
                    ls.add(temp);
                    if(i+1==nums.length-1){
                         temp = "\""+nums[i+1]+"\"";
                        ls.add(temp);
                    }
                        e = i + 1;


                }
            }

        }
//        System.out.println(sb.charAt(nums.length));
//        String ans =sb.toString().substring(nums.length);
        System.out.println(ls);
//        System.out.println(sb.delete(nums.length,nums.length+1));
//        System.out.println(sb.toString());
    }
}
