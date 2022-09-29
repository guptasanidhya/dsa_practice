public class add_mul_01 {
    public static void main(String[] args) {
        int num = 234;
        int temp=num;

        int add=0;
        int mul=1;

        while(temp!=0){
            int remainder=temp%10;
            add=add+remainder;
            mul=mul*remainder;
            temp=temp/10;
        }

        System.out.println("addition="+add);
        System.out.println("product="+mul);

        System.out.println("addition-product="+(mul-add));
    }
}
