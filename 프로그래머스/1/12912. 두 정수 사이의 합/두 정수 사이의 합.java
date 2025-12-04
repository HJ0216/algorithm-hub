class Solution {
    public long solution(int a, int b) {
        if(a == b){
            return a;
        }
        
        if(a < b){
            return addNums(a,b);
        } else {
            return addNums(b, a);
        }
    }
    
    private long addNums(int a, int b){
        long result = 0;
        for(int i=a; i<=b; i++){
            result += (long)i;
        }
        
        return result;
    }
}
