import java.util.Arrays;

class plus_one_35 {
    public static void main(String[] args) {
//        int digits[]= {6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,3};
//        int digits[]= {9};
        int digits[] = {9, 9};
//        int digits[] ={8,9,9,9};

        int[] arr = plusOne(digits);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] plusOne(int[] digits) {
        int x = digits[digits.length - 1];
        if (x < 9) {
            digits[digits.length - 1] = x + 1;
            return digits;
        } else {
            x = x + 1;
            int remainder = x % 10;
            int carry = x / 10;

            digits[digits.length - 1] = remainder;
            for (int i = digits.length - 2; i >= 0; i--) {
                System.out.println(carry + " " + remainder);
                int y=digits[i]+carry;
                digits[i]=y%10;
                carry=y/10;

            }
            if(carry==1){
                int arr[]= new int[digits.length+1];
                arr[0]=1;
                return arr;
            }
                return digits;
            }
        }
    }

