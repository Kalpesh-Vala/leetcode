class Solution {
    public int lengthOfLongestSubstring(String s) {
       int i=0,j=0,maxLength=0;
       int n=s.length();

       HashSet<Character> seen = new HashSet<>();
       
       while(j<n){
        if(!seen.contains(s.charAt(j))){
            seen.add(s.charAt(j));
            j++;
            maxLength = Math.max(maxLength, j - i);
        }else{
            seen.remove(s.charAt(i));
            i++;
        }
       }
       return maxLength;
    }
}