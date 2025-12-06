class Solution {
    public int solution(int n) {
        // 3진법
        StringBuilder sb = new StringBuilder();
        while(n>0){
            sb.append(n%3);
            n/=3;
        }
        
        String reversed = sb.toString();

        int result = 0;
        for(int i=0; i<reversed.length(); i++){
            result = result * 3 + reversed.charAt(i) - '0';
        }
        
        return result;
    }
}