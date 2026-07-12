class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> hashmap=new HashMap<>();
        for(int num:nums){
            if(hashmap.containsKey(num)){
                return true;
            }else{
                hashmap.put(num,1);
            }

        }
        return false;
 
    }
}
