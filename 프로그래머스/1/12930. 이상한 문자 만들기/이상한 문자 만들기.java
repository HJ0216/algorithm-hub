class Solution {    
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        boolean isUpperCase = true;
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == ' '){
                sb.append(String.valueOf(c));
                isUpperCase = true;
            } else {
                if(isUpperCase){
                    sb.append(String.valueOf(Character.toUpperCase(c)));               
                    isUpperCase = false;
                } else {
                    sb.append(String.valueOf(Character.toLowerCase(c)));               
                    isUpperCase = true;
                }
            }
        }
        
        return sb.toString();
    }
}