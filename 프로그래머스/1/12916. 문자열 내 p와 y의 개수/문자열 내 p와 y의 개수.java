class Solution {
    boolean solution(String s) {
        char[] chars = s.toCharArray();
        int countP = 0;
        int countY = 0;
        
        for(char c: chars){
            if(c == 'p' || c == 'P'){
                countP++;
            } else if(c == 'y' || c== 'Y'){
                countY++;
            }
        }
        
        return countP == countY;
    }
}