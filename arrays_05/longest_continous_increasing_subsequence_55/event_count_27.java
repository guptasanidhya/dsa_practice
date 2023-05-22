class event_count_27 {
    public static void main(String[] args) {
        int a[] = {12, 345, 2, 6, 7896};
        int x = findNumbers(a);
        System.out.println(x);
    }

    public static int findNumbers(int[] nums) {
        int even_count = 0;
        for (int i = 0; i < nums.length; i++) {
            boolean x = even(nums[i]);
            if (x == true) {
                even_count++;
            }
        }
        return even_count;
    }

    static boolean even(int i) {
        int count = 0;

        while (i> 0) {
            i=i/10;
            count++;
        }
        if (count % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}