public class palindrome_08 {
    public static void main(String[] args) {
        int num=505;
         int temp=num;
        int reverse=0;
        while(temp!=0){

         int a=temp%10;
         reverse=(reverse*10)+a;
         temp=temp/10;
    }
    if(reverse==num){
        System.out.println("Palindrome");
    }
    else{
        System.out.println("not palindrome");
    }
    }
}
