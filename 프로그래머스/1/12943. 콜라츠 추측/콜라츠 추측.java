class Solution {
    public int solution(int num) {
        long number = (long)num;
        if(number == 1) return 0;

        for(int i=1; i<=500; i++){
            number = number % 2 == 0 ? number/2 : number*3 + 1;
            if(number == 1) return i;
        }
        
        return -1;
    }
}