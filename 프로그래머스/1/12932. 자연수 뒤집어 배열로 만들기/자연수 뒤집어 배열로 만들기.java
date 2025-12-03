import java.util.*;

class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        char[] chars = str.toCharArray();

        int[] reverse = new int[chars.length];
        for(int i=0; i<chars.length; i++){
            reverse[chars.length-i-1] = chars[i] -'0';
        }
        
        return reverse;
    }
}