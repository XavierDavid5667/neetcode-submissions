class Solution {
    public int[] twoSum(int[] numbers, int target) {
      int low=0;
      int right=numbers.length-1;
      while(low<right){
          if (numbers[low]+numbers[right]==target){
              return new int[] {low+1,right+1};
          }else if (numbers[low]+numbers[right]<target){
              low++;
          }else {
              right--;
          }
      }
      return new int[] {-1,-1};
        
    }
}
