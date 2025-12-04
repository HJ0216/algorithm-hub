class Solution {
    boolean solution(String s) {
        char[] chars = s.toLowerCase().toCharArray();
        int count = 0;
        
        for(char c: chars){
            if(c == 'p'){
                count++;
            } else if(c == 'y'){
                count--;
            }
        }
        
        return count == 0;
    }
}