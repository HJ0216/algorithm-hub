import java.util.*;

class Solution {
    public long solution(long n) {
        char[] nums = String.valueOf(n).toCharArray();
        
        Arrays.sort(nums);
        
        StringBuilder sb = new StringBuilder(String.valueOf(nums));
        
        return Long.parseLong(sb.reverse().toString());
    }
}