package org.codingproblems.twopointers.reversewordInastring;


import java.util.Arrays;

public class Main{
    public static String reverseWords(String sentence) {

        int i = 0;
        int j = 0;
        int n = sentence.length();
        char[] reversed = sentence.toCharArray();
        String result = "";
        while(j < n){
            while(j < n && reversed[j] != ' '){
                j++;
            }
            result = reverse(Arrays.toString(reversed), i, j-1);
            j++;
            i = j;
        }

        return reverse(result, 0, n-1);
    }

    private static String reverse(String sentence, int i, int j) {

        char[] reversed = sentence.toCharArray();

        while(i < j){
            char temp = reversed[i];
            reversed[i] = reversed[j];
            reversed[j] = temp;
            i++;
            j--;
        }

        return new String(reversed);
    }
}
