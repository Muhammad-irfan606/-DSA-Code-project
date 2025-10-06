class Solution {
    public int maxArea(int[] height) {
        int max_area=0;
        int left=0;
        int right=height.length-1;

        while(left<right){
            int current_height = Math.min(height[left], height[right]);
            int width=right-left;
            int current_area = current_height * width;
            max_area=Math.max(current_area,max_area);

            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max_area;

    }
}
