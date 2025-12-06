import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int[] count = new int[26];

        for(int i=0; i<s.length(); i++){
            int index = (s.charAt(i) - 'a') % 26;
            
            if(count[index] > 0){
                int beforeIndex = getBeforeIndex(i, s.charAt(i), s);
                answer[i] = i-beforeIndex;
            } else {
                count[index] += 1;
                answer[i] = -1;
            }
        }
        
        return answer;
    }
    
    private int getBeforeIndex(int start, char c, String s){
        for(int i=start-1; i>=0; i--){
            if(c == s.charAt(i)){
                return i;
            }
        }
        
        return -1;
    }
}