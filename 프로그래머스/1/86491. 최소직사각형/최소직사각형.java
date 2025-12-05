import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        for(int[] size : sizes){
            Arrays.sort(size);
        }
        
        int maxWidth = 0;
        int maxHeight = 0;
        for(int[] size : sizes){
            maxWidth = Math.max(maxWidth, size[0]);
            maxHeight = Math.max(maxHeight, size[1]);
        }

        return maxWidth * maxHeight;
    }
}