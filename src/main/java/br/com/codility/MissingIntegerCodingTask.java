package br.com.codility;

/**
 * Created by rjesus on 08/05/19.
 */
public class MissingIntegerCodingTask {
    private static final int MAX_RANGE = 100000001;
    int[] numbers;

    public MissingIntegerCodingTask(int[] numbers) {
        this.numbers = numbers;
    }

    public int retrieveTheSmallestPositiveMissingNumber() {

        boolean[] isARepeatableNumber = new boolean[MAX_RANGE];

        for (int number : numbers) {
            if (number <= 0) continue;

            if (!isARepeatableNumber[number]) {
                isARepeatableNumber[number] = true;
            }
        }

        for (int i = 1; i < isARepeatableNumber.length; i++) {
            if (!isARepeatableNumber[i]) return i;
        }
        return MAX_RANGE;
    }
}