import java.util.*;

class Solution {
    public int[] solution(int[] answers) {        
        int[] student1 = {1,2,3,4,5};
        int[] student2 = {2,1,2,3,2,4,2,5};
        int[] student3 = {3,3,1,1,2,2,4,4,5,5};

        int[] scores = new int[3];
        
        for(int i = 0; i<answers.length; i++){
            if(student1[i%student1.length] == answers[i]){
                scores[0]++;
            }
            if(student2[i%student2.length] == answers[i]){
                scores[1]++;
            }
            if(student3[i%student3.length] == answers[i]){
                scores[2]++;
            }
        }
        
        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));

        List<Integer> students = new ArrayList<>();
        for(int i=0; i<3; i++){
            if(maxScore == scores[i]){
                students.add(i+1);
            }
        }
        
        return students.stream().mapToInt(Integer::intValue).toArray();
    }
}