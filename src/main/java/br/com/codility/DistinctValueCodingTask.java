package br.com.codility;

/**
 * Created by rjesus on 21/05/19.
 */
public class DistinctValueCodingTask {
    private static final int LIMIT_OF_RANGE = 1000000;
    int[] integers;

    public DistinctValueCodingTask(int[] integers) {
        this.integers = integers;
    }

    public int countDistinctValues() {
        boolean[] negativeNumbers = new boolean[LIMIT_OF_RANGE];
        boolean[] positiveNumbers = new boolean[LIMIT_OF_RANGE];
        int countDistinctValues = 0;

        for (int i : integers) {
            if (i < 0) {
                int value = i + (2 * (-1 * i));

                if (!negativeNumbers[value]) {
                    negativeNumbers[value] = true;
                    countDistinctValues++;
                }
            } else {
                if (!positiveNumbers[i]) {
                    positiveNumbers[i] = true;
                    countDistinctValues++;
                }
            }
        }

        return countDistinctValues;
    }
}
