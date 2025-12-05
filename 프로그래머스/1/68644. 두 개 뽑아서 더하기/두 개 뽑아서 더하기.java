import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> adds = new HashSet();
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                adds.add(numbers[i] + numbers[j]);
            }
        }

        return adds.stream().mapToInt(i -> i).sorted().toArray();
    }
}