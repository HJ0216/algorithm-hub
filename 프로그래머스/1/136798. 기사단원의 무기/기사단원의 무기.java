class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for(int i=1; i<=number; i++){
            int count = getCDCount(i);
            answer += (limit < count) ? power : count;
        }
        
        return answer;
    }
    
    private int getCDCount(int number){
        int result = 0;
        for(int i=1; i<=Math.sqrt(number); i++){
            if(number%i == 0){
                if(i*i == number){
                    result += 1;
                } else {
                    result += 2;                    
                }
            }
        }
        
        return result;
    }
}