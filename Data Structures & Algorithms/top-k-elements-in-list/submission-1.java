class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
             map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
      LinkedHashMap<Integer,Integer>linkedHashMap= map.entrySet().stream()
                     .sorted(
                                Map.Entry
                                        .<Integer, Integer>comparingByValue()
                                        .reversed()
                        )                      .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1, e2) -> e1,
                    LinkedHashMap::new));

                    System.out.println(linkedHashMap);
                    
                    int[] res=new int[k];
                    int index=0;
                      for (Integer key : linkedHashMap.keySet()) {
                      if (index == k) {
                break;
                }

            res[index] = key;
            index++;
        }
        return res;
        
    }
}
