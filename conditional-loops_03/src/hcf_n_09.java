public class hcf_n_09 {
    public static void main(String[] args) {
        int arr[]  = {16,8,24,4};
        int result=arr[0];

        for (int i=0;i<arr.length;i++){
            result=find_hcf(arr[i],result);
        }
        System.out.println(result);
    }
    public static int find_hcf(int a,int b){
        if(b==0){
            return a;
        }
        else{
            return find_hcf(b,a%b);
        }
    }
}
/*
* Greatest Common Divisor (GCD) of two or more positive numbers is the largest possible integer which divides each of them.

For example, GCD of 16, 8, and 24 is 8.

The trick to calculate the GCD of multiple numbers is to use the gcd of two numbers with the third one.

This process will repeat until the last number. The final GCD which we get will be the GCD of the whole array.
For example, first, we will calculate the GCD of the first two numbers of the array (say x), then we will calculate the gcd of the x and the third number (say y) then again we will compute gcd of y and the fourth number.*/

