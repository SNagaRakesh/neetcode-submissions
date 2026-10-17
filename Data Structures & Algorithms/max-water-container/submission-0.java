class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;

        int ans = 0;
        int i = 0;
        int j = n-1;

        while(i < j) {
            int height = Math.min(heights[i], heights[j]);
            int distance = j - i;

            int area = height * distance;

            ans = Math.max(area, ans);
            
            if(heights[i] <= heights[j]) i++;
            else j--;
        }
        return ans;
    }
}
