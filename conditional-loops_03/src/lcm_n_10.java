/*To find the lcm of an array we will use GCD because, for any two numbers, the following relationship holds true:

LCM(n1, n2)= (n1*n2)/GCD(n1, n2)

But this is not valid for more than 2 numbers:

LCM(n1, n2, n3)= (n1*n2*n3)/GCD(n1, n2, n3)
Thus to find lcm of the whole array (more than 2 numbers), we will deal with two numbers at a time and use its result for the next number.

We will loop through the array and use Lcm of previous two numbers * array[n] / GCD as follows:

Suppose LCM of the first two numbers of the array (i.e, array[0] and array[1]) is lcm1, for next iteration we find the LCM of lcm1 and array[2] as lcm2, then for the 3rd iteration, LCM of lcm2 and array[3] as lcm3 and so on.

The last LCM value (i.e. LCM of lcm(n-1) and array[n]) gives the LCM of the whole array.
*/
public class lcm_n_10 {
    public static void main(String[] args) {
        int array[] = {8, 4, 2, 16};

        //initialize LCM and GCD with the first element
        int lcm = array[0];
        int gcd = array[0];

        //loop through the array to find GCD
        //use GCD to find the LCM
        for(int i=1; i<array.length; i++){
            gcd = findGCD(array[i], lcm);
            lcm = (lcm*array[i])/gcd;
        }

        //output the LCM
        System.out.println("LCM: "+lcm);
    }

    //recursive function to find GCD of two numbers
    public static int findGCD(int a, int b){
        //base condition
        if(b == 0)
            return a;

        return findGCD(b, a%b);
    }
}
