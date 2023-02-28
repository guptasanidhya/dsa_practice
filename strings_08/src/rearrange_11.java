import java.util.ArrayList;

class rearrange_11 {
    public static void main(String[] args) {
        String s="is2 sentence4 This1 a3";
        String ans= sortSentence(s);
        System.out.println(ans);
    }
    public static String sortSentence(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder num = new StringBuilder();
        java.util.ArrayList<String> ls = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isAlphabetic(ch)) {
                sb.append(ch);
            } else if (Character.isDigit(ch)) {
                num.append(ch);
                ls.add(sb.toString());
                sb.delete(0, sb.length());
            }
        }

        String arr[] = new String[ls.size()];

        for (int i = 0; i < ls.size(); i++) {
            char ch = num.charAt(i);
//            System.out.println(ch);
//            System.out.println(ls.get(i));
            arr[ch - '0' - 1] = ls.get(i);
        }
//        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length-1; i++) {
                sb.append(arr[i]);
                sb.append(" ");
        }
        sb.append(arr[arr.length-1]);

        return sb.toString();
    }
    }
