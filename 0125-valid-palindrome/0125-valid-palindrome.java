class Solution {
    public static String removeNonAlphaNumeric(String str){
        return str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }
    public boolean isPalindrome(String s) {
        String str = removeNonAlphaNumeric(s);
        System.out.println(str);
        int left = 0;
        int right = str.length()-1;
        while(left<=right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }else{
                left++;
                right--;
            }
        }
        return true;
    }
}