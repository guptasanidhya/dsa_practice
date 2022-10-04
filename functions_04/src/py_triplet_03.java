import java.util.ArrayList;

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
            int element=arr.get(i);
            arr.remove(i);
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
