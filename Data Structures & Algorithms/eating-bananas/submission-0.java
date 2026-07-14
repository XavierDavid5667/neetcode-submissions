class Solution {

   public boolean checkIfPossible(int[] piles,int bananaPerHour, int h){
    
      int totolHours=0;
        for(int i=0;i<piles.length;i++){
            totolHours+=Math.ceil((double) piles[i]/bananaPerHour);
        }

        if(totolHours<=h){
            return true;
        }
        return false;
   }

    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=Integer.MIN_VALUE;

        for(int i=0;i<piles.length;i++){
            high=Math.max(high,piles[i]);
        }

       int ans=1;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(checkIfPossible(piles,mid,h)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
        
    }
}
