import java.util.Stack;

public class valid_parenthesis_17 {
    public static void main(String[] args) {

//        String s = "([}}])";
//        String s = "([}}])";
//        String s = "([}}])";
        String s = "}}";
        int count = 0;
        if (s.length() % 2 == 1) {
//            System.out.println(false);
//            System.exit(0);

        }
        java.util.Stack<Character> ls = new Stack<>();
        for(int i=0;i<s.length();i++){
            char v = s.charAt(i);
            if ('(' == v) {
                ls.add(v);
//               count++;
//               System.out.print(v);
            } else if ('{' == v) {
                ls.add(v);
//               count++;
//               System.out.print(v);
            } else if ('[' == v) {
                ls.add(v);
//               count++;
//               System.out.print(v);
            }
            else{

                if (v == ')'&& !ls.empty()) {
                    if(ls.peek()=='('){
                        ls.pop();
                    }
                    else{
                        System.exit(0);
                    }

                } else if (v == '}' && !ls.empty()) {

                    if(ls.peek()=='{'){
                        ls.pop();
                    }
                    else{
                        System.exit(0);
                    }
                }
                else if (v == ']' && !ls.empty()) {

                    if(ls.peek()=='['){
                        ls.pop();
                    }
                    else{
                        System.exit(0);
                    }
                }
                else if(ls.empty()){
                    System.out.println(false);
                    System.exit(0);
                }

            }


        }
        System.out.println(ls);

    }
    }

//        System.out.println(true);

