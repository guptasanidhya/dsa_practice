class excel_column_13 {
    public static void main(String[] args) {
        int number = 701;
        String ans = convertToTitle(number);
        System.out.println(ans);
    }
    public static String convertToTitle(int columnNumber) {
        String result = "";
        int n=columnNumber;
        while(n>0){
            char c = (char)('A' + (n-1)%26);
            result = c + result;
            n = (n-1)/26;
        }
        return result;
    }
}