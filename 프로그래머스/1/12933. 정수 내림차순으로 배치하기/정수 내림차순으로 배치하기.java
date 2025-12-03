import java.util.*;

class Solution {
    public long solution(long n) {
        char[] chars = String.valueOf(n).toCharArray();
        Arrays.sort(chars);
        
    return Long.parseLong(new StringBuilder(new String(chars)).reverse().toString());
    }
}