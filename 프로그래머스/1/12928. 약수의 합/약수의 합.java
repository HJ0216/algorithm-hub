class Solution {
    public int solution(int n) {
        if(n < 2){
            return n;
        }
        int sum = 1+n;
        for(int i=2; i<n; i++){
            if(n%i == 0){
                sum += i;
            }
        }
        
        return sum;
    }
}