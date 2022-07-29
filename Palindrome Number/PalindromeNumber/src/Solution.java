//Cho Cheung
//07/28/200
//LeetCode Project
//Palindrome Number



public class Solution {

    public static boolean isPalindrome (int x) {
        if (x == 0) {
            return true;
        }
        if (x < 0 || x % 10 == 0) {
            return false;
        }
        int reversed_int = 0;
        while(x > reversed_int) {
            int pop = x % 10; //grab last digit
            x /= 10; //chopping of last digit
            reversed_int = (reversed_int * 10) + pop; //putting that digit into int
        }
        if(x == reversed_int || x == reversed_int / 10) { //check for odd digits
            return true;
        }
        else {
            return false;
        }
    }
}
