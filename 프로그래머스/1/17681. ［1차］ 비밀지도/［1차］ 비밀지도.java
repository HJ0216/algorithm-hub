class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        String[] strArr1 = new String[n];
        String[] strArr2 = new String[n];
        
        for(int i=0; i<n; i++){
            strArr1[i] = getBinary(arr1[i], n);
            strArr2[i] = getBinary(arr2[i], n);
        }
        
        for(int i=0; i<n; i++){
            answer[i] = getSecretMap(strArr1[i], strArr2[i]);
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