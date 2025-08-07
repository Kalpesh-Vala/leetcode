class Solution {
    public int maxArea(int[] height) {
       int left = 0;
       int right = height.length-1;
       int maxWater = 0;
       while(left<right){
        int minHeight;
        if(height[left]>height[right]){
            minHeight=height[right];
        }else{
            minHeight=height[left];
        }
        int width = right-left;
        int water = minHeight*width;

        if(water > maxWater){
            maxWater = water;
        }

        if(height[left]<height[right]){
            left++;
        }else{
            right--;
        }
       }
       return maxWater;

    }
}