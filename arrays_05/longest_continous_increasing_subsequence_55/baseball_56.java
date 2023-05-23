import java.util.ArrayList;

class baseball_56 {
    public static void main(String[] args) {
//        String arr[]={"5","-2","4","C","D","9","+","+"};
        String arr[]={"1","C"};
        int ans = calPoints(arr);
        System.out.println(ans);
    }
    public static int calPoints(String[] arr) {
java.util.ArrayList<Integer> ls = new ArrayList<>();
    ls.add(0);
    for(int i=0;i<arr.length;i++){

        if(arr[i].equals("C")){
            ls.remove(ls.size()-1);
        }
        else if(arr[i].equals("D")){
            int ans =ls.get(ls.size()-1);
            ls.add(ans*2);
        }
        else if(arr[i].equals("+")){
            int last_one=ls.get(ls.size()-1);
            int last_two=ls.get(ls.size()-2);
            ls.add(last_one+last_two);
        }
        else{
            ls.add(Integer.parseInt(arr[i]));
        }

    }
    int sum=0;
    for(int i=0;i<ls.size();i++){
        sum=sum+ls.get(i);
    }
        System.out.println(ls);
        return sum;
    }
}