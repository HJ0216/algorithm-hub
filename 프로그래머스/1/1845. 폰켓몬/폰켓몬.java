import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int count = nums.length/2;
        
        Set<Integer> numSets = new HashSet<>();
        for (int num : nums) {
            numSets.add(num);
        }

        return Math.min(numSets.size(), count);
    }
}