public class right_most_zero_11 {
    public static void main(String[] args) {
        int N=1279;
        System.out.println("original="+Integer.toBinaryString(N));
        if((N & N+1)!=0){
            System.out.println(N|N+1);


        }else{
            System.out.println(N);

        }
    }
}
