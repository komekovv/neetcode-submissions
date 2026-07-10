class Solution {
    public int maxArea(int[] heights) {
        // formula: area = min(heights[left], heights[right]) * (j-i);
        int maxArea = 0, l = 0, r = heights.length - 1;
        while(l < r) {
            int currentArea = Math.min(heights[l], heights[r]) * (r - l);
            maxArea = Math.max(maxArea, currentArea);
            if(heights[l] < heights[r]) l++;
            else r--;
        }

        return maxArea;
    }
}
