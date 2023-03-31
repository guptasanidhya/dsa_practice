import java.util.ArrayList;

public class practice_0 {
    public static void main(String[] args) {
//        int nums1[]={4,1,2};
//        int nums2[]={1,3,4,2};
//        int nums1[]={4,1,2};
//        int nums1[]={4,1,2};
        int nums1[]={100,1,11,1,120,111,123,1,-1,-100};
        int nums2[]={100,1,11,1,120,111,123,1,-1,-100};
//        ans =[120,11,120,120,123,123,-1,100,100,100]
//        int nums2[] = nums1.clone();

        java.util.ArrayList<Integer> ls = new ArrayList<>();
boolean flag=false;
        for(int i=0;i<nums1.length;i++){
            flag=false;
            for(int j=0;j<nums2.length;j++){
//                System.out.println("j chala");

                if(nums1[i]==nums2[j] && j<nums2.length-1){
                    int max=nums2[j];
                    for(int k=j+1;k< nums2.length;k++){
//                        System.out.println("k chala");
                        if(max<nums2[k]){
                            max=nums2[k];
                            ls.add(nums2[k]);
//                           System.out.println("break hua");
                            flag = true;
                            break;
                        }
                    }
                    if(flag==true){
                        break;
                    }
                    if(flag ==false) {
                        for (int k = 0; k < j; k++) {
                            if (max < nums2[k]) {
                                max = nums2[k];
                                ls.add(nums2[k]);
//                           System.out.println("break hua");
                                break;
                            }
                        }
                        if(max==nums2[j]){

                            ls.add(-1);
                            break;
                        }
                    }

                }else if(nums1[i]==nums2[j] && j==nums2.length-1){
                    int max=nums2[j];
                    for(int k=0;k<j;k++){
//                        System.out.println("k chala");
                        if(max<nums2[k]){
                            max=nums2[k];
                            ls.add(nums2[k]);
//                           System.out.println("break hua");
                            break;
                        }
                    }
                    if(max==nums2[j]){
                        ls.add(-1);
                        break;
                    }
                }
            }
        }
        System.out.println(ls);
    }
}
