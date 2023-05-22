import java.util.Arrays;

import static java.lang.Math.max;

public class longest_string_array_04 {
    public static void main(String[] args) {
        String names[] = { "Geek", "Geeks", "Geeksfor",
                "GeeksforGeek", "GeeksforGeeks" };
//        Arrays.sort(names);
//        System.out.println(Arrays.toString(names));
        int maximum=0;
        int index=-1;
        String maxi="maximus";
        for(int i=0;i<names.length;i++){

        if (maximum<=names[i].length()) {
            maximum = names[i].length();
            index = i;
        };
    }
        System.out.println(index);

    }
}
