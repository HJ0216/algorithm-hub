class Solution {
  public boolean solution(String s) {
      if(s.length() != 4 && s.length() != 6) return false;
      
      char[] chars = s.toCharArray();
      for(char c : chars){
          if(c < '0' || c > '9') return false;
      }
      
      return true;
  }
}
