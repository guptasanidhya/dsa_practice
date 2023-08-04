public class container_wtih_most_water_58 {
    public static void main(String[] args) {
        int height[]={1,8,6,2,5,4,8,3,7};
        int ans = maxArea(height);
        System.out.println(ans);
    }
    public static int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int max=Integer.MIN_VALUE;
        while(i<j){
            int area=(j-i)*(int)(Math.min(height[j],height[i]));
            max=Math.max(max,area);
            if(height[j]<=height[i]){
                j--;
            }
            else{
                i++;
            }
        }
        return max;
    }
}
