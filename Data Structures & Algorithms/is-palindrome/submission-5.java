class Solution {
    public boolean isPalindrome(String s) {
        //step 1: pointer varaible doretmeli
        int left = 0, right = s.length() - 1;

        //step 2: left pointer right pointer bilen denlesyanca
        //        loop etmeli
        while(left < right) {
            // step 3: string-den boshluk we punctuation-lary ayyrmaly
            while(left < right && !isAlphaNum(s.charAt(left))) {
                left++;
            }
            while(left < right && !isAlphaNum(s.charAt(right))) {
                right--;
            }
            //step 4: left char bilen right char deneshdirmeli eger
            //        menzesh dal bolsa return false
            
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            // step 5: left artdyryan, right kemeldyan
            left++;
            right--;
        }

        // step 6: eger loop-dan cykyp bilse string palindrom bolya
        return true;
    }

    private boolean isAlphaNum(char c) {
        return (c >= 'A' && c <= 'Z' || 
                c >= 'a' && c <= 'z' || 
                c >= '0' && c <= '9') ;
    }
}
