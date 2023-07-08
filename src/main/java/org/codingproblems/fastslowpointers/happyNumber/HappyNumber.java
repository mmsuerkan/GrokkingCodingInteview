package org.codingproblems.fastslowpointers.happyNumber;

public class HappyNumber {

    public static boolean isHappyNumber(int number) {

        int slow = number;
        int fast = SumOfSquaredDigits.sumOfSquaredDigits(number);

        while (fast != 1 && fast != slow){
            slow = SumOfSquaredDigits.sumOfSquaredDigits(slow);
            fast = SumOfSquaredDigits.sumOfSquaredDigits(SumOfSquaredDigits.sumOfSquaredDigits(fast));
        }

        return fast == 1;
    }
}
