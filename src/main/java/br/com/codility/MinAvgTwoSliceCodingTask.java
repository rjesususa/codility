package br.com.codility;

/**
 * Created by rjesus on 14/05/19.
 */
public class MinAvgTwoSliceCodingTask {
    int[] integers;

    public MinAvgTwoSliceCodingTask(int[] integers) {
        this.integers = integers;
    }

    public int returnsTheSmallestStartingPositionOfSuchASlice() {

        int lastElement = integers[integers.length - 1];
        double lastSmallestSum = Double.MAX_VALUE;
        int smallestStartingPosition = 0;

        for (int i = 0; i < integers.length - 1; i++) {
            final double sumOfNextElement = ((double) integers[i] + integers[i + 1]) / 2;

            boolean isTheLastElement = integers[i + 1] == lastElement;
            if (!isTheLastElement) {
                final double sumOfTwoNextElements = ((double) integers[i] + integers[i + 1] + integers[i + 2]) / 3;

                if (sumOfNextElement < sumOfTwoNextElements && sumOfNextElement < lastSmallestSum) {
                    lastSmallestSum = sumOfNextElement;
                    smallestStartingPosition = i;
                } else if (sumOfTwoNextElements < lastSmallestSum) {
                    lastSmallestSum = sumOfTwoNextElements;
                    smallestStartingPosition = i;
                }
            } else {
                if (sumOfNextElement < lastSmallestSum) {
                    lastSmallestSum = sumOfNextElement;
                    smallestStartingPosition = i;
                }
            }

        }

        return smallestStartingPosition;
    }
}