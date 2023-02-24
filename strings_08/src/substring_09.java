class substring_09
{
    public static void main(String[] args) {
        String str="ccdeecbdfedcbabfdfaebdaf";
        String x = "fecfacbccfe";
        int index=strstr(str,x);
        System.out.println(index);
    }
    //Function to locate the occurrence of the string x in the string s.
   static int strstr(String s, String x)
    {
        for(int i=0;i<s.length();i++){
            if(s.length()-i>=x.length()){
            if(s.charAt(i)==x.charAt(0)){
                boolean ans=find(s,x,i);
                if(ans){
                    return i;
                }
                else{
                    continue;
                }
            }
        }
            else{
                return -1;
            }
        }
       return -1;
    }
    static boolean find(String s,String x,int j){
        int counter =0;
        for(int i=j;i<x.length()+j;i++){
            if(s.charAt(i)==x.charAt(counter)){
                counter++;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
