class Solution {
    /*
    * Given a binary array nums and an integer goal, return the number of non-empty subarrays with a sum goal.
    * A subarray is a contiguous part of the array.
    */
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count = 0;
        int prefixSum = 0;
        Map<Integer, Integer> prefixSumFreq = new HashMap<>();
        prefixSumFreq.put(0, 1); 
        
        for (int num : nums) {
            prefixSum += num;
            if (prefixSumFreq.containsKey(prefixSum - goal)) {
                count += prefixSumFreq.get(prefixSum - goal);
            }
            prefixSumFreq.put(prefixSum, prefixSumFreq.getOrDefault(prefixSum, 0) + 1);
        }
        
        return count;
    }
}