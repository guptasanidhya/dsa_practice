import java.util.Arrays;

class max_occur_10
{
    public static void main(String[] args) {
        String line="aaaaa";
        char c=getMaxOccuringChar(line);
        System.out.println(c);
    }
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line)
    {
        int arr[]= new int[26];
        for(int i=0;i<line.length();i++){
            char v = line.charAt(i);
            int index=v-'a';
            arr[index]++;
        }
        System.out.println(Arrays.toString(arr));
        int max=Integer.MIN_VALUE;
        int maximum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+"  "+max);
            if(arr[i]>max){
                max=arr[i];
                 maximum=i;
                System.out.println("max="+maximum);
            }

        }

       return (char)('a'+maximum);
    }
    
}