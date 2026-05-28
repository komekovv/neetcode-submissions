class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length()-1;

        while(left < right) {
            if(!isAlphaNum(s.charAt(left))) {
                left++;
                continue;
            }
            if(!isAlphaNum(s.charAt(right))) {
                right--;
                continue;
            }

            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) return false;
            
            left++;
            right--;
        }

        return true;
    }

    private boolean isAlphaNum(char c) {
        return 
            (c >= 'A' && c <= 'Z') ||
            (c >= 'a' && c <= 'z') ||
            (c >= '0' && c <= '9');
    }
}
