class Solution {
    public int solution(int n) {
        if(n == 1) return 1;

        int sum = 0;
        int sqrt = (int)Math.sqrt(n);
        for(int i=1; i<=sqrt; i++){
            if(n%i == 0){
                if(i*i == n){
                    sum += i;
                } else {
                    sum = sum + i + n/i;
                }
            }
        }
        
        return sum;
    }
}