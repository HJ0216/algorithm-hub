class Solution {
    public int solution(int a, int b, int n) {
        int total = 0;
        
        while(n>=a){
            int received = (n / a) * b;
            int remained = n%a;
            total += received;
            n = remained + received;
        }
        
        return total;
    }
}