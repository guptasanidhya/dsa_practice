public class last_modified_ball_10 {
    public static void main(String[] args) {
        int[] A={3, 1, 4, 5};
        int ans=solve(4,A);
    }
  static  int solve(int N, int[] A) {
        int i;
        for (i = N-1; i >= 0; i--){
            if (A[i]+1 <= 9)
            { break;}
        }
        return i+1;

    }
}


/* Input:
N = 4
A[] = {3, 1, 4, 5}
Output:
4
Explanation:
The last bowl has 5 marbels, we can just
add the marbel here.

Input:
N = 3
A[] = {1, 9, 9}
Output:
1
Explanation:
When we add the marbel to last bowl we
have to move one marbel to 2nd bowl,
to add the marbel in 2nd bowl we have
to move one marbel to 1st bowl.
Hence the last modified bowl is 1.


Traverse from the end.
Check if adding another marble in the current bowl overflows.
If current marbles + 1 is greater than 9, then move to another bowl.
If current marbles + 1 is less than 9, then break from the loop (marbled has been added to the right bowl: mission accomplished).
Return the index of the bowl.
class Solution {
*/
