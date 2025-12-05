class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int min = Math.min(n, m);
        for(int i=min; i>= 1; i--){
            if(n%i ==0 && m%i ==0){
                answer[0] = i;
                break;
            }
        }

        answer[1] = Integer.MAX_VALUE;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(n*j == m*i){
                    if(n*j < answer[1]){
                        answer[1] = n*j;
                    }
                    break;
                }
            }
        }
        
        return answer;
    }
}