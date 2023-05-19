import java.util.ArrayList;



class keyboard_row_23 {

    public static void main(String[] args) {
        String words[]={"hello","alaska"};
        String ans[]= findWords(words);
    }
    public static String[] findWords(String[] words) {
        String row1="qwertyuiop";
        String row2="asdfghjkl";           
        String row3="zxcvbnm";
     java.util.ArrayList<String> ls = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String t=words[i];
            String temp=t.toLowerCase();
            for(int j=0;j<temp.length();j++){
                String c = temp.charAt(j)+"";
            if(!row1.contains(c)){
                break;
            }
            if(j==temp.length()-1){
                ls.add(words[i]);
            }
        }

           for(int j=0;j<temp.length();j++){
                String c = temp.charAt(j)+"";
            if(!row2.contains(c)){
                break;
            }
            if(j==temp.length()-1){
                ls.add(words[i]);
            }
        }

           for(int j=0;j<temp.length();j++){
                String c = temp.charAt(j)+"";
            if(!row3.contains(c)){
                break;
            }
            if(j==temp.length()-1){
                ls.add(words[i]);
            }
        }
    }
String arr[]= new String[ls.size()];
for(int i=0;i<arr.length;i++){
    arr[i]=ls.get(i);
}
return arr;
    }
}