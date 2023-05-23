import java.util.Stack;

class reverse_vowels_of_the_string_31 {
    public String reverseVowels(String ss) {
        int s=0;
        int e=ss.length()-1;
        char ans[]=ss.toCharArray();

        while(s<=e){
            boolean flag1=false;
            boolean flag2=false;

            if(ans[s]=='A'||ans[s]=='E'||ans[s]=='I'||ans[s]=='O'||ans[s]=='U'||ans[s]=='a'||ans[s]=='e'||ans[s]=='i'||ans[s]=='o'||ans[s]=='u'){
                flag1=true;
            }else{

                s++;
            }

            if(ans[e]=='A'||ans[e]=='E'||ans[e]=='I'||ans[e]=='O'||ans[e]=='U'||ans[e]=='a'||ans[e]=='e'||ans[e]=='i'||ans[e]=='o'||ans[e]=='u'){
                flag2=true;
            }
            else{
                e--;
            }
            if(flag1==true && flag2==true){
                char temp=ans[s];
                ans[s]=ans[e];
                ans[e]=temp;
                s++;
                e--;
            }
        }
        String temp = new String(ans);
        return temp;
    }
}