import java.util.*;
public class lcm_two_07 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list= new ArrayList<>();

            list.add(new ArrayList<>());

        Scanner sc= new Scanner(System.in);
        for(int i=0;i<1;i++){
            for(int j=0;j<2;j++){
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
    int counter =2;
        int m=0;
        int n=0;
        boolean flag1=false;
        boolean flag2=false;
        int i=0;
        while(list.get(m).get(n)!=1 || list.get(m).get(n+1)!=1){
           if(list.get(m).get(n)%counter==0){
               flag1=true;
           }
           if(list.get(m).get(n+1)%counter==0){
               flag2=true;
           }

           if(list.get(m).get(n)%counter==0 || list.get(m).get(n+1)%counter==0){

               list.add(new ArrayList<>());

               for(int j=0;j<2;j++){

                   if(list.get(i).get(j)%counter==0 ){
                       list.get(i+1).add((list.get(i).get(j))/counter);
                   }
                   else{
                       list.get(i+1).add(list.get(i).get(j));
                   }
               }

               i=i+1;
               m=m+1;
               flag1=false;
               flag2=false;
           }

           else{
               counter = counter +1;
           }
        }
        System.out.println(list);
    }
}
