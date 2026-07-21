class Solution {
    public int maxArea(int[] heights) {
        int l = 0, r = heights.length - 1;
        int max = 0;

        while(l < r) {
            int area = 0;

            if(heights[l] < heights[r]) {
                area = (r-l) * heights[l];
                l++;
            } else {
                area = (r-l) * heights[r];
                r--;
            }

            max = Math.max(max, area);
        }

        return max;
    }
}
