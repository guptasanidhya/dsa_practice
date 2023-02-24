//{ Driver Code Starts
//Initial Template for Java

import java.io.*;

class reverse_vowel_02
{
    public static void main(String args[])throws IOException
    { String s= "sanidhya";
        String ss = modify(s);
        System.out.println(ss);
    }

// } Driver Code Ends


//User function Template for Java

  static  String modify (String s)
    {   StringBuilder  sb = new StringBuilder();
    for(int i=0;i<s.length();i++){
        char v=s.charAt(i);
        if(v=='a'||v=='e'||v=='i'||v=='o'||v=='u')
        {
            sb.append(v);
        }
    }
     sb.reverse();
        System.out.println(sb);
     StringBuilder ans = new StringBuilder(s);
     int counter=0;
     for(int i=0;i<s.length();i++){
         char v=s.charAt(i);
      if(v=='a'||v=='e'||v=='i'||v=='o'||v=='u'){
          char towed= sb.charAt(counter);
          System.out.println(towed+""+i);
            ans.replace(i,i+1, String.valueOf(towed));
            counter++;
      }
     }
        
    return ans.toString();
    }
}