import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> scores = new HashMap<>();
        for(int i=0; i<name.length; i++){
            scores.put(name[i], yearning[i]);
        }
        
        int[] answer = new int[photo.length];
        for(int i=0; i<photo.length; i++){
            int sum =0;
            for(String person : photo[i]){
                sum += scores.getOrDefault(person, 0);
            }
            answer[i] = sum;
        }

        return answer;
    }
}