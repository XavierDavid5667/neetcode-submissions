class Solution {
 public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int i : nums) {
            count.put(i, count.getOrDefault(i, 0) + 1);
        }
        List<Integer>[] fregArray = new List[nums.length + 1];
        for (int i = 0; i < fregArray.length; i++) {
            fregArray[i] = new ArrayList<>();
        }
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            fregArray[entry.getValue()].add(entry.getKey());
        }
        int[] result = new int[k];
        int counter = 0;
        for (int i = fregArray.length - 1; i >= 0 && counter < k; i--) {
            for (int n : fregArray[i]) {
                result[counter++] = n;
            }
        }
        return result;
    }
}
