import java.util.ArrayList;

public class xor_all_elements_12 {
    public static void main(String[] args) {
        java.util.ArrayList<Integer> ls = new ArrayList<>();
        ls.add(2);
        ls.add(1);
        ls.add(5);
        ls.add(9);
        java.util.ArrayList<Integer> lists=  getXor(ls,ls.size());
        System.out.println(lists);
    }
    static ArrayList<Integer> getXor(ArrayList<Integer> A,int N){
        int xor=0;
        for(int i=0;i<N;i++){
            xor=xor^A.get(i);
        }
        System.out.println(xor);
        for(int i=0;i<N;i++){
            int temp=xor^A.get(i);
            A.set(i,temp);
        }
        return A;

    }
}
