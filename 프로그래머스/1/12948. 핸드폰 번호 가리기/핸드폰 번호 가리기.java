class Solution {
    public String solution(String phone_number) {
        char[] chars = phone_number.toCharArray();
        
        StringBuilder sb = new StringBuilder();
        for(int i=chars.length-1; i >= 0; i--){
            if(i <= chars.length-5){
                sb.append("*");
            } else{
                sb.append(chars[i]);
            }
        }
        
        return sb.reverse().toString();
    }
}