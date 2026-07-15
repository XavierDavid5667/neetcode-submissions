class Solution {

    public boolean checkIfPossible(int[] piles,int h, int rate){
        int totalTime=0;
        for(int i=0;i<piles.length;i++){
          totalTime+=Math.ceil((double)piles[i]/rate);
        }

        if(totalTime<=h){
            return true;
        }
        return false;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int max=-1;
        for(int i=0;i<piles.length;i++){
           max=Math.max(max,piles[i]);
        }
        int right=max;
        int ans=1;

        while(left<=right){
            int mid=left+(right-left)/2;

            if(checkIfPossible(piles,h,mid)){
                ans=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return ans;

    }
}
