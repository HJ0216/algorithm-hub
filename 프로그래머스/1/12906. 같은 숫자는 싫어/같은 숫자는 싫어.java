import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> temp = new ArrayList();
        temp.add(arr[0]);

        for(int i=0; i<arr.length-1; i++){
            if(arr[i]!=arr[i+1]){
                temp.add(arr[i+1]);
            }
        }
        
        return temp.stream().mapToInt(i -> i).toArray();
    }
}
