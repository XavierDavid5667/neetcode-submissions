class Solution {
    public int trap(int[] height) {
        int left=0;
        int right=height.length-1;
          int leftMax=-1;
          int rightMax=-1;
          int totalArea=0;


        while(left<right){
           leftMax=Math.max(leftMax,height[left]);
           rightMax=Math.max(rightMax,height[right]);

           if(leftMax<rightMax){
            totalArea=totalArea+(leftMax-height[left]);
            left++;
           }else{
              totalArea=totalArea+(rightMax-height[right]);
              right--;
           }
        }
        return totalArea;
        
    }
}
