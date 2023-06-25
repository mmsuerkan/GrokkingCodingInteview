package org.codingproblems.twopointers.validpalindrome;

public class Main{
    public static boolean isPalindrome(String s) {

        int first = 0;
        int last = s.length() -1;

        while(first < last){
            if(s.charAt(first) != s.charAt(last)){
                return false;
            }
            first += 1;
            last -= 1;
        }



        return true;
    }

}