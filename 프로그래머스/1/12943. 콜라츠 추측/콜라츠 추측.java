class Solution {
    public int solution(int num) {
        long number = (long)num;
        if(number == 1) return 0;
        
        int answer = 0;
        while(true){
            answer++;
            if(answer > 500){ return -1; }

            if(number%2 == 0){
                number /= 2;
            } else {
                number = number * 3 + 1;
            }
                        
            if(number == 1) return answer;
        }
    }
}