class Solution {
    public int maxArea(int[] heights) {
        int  i = 0;
        int j = heights.length - 1;
        int maxArea = 0;
        while(i<j){
            maxArea = Math.max(maxArea, (j-i) * Math.min(heights[i], heights[j]));
            if(Math.min(heights[i], heights[j]) == heights[i]){
                i++;
            } else {
                j--;
            }

        }
return maxArea;
        
    }
}
