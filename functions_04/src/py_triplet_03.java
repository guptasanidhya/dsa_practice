import java.util.ArrayList;
/*
1.get the lhs element from the list
2.removing the lhs element from the list
3.now take rhs into consideration and check for each value pair
4.those who got matched will be printed
5.after all the iterations on the rhs side the removed element
 will be placed at the same position from where it was taken
*/

public class py_triplet_03 {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(5);
        arr.add(12);
        arr.add(13);
        arr.add(3);
        arr.add(4);
        p_triplet(arr);
    }
    public static void p_triplet(ArrayList<Integer> arr){
        for(int i=0;i<arr.size();i++){
            int element=arr.get(i);//getting the first element
            arr.remove(i);//removing the LHS element
//            System.out.println(arr);
//            System.out.println(arr.size());
            for (int j=0;j<arr.size();j++){
                for (int k=j+1;k<arr.size();k++){
                    if(Math.pow(element,2)==Math.pow(arr.get(j),2)+Math.pow(arr.get(k),2)){
                        System.out.println("LHS="+element+" RHS="+arr.get(j)+","+arr.get(k));
                    }
                }
            }
            arr.add(i,element);
        }
    }
}
