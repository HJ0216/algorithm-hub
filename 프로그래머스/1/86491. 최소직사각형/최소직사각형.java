import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        for(int[] size : sizes){
            Arrays.sort(size);
        }
        
        int width = 0;
        int height = 0;
        for(int i=0; i<sizes.length; i++){
            width = width >= sizes[i][0] ? width : sizes[i][0];
            height = height >= sizes[i][1] ? height : sizes[i][1];
        }

        return width * height;
    }
}