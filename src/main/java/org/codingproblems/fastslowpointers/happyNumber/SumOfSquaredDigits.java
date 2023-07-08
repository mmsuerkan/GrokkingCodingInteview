package org.codingproblems.fastslowpointers.happyNumber;

public class SumOfSquaredDigits {

    public static int sumOfSquaredDigits(int num) {
        int sum  = 0;

        while(num != 0) {
            int digit = num % 10;
            num = num / 10;
            sum += digit * digit;
        }

        return sum;
    }
}
