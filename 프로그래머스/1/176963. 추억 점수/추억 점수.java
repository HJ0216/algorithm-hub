class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        
        int[] missings = new int[photo.length];
        
        int index = 0;
        for(String[] people : photo){            
            for(String person : people){
                for(int i=0; i<name.length; i++){
                    if(i>=yearning.length){
                        break;
                    }
                    
                    if(person.equals(name[i])){
                        missings[index] += yearning[i];
                    }
                }
            }
            
            index++;
        }
        
        return missings;
    }
}