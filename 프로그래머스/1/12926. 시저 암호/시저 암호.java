class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == ' '){
                sb.append(c);
            } else {
                sb.append(shiftChar(c, n));
            }
        }
        
        return sb.toString();
    }
    
    private char shiftChar(char c, int n){
        return c >= 'a' && c <= 'z'
            ? (char)((c-'a'+n)%26 +'a')
            : (char)((c-'A'+n)%26 + 'A');
    }
}