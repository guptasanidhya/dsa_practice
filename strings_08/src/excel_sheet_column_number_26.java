class excel_sheet_column_number_26 {

    public static void main(String[] args) {
        String s = "ZY";
        int ans =titleToNumber(s);
    }
    public static int titleToNumber(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int c = (int) (s.charAt(i));
            c=c-64;
            sum=sum+(c*(int)Math.pow(26,s.length()-i-1));
        }
        System.out.println(sum);
        return 0;
    }
}