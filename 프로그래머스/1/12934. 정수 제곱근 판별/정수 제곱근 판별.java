class Solution {
    public long solution(long n) {
        if(n == 1){
            return 4;
        }
        
        for(int i=2; i<=n/2; i++){
            if(n%i == 0 && n/i == i){
                return (long)(i+1) * (i+1);
            }
        }
        
        return -1;
    }
}