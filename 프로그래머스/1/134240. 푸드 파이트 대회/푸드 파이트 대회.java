class Solution {
    public String solution(int[] food) {        
        StringBuilder sb = new StringBuilder();

        for(int i=1; i<food.length; i++){
            if(food[i] < 2){
                continue;
            }
            
            if(food[i] %2 !=0) {
                food[i] -= 1;
            }
            
            sb.append(String.valueOf(i).repeat(food[i]/2));
        }
        
        StringBuilder copy = new StringBuilder(sb);

        sb.append("0");
        sb.append(copy.reverse());
        
        return sb.toString();
    }
}