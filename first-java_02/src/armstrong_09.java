public class armstrong_09 {
    public static void main(String[] args) {
        int num=153;
        int temp= num;
        int arm=0;
        while(temp!=0){
            int n=temp%10;
            arm=arm+(n*n*n);
            temp=temp/10;
        }
        if(arm==num){
        System.out.println("armstrong number");
    } else{
            System.out.println("not a armstrong number");
        }
    }
}
