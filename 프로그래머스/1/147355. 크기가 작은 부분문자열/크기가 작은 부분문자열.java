import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;

        List<Long> nums = new ArrayList<>();
        
        long pNumber = Long.valueOf(p);
        for(int i=0; i<t.length()-p.length()+1; i++){
            nums.add(Long.valueOf(t.substring(i, i+p.length())));
        }
        
        for(long number: nums){
            if(number <= pNumber){
                answer++;
            }
        }
        
        return answer;
    }
}