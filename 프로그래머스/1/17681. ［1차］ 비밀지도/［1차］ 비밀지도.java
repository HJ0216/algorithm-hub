class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i=0; i<n; i++){
            String str1 = getBinary(arr1[i], n);
            String str2 = getBinary(arr2[i], n);
            answer[i] = getSecretMap(str1, str2);
        }

        return answer;
    }
    
    private String getBinary(int num, int size){
        StringBuilder sb = new StringBuilder();
        
        while(size > 0){
            sb.append(num%2);
            num /= 2;
            size--;
        }
        
        return sb.reverse().toString();
    }
    
    private String getSecretMap(String str1, String str2){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i) == '1' || str2.charAt(i) == '1'){
                sb.append("#");
            } else {
                sb.append(" ");
            }
        }
        
        return sb.toString();
    }
}