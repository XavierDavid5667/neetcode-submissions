class Solution {
    public int maxArea(int[] arr) {
        int left=0;
        int right=arr.length-1;
        int maxArea=0;


        while(left<right){
            if(arr[left]<arr[right]){
                maxArea=Math.max(maxArea,arr[left]*(right-left)); 
                left++;
            }else{
                maxArea=Math.max(maxArea,arr[right]*(right-left)); 
                right--;
            }
        }
        return maxArea;
    }
}
