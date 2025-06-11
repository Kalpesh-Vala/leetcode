class Solution {
    public int lengthOfLongestSubstring(String s) {
       int[] index = new int[128];
       int maxLength = 0;

       for(int i=0,j=0; j < s.length(); j++){
        i = Math.max(index[s.charAt(j)], i);
        maxLength = Math.max(maxLength, j - i + 1);
        index[s.charAt(j)] = j+1;
       }

       return maxLength;
    }
}