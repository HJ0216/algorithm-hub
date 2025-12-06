import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        // 3갸만 정렬
        // 크면 넣어주고 다시 정렬 후 min
        
        int [] trio = new int[k];        
        trio[0] = score[0];
        answer[0] = trio[0];
        for(int i=1; i<score.length; i++){
            if(i < k){
                trio[i] = score[i];
                answer[i] = Math.min(answer[i-1], trio[i]);
            } else {
                if(score[i] > answer[i-1]){
                    Arrays.sort(trio);
                    trio[0] = score[i];
                    Arrays.sort(trio);
                    answer[i] = trio[0];
                } else {
                    answer[i] = answer[i-1];                    
                }
            }             
            
        }

        return answer;
    }

}