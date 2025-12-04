class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        
        long total = (long)price * count*(count+1)/2;
        answer = total < money ? 0 : total - money;
            
        return answer;
    }
}