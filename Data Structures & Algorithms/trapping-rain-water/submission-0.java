class Solution {

   
    public int trap(int[] height) {
        int leftMax=Integer.MIN_VALUE;
        int rightMax=Integer.MIN_VALUE;
        int left=0;
        int right=height.length-1;
        int total=0;

        while(left<right){
            leftMax=Math.max(leftMax,height[left]);
            rightMax=Math.max(rightMax,height[right]);

            if(leftMax<rightMax){
                total=total+(leftMax-height[left]);
                left++;
            }else{
                total=total+(rightMax-height[right]);
                right--;
            }
        }
        return total;
    }
}
