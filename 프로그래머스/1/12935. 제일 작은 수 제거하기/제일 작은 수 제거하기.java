class Solution {
    public int[] solution(int[] arr) {
        if(arr.length <= 1) return new int[]{-1};

        int[] answer = new int[arr.length-1];
        int min = Integer.MAX_VALUE;
        for(int i : arr){
            if(i<min) min = i;
        }
        
        boolean isMinRemoved = false;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == min){
                isMinRemoved = true;
                continue;
            }
            
            if(isMinRemoved){
                answer[i-1] = arr[i];
            } else {
                answer[i] = arr[i];
            }
        }
        
        return answer;
    }
}